package adapter.demo2.main;

import adapter.demo2.service.Duck;
import adapter.demo2.service.Turkey;
import adapter.demo2.service.impl.MallardDuck;
import adapter.demo2.service.impl.TurkeyToDuckAdapter;
import adapter.demo2.service.impl.WildTurkey;

public class doRun {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        DuckMock.run(duck);

        System.out.println("将火鸡插入鸭子适配器，使用鸭子模拟器运行。");

        Turkey turkey = new WildTurkey();
        DuckMock.run(new TurkeyToDuckAdapter(turkey));
    }

    public static class DuckMock {
        public static void run(Duck duck) {
            System.out.println("鸭子模拟器：[");
            duck.fly();
            duck.quack();
            System.out.println("]");
        }
    }
}
