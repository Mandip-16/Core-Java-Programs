package DesignPattern.LearnIterator;

public class Main {

    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("man","1"));
        userManagement.addUser(new User("deep","2"));
        userManagement.addUser(new User("mandeep","3"));
        userManagement.addUser(new User("naman","4"));

        MyIterator myIterator = userManagement.getIterator();
        while (myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getUserId() + " " + user.getName());
        }
    }
}
