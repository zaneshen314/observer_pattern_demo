package party.zane;

/**
 * 被观察者接口
 */
public interface ISubject {

    void registerObserver(IObserver observer);

    void unregisterObserver(IObserver observer);

    void notifyAllObservers();

}
