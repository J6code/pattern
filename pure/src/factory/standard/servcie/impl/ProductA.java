package factory.standard.servcie.impl;

import factory.standard.servcie.Product;

/**
 * @author hj.luo
 * @date 2022-10-25 13:36
 * @descripitions 产品A
 */
public class ProductA implements Product {
    @Override
    public void doSuff() {
        System.out.println("AAAA~~~~");
    }
}
