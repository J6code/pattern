package adapter.demo2.service.impl;

import adapter.demo2.service.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("火鸡-叫");
    }

    @Override
    public void fly() {
        System.out.println("火鸡-飞");
    }
}
