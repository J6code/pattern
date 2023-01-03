package observer.demo1.service.Impl.observer;

import observer.demo1.service.Observer;

public class ObserverTwo implements Observer {
    public int type = 2;
    @Override
    public void update(String msg) {
        System.out.println("ObserverTwo 收到 主题更新" + msg);
    }
}
