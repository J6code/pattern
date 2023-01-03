package observer.demo1.service.Impl.subject;

import observer.demo1.service.Observer;
import observer.demo1.service.Subject;

import java.util.List;

public class SubjectOne implements Subject {
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        List<Observer> collect = list;
        for (int i = 0; i < collect.size(); i++) {
            if (observer.type == collect.get(i).type) {
                list.remove(observer);
                break;
            }
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update("SubjectOne 更新了" + System.currentTimeMillis());
        }
    }

    public void update() {
        System.out.println("SubjectOne 更新");
        this.notifyObservers();
    }
}
