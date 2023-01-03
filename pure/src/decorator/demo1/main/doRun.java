package decorator.demo1.main;

import decorator.demo1.service.Beverage;
import decorator.demo1.service.impl.Condiment.Milk;
import decorator.demo1.service.impl.Condiment.Mocha;
import decorator.demo1.service.impl.Espresso;

public class doRun {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription());

        Mocha mocha = new Mocha(espresso);
        System.out.println(mocha.getDescription());

        Milk milk = new Milk(mocha);
        System.out.println(milk.getDescription());

        Milk milk1 = new Milk(milk);
        System.out.println(milk1.getDescription());
    }
}
