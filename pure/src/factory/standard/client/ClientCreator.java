package factory.standard.client;

import factory.standard.factory.Creator;

/**
 * @author hj.luo
 * @date 2022-10-25 15:43
 * @descripitions 客户端
 */
public class ClientCreator {
    public static void main(String[] args) {
        // 客户端只需要传入type即可
        Creator.getFactory(1).doSuff();
        Creator.getFactory(2).doSuff();
    }
}