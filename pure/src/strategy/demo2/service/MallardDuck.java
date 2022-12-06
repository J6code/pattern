package strategy.demo2.service;

import strategy.demo2.service.impl.FlyWithWings;
import strategy.demo2.service.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard duck");
    }
}
