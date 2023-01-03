package observer.demo1.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题接口
 */
public interface Subject {
    public List<Observer> list = new ArrayList<>();

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
