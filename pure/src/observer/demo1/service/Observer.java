package observer.demo1.service;

/**
 * 观察者接口
 */
public interface Observer {
    public int type = 0;

    void update(String msg);
}
