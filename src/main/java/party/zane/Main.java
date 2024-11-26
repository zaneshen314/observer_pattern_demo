package party.zane;


import party.zane.impl.CaptainObserverImpl;
import party.zane.impl.WeatherMonitoringImpl;

public class Main {
    public static void main(String[] args) {
        WeatherMonitoringImpl observable = new WeatherMonitoringImpl();

        CaptainObserverImpl observer1 = new CaptainObserverImpl("Don");
        CaptainObserverImpl observer2 = new CaptainObserverImpl("Zane");

        observable.registerObserver(observer1);
        observable.registerObserver(observer2);

        observable.notifyAllObservers();
    }
}