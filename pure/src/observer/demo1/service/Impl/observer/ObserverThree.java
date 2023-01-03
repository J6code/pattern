package observer.demo1.service.Impl.observer;

import observer.demo1.service.Observer;

public class ObserverThree implements Observer {
    public int type = 3;
    @Override
    public void update(String msg) {
        System.out.println("未订阅" + msg);
    }
}
