package observer.demo1.main;

import observer.demo1.service.Impl.observer.ObserverOne;
import observer.demo1.service.Impl.observer.ObserverThree;
import observer.demo1.service.Impl.observer.ObserverTwo;
import observer.demo1.service.Impl.subject.SubjectOne;

public class doRun {
    public static void main(String[] args) {
        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();
        ObserverThree observerThree = new ObserverThree();
        SubjectOne subjectOne = new SubjectOne();
        subjectOne.registerObserver(observerOne);
        subjectOne.registerObserver(observerTwo);
        subjectOne.update();
        subjectOne.removeObserver(observerTwo);
        subjectOne.update();
    }
}
