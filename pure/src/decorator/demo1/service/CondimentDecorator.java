package decorator.demo1.service;

/**
 * 调料抽象类，实现饮料抽象类:目的是使调料装饰饮料
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
