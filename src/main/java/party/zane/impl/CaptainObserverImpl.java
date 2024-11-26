package party.zane.impl;

import party.zane.IObserver;

public class CaptainObserverImpl implements IObserver {

    private static final String TAG = "船长：";
    private final String observerName;

    public CaptainObserverImpl(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void response() {
        System.out.println(TAG + observerName + "，收到停航通知");

    }
}
