package strategy.demo2.service.impl;

import strategy.demo2.service.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying!!!");
    }
}
