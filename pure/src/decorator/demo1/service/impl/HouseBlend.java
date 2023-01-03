package decorator.demo1.service.impl;

import decorator.demo1.service.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
