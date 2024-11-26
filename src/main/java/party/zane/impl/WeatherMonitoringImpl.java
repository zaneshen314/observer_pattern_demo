package party.zane.impl;

import party.zane.IObserver;
import party.zane.ISubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherMonitoringImpl implements ISubject {

    private final List<IObserver> mObserversList = new ArrayList<>();

    @Override
    public void registerObserver(IObserver observer) {
        mObserversList.add(observer);
    }

    @Override
    public void unregisterObserver(IObserver observer) {
        mObserversList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        System.out.println("【气象检测】台风将至，所有航班立即停航！");
        mObserversList.forEach(IObserver::response);
    }
}