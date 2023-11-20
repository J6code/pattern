package pipeline.demo1.service.impl;

import pipeline.demo1.service.Pipeline;
import pipeline.demo1.service.PipelineContext;
import pipeline.demo1.service.PipelineValue;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准通道
 *
 * @author hj.luo
 * @Date 2023-11-20 13:47
 * @descripition
 * @version: 1.0
 */
public class StandardPipeline implements Pipeline {

    private List<PipelineValue> pipelineValueList = new ArrayList();

    @Override
    public boolean invoke(PipelineContext context) {
        boolean isResult = true;
        for (PipelineValue pipelineValue : pipelineValueList) {
            try {
                boolean executeResult = pipelineValue.execute(context);
                if (!executeResult) {
                    System.out.println(pipelineValue.getClass().getSimpleName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isResult;
    }

    @Override
    public boolean addValue(PipelineValue pipelineValue) {
        if (pipelineValueList.contains(pipelineValue)) {
            return true;
        }
        return pipelineValueList.add(pipelineValue);
    }

    @Override
    public boolean removeValue(PipelineValue pipelineValue) {
        return pipelineValueList.add(pipelineValue);
    }
}
