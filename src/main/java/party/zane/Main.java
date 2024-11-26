package party.zane;


public class Main {
    public static void main(String[] args) {
        SubjectImpl observable = new SubjectImpl();

        ObserverImpl observer1 = new ObserverImpl("观察者 1 ：");
        ObserverImpl observer2 = new ObserverImpl("观察者 2 ：");

        observable.registerObserver(observer1);
        observable.registerObserver(observer2);

        observable.notifyAllObservers();
    }
}