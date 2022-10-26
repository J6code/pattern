package abstracts.factory.abstracts.factory;

import abstracts.factory.servcie.ProductA;
import abstracts.factory.servcie.ProductB;
import abstracts.factory.servcie.factory.AbstractFactory;
import abstracts.factory.servcie.impl.WDLYFProductA;
import abstracts.factory.servcie.impl.WDLYFProductB;

/**
 * @author hj.luo
 * @date 2022-10-26 14:02
 * @descripitions
 */
public class WDLYFFactory implements AbstractFactory {
    @Override
    public ProductA doProductTypeA() {
        return new WDLYFProductA();
    }

    @Override
    public ProductB doProductTypeB() {
        return new WDLYFProductB();
    }
}
