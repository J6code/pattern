package factory.standard.factory;

import factory.standard.servcie.Product;
import factory.standard.servcie.impl.ProductA;
import factory.standard.servcie.impl.ProductB;

/**
 * @author hj.luo
 * @date 2022-10-25 15:44
 * @descripitions 工厂管理工具
 */
public class Creator {
    public static Product getFactory(Integer type){
        if (type == 1) return new ProductA();
        if (type == 2) return new ProductB();
        else return null;
    }
}
