package abstracts.factory.servcie.factory;

import abstracts.factory.servcie.ProductA;
import abstracts.factory.servcie.ProductB;

/**
 * @author hj.luo
 * @date 2022-10-26 14:03
 * @descripitions
 */
public interface AbstractFactory {
    ProductA doProductTypeA();
    ProductB doProductTypeB();
}
