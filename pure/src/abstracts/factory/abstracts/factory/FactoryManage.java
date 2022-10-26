package abstracts.factory.abstracts.factory;

import abstracts.factory.servcie.factory.AbstractFactory;

/**
 * @author hj.luo
 * @date 2022-10-26 15:13
 * @descripitions
 */
public class FactoryManage {
    public static AbstractFactory getFactory(String type){
        if ("WDLYF".equals(type)){
            return new WDLYFFactory();
        }
        if ("ZGF".equals(type)){
            return new ZGFFactory();
        }
        return null;
    };
}
