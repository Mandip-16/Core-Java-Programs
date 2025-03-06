package DesignPattern.LearnObserver;

public class Demo {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber aman = new Subscriber("aman");
        Subscriber rohan = new Subscriber("rohan");

        channel.subScribe(rohan);
        channel.subScribe(aman);
        channel.notifyChange();
    }
}
