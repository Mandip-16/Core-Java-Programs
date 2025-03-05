package DesignPattern.LearnObserver;

interface Subject {

    void subScribe(Observer ob);
    void unSubScribe(Observer ob);
    void notifyChange();
}
