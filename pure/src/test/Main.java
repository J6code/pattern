package test;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.*;

public class Main {

    /*数组字符串拆分成数组*/
    public static List<Integer> text_split(String var)
    {
        var = var.substring(1,var.length()-1);
        String[] var_s = var.split(",");
        //int[] res = new int[var_s.length];
        List<Integer>res = new ArrayList<>();
        for (int i=0;i<var_s.length;i++)
        {
            if(!var_s[i].isEmpty())
                //res[i] = Integer.parseInt(var_s[i].trim());
                res.add(Integer.parseInt(var_s[i].trim()));
        }
        return  res;
    }

    /*根据基础问卷计算用户运动水平
    * 初始level=6
    * 年龄:
    * **>50：-1
    * **<35：+1
    * bmi
    * **大于28：-2
    * **18.4—24：+1
    * **<=18.4：-1
    * 有疾病史：-1
    * 有健康状况不适症状：-1
    * 运动情况：
    * **无运动-1；
    * **每周3-5次+1，
    * **每周>5次+2
    * */
    public static int user_level_base(Map<String, String> questionnaire_info)
    {
        int age = Integer.parseInt((String) questionnaire_info.get("age"));
        float height = Float.parseFloat((String) questionnaire_info.get("height"));
        height = (float) (height/100.0);
        float weight = Float.parseFloat((String) questionnaire_info.get("weight"));
        float bmi = weight/(height*height);
        List<Integer> medicalHistory = text_split((String) questionnaire_info.get("medicalHistory"));
        int exerciseFrequency = Integer.parseInt((String) questionnaire_info.get("exerciseFrequency"));
        List<Integer> healthStatus = text_split((String) questionnaire_info.get("healthStatus"));
        List<Integer> healthStatus_ls = new ArrayList<Integer>();
        for (int i=0;i<healthStatus.size();i++)
        {
            if (healthStatus.get(i)!=0)
                healthStatus_ls.add(healthStatus.get(i));
        }

        int level = 6;
        //年龄
        if (age>50)
        {
            level = level-1;
        } else if (age<=35)
        {
            level = level+1;
        }
        //bmi
        if (bmi>=28)
        {
            level = level-2;
        } else if (bmi<=18.4)
        {
            level=level-1;
        } else if (bmi<24)
        {
            level = level+1;
        }


        //疾病史
        if (!medicalHistory.isEmpty())
        {
            level = level-1;
        }

        //健康状况
        if(!healthStatus_ls.isEmpty())
        {
            level = level-1;
        }

        //运动频率 0-无运动；1-每周<3次；2-每周3-5次；3-每周＞5次
        switch (exerciseFrequency)
        {
            case 1:
                level = level-1;
                break;
            case 3:
                level = level+1;
                break;
            case 4:
                level = level+2;
                break;
            default:
                break;
        }

        if (level<2)
        {
            level=2;
        }
        if (level>8)
        {
            level=8;
        }
        return level;
    }


    /*根据调整问卷更新用户运动水平
     * 运动强度：
     * **偏高：-1
     * **偏低：+1
     * 有不适症状：-1
     * 出现疼痛：
     * **1-3：-1
     * **4-6：-2
     * **>=7：level=1
     * */
    public static int user_level_adjust(Map<String, String> questionnaire_info, int user_level_origin)
    {
        int level = user_level_origin;
        int exerciseIntensity = Integer.parseInt((String) questionnaire_info.get("exerciseIntensity"));//运动强度：1-适中；2-偏高；3-偏低
        List<Integer> discomfortSymptoms = text_split((String) questionnaire_info.get("discomfortSymptoms"));
        List<Integer> painPresent = text_split((String) questionnaire_info.get("painPresent"));
        int painAssessment = Integer.parseInt((String) questionnaire_info.get("painAssessment"));
        switch (exerciseIntensity)
        {
            case 2:
                level = level-1;
                break;
            case 3:
                level = level+1;
                break;
            default:
                break;
        }

        if (!discomfortSymptoms.isEmpty())
        {
            level = level-1;
        }

        if (!painPresent.isEmpty()) {
            if (painAssessment < 4) {
                level = level - 1;
            } else if (painAssessment < 7) {
                level = level - 2;
            } else {
                level = 1;
            }

            if (level < 1) {
                level = 1;
            }
            if (level > 10) {
                level = 10;
            }
        }
        return level;
    }

    //vedio_info：视频url，每个运动强度的不同组合用列表，不同强度用字典
    /*获取运动视频
    * 参数：
    * **vedio_info：视频信息
    * **user_level_origin：用户原运动水平，如果第一次获取，则设置为-1
    * **user_level_update：更新后的运动水平
    * **vedio_num_origin：原视频编号，，如果第一次获取，则设置为-1
    * **change_flag：是否更换视频flag，默认为0
    * */
    public static int get_vedio_num(Map<Integer, String> vedio_info, int user_level_origin, int user_level_update, int vedio_num_origin, int change_flag)
    {
        int vedio_num_new = vedio_num_origin;
        int intensity = user_level_update;
        int index = 0;
        List<Integer> intensity_vedio_arr = text_split((String) vedio_info.get(intensity));
        if (user_level_update!=user_level_origin)
        {
            index = new Random().nextInt(intensity_vedio_arr.size());
            vedio_num_new = intensity_vedio_arr.get(index);
        }
        else if(change_flag==1)
        {
            List<Integer>intensity_vedio_list = new ArrayList<Integer>();
            for (int j : intensity_vedio_arr) {
                if (j != vedio_num_origin) {
                    intensity_vedio_list.add(j);
                }
            }
            if (!intensity_vedio_list.isEmpty())
            {
                index = new Random().nextInt(intensity_vedio_list.size());
                vedio_num_new = intensity_vedio_list.get(index);
            }
        }
        return vedio_num_new;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Map<String,String>questionnaire_info = new HashMap<String, String>();
        questionnaire_info.put("age","60");
        questionnaire_info.put("height","170");
        questionnaire_info.put("weight","85");
        questionnaire_info.put("medicalHistory","[2,3,4]");
        questionnaire_info.put("exerciseFrequency","1");
        questionnaire_info.put("healthStatus","[0]");

        Map<Integer,String>vedio_info = new HashMap<Integer, String>();
        vedio_info.put(1,"[1]");
        vedio_info.put(2,"[2]");
        vedio_info.put(3,"[3]");
        vedio_info.put(4,"[4]");
        vedio_info.put(5,"[5]");
        vedio_info.put(6,"[6]");
        vedio_info.put(7,"[7]");
        vedio_info.put(8,"[8]");
        vedio_info.put(9,"[9]");
        vedio_info.put(10,"[10]");


        Map<String,String>questionnaire_adjust_info = new HashMap<String, String>();
        questionnaire_adjust_info.put("exerciseIntensity", "1");
        questionnaire_adjust_info.put("discomfortSymptoms", "[1, 2, 3]");
        questionnaire_adjust_info.put("painPresent", "[1, 2, 3]");
        questionnaire_adjust_info.put("painAssessment", "5");

        int user_level = user_level_base(questionnaire_info);
        System.out.println(questionnaire_info);
        float height = Float.parseFloat((String) questionnaire_info.get("height"));
        height = (float) (height/100.0);
        float weight = Float.parseFloat((String) questionnaire_info.get("weight"));
        float bmi = weight/(height*height);
        System.out.println("bmi:"+String.valueOf(bmi));

        System.out.println("user level:"+ String.valueOf(user_level));
        int vedio_num = get_vedio_num(vedio_info, -1, user_level, -1, 0);
        System.out.println("init video num:"+ String.valueOf(vedio_num));
        int user_level_origin = user_level;
        user_level = user_level_adjust(questionnaire_adjust_info, user_level);
        System.out.println("user level update:"+ String.valueOf(user_level));
        vedio_num = get_vedio_num(vedio_info, user_level_origin, user_level, vedio_num, 0);
        System.out.println("vedio num update:"+ String.valueOf(vedio_num));

    }
}