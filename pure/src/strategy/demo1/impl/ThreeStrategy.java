package strategy.demo1.impl;

import strategy.demo1.Strategy;

public class ThreeStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("策略---(3)");
    }
}
