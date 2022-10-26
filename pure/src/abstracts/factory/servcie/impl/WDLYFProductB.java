package abstracts.factory.servcie.impl;

import abstracts.factory.servcie.ProductB;

/**
 * @author hj.luo
 * @date 2022-10-26 14:44
 * @descripitions
 */
public class WDLYFProductB implements ProductB {
    @Override
    public void doJob() {
        System.out.println("WDLYF~~~ 【ProductB】");
    }
}
