package factory.standard.client;

import factory.standard.factory.Creator;

/**
 * @author hj.luo
 * @date 2022-10-25 15:43
 * @descripitions
 */
public class ClientCreator {
    public static void main(String[] args) {
        Creator.getFactory(1).doSuff();
        Creator.getFactory(2).doSuff();
    }
}