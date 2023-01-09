package adapter.demo2.service.impl;

import adapter.demo2.service.Duck;
import adapter.demo2.service.Turkey;

public class TurkeyToDuckAdapter implements Duck {
    Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
