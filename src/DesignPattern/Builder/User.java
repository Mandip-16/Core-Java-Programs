package DesignPattern.Builder;

public class User {

    private String userName;
    private int userId;
    private String emailId;

    private User(userBuilder builder) {
        this.emailId = builder.emailId;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public static class userBuilder {
        private String userName;
        private int userId;
        private String emailId;

        public userBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public userBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public userBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }

}
