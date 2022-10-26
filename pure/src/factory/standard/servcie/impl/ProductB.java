package factory.standard.servcie.impl;

import factory.standard.servcie.Product;

/**
 * @author hj.luo
 * @date 2022-10-25 15:25
 * @descripitions 产品B
 */
public class ProductB implements Product {
    @Override
    public void doSuff() {
        System.out.println("BBBB~~~~");
    }
}
