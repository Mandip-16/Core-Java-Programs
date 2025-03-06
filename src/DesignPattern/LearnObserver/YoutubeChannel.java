package DesignPattern.LearnObserver;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> Subscribers = new ArrayList<>();

    @Override
    public void subScribe(Observer ob) {
        this.Subscribers.add(ob);
    }

    @Override
    public void unSubScribe(Observer ob) {
        this.Subscribers.remove(ob);
    }

    @Override
    public void notifyChange() {
        for (Observer ob: this.Subscribers) {
            ob.notified();
        }
    }
}
