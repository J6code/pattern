package adapter.demo1.client;

import adapter.demo1.service.impl.ProductA;
import adapter.demo1.service.impl.ProductAAdapterProductB;
import adapter.demo1.service.impl.ProductB;
import adapter.demo1.service.impl.ProductBManage;

/**
 * @author hj.luo
 * @date 2022-10-27 16:48
 * @descripitions 适配器模式客户端
 */
public class AdapterClient {
    public static void main(String[] args) {
        ProductBManage.useProductB(new ProductB());
        ProductBManage.useProductB(new ProductAAdapterProductB(new ProductA()));
    }
}