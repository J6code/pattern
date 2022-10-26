package abstracts.factory.servcie.impl;

import abstracts.factory.servcie.ProductA;

/**
 * @author hj.luo
 * @date 2022-10-26 14:44
 * @descripitions
 */
public class WDLYFProductA implements ProductA {
    @Override
    public void doJob() {
        System.out.println("WDLYF~~~ 【ProductA】");
    }
}
