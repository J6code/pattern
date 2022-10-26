package abstracts.factory.servcie.impl;

import abstracts.factory.servcie.ProductA;
import abstracts.factory.servcie.ProductB;

/**
 * @author hj.luo
 * @date 2022-10-26 14:44
 * @descripitions
 */
public class ZGFProductB implements ProductB {
    @Override
    public void doJob() {
        System.out.println("ZGF~~~ 【ProductB】");
    }
}
