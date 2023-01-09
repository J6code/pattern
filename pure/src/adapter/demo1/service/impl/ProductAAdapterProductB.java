package adapter.demo1.service.impl;

/**
 * @author hj.luo
 * @date 2022-10-27 16:36
 * @descripitions 适配器
 */
public class ProductAAdapterProductB extends ProductB {
    private ProductA productA;

    public ProductAAdapterProductB(ProductA productA) {
        this.productA = productA;
    }

    public void doJob() {
        productA.doProductA();
    }
}
