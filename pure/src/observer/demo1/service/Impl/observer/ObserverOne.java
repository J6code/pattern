package observer.demo1.service.Impl.observer;

import observer.demo1.service.Observer;

public class ObserverOne implements Observer {
    public int type = 1;

    @Override
    public void update(String msg) {
        System.out.println("ObserverOne 收到 主题更新" + msg);
    }
}
