package abstracts.factory.abstracts.factory;

import abstracts.factory.servcie.ProductA;
import abstracts.factory.servcie.ProductB;
import abstracts.factory.servcie.factory.AbstractFactory;
import abstracts.factory.servcie.impl.ZGFProductA;
import abstracts.factory.servcie.impl.ZGFProductB;

/**
 * @author hj.luo
 * @date 2022-10-26 14:09
 * @descripitions
 */
public class ZGFFactory implements AbstractFactory {
    @Override
    public ProductA doProductTypeA() {
        return new ZGFProductA();
    }

    @Override
    public ProductB doProductTypeB() {
        return new ZGFProductB();
    }
}
