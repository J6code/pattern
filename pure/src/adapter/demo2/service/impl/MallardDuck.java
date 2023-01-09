package adapter.demo2.service.impl;

import adapter.demo2.service.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("真鸭子-鸭子叫");
    }

    @Override
    public void fly() {
        System.out.println("真鸭子-飞");
    }
}
