package party.zane;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements ISubject {

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
        for (IObserver observer : mObserversList) {
            observer.response();
        }
    }
}