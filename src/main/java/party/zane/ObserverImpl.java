package party.zane;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl implements IObserver {

    private static final String TAG = "ObserverImpl";
    private final String observerName;

    public ObserverImpl(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void response() {
        System.out.println(TAG + observerName + "收到通知");

    }
}
