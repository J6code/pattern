package decorator.demo1.service;

/**
 * 饮料抽象类
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
