package DesignPattern.LearnIterator;

import java.util.ArrayList;

public class UserManagement {

    private ArrayList<User> userlist = new ArrayList();

    public void addUser(User user) {
        userlist.add(user);
    }

    public User getUser(int index) {
        return userlist.get(index);
    }

    public MyIterator getIterator() {
        return new MyIteratorImpl(userlist);
    }
}
