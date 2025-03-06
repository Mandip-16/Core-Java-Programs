package DesignPattern.Builder;

public class Test {

    public static void main(String[] args) {
        User user1 = new User.userBuilder().setUserId(1).setUserName("mandeep").setEmailId("mandeep@123").build();
        User user2 = new User.userBuilder().setUserId(2).setUserName("deep").setEmailId("deep@123").build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
