package DesignPattern.Prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating object using prototype design");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("123.456.789");
        networkConnection.setImportantData("Very important massage");

        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
