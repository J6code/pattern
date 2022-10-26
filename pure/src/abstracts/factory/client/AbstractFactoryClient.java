package abstracts.factory.client;

import abstracts.factory.abstracts.factory.FactoryManage;
import abstracts.factory.servcie.factory.AbstractFactory;

/**
 * @author hj.luo
 * @date 2022-10-26 13:59
 * @descripitions 抽象工厂客户端
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {
        // 案例1
        String type = "WDLYF";
        AbstractFactory wdlyfFactory = FactoryManage.getFactory(type);
        wdlyfFactory.doProductTypeA().doJob();
        wdlyfFactory.doProductTypeB().doJob();

        // 案例2
        type = "ZGF";
        AbstractFactory zgfFactory = FactoryManage.getFactory(type);
        zgfFactory.doProductTypeA().doJob();
        zgfFactory.doProductTypeB().doJob();
    }
}
