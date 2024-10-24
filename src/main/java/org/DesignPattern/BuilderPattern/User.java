package org.DesignPattern.BuilderPattern;

public class User {
    private final String name;
    private final String emailId;
    private final String userId;

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getUserId() {
        return userId;
    }

    private User(UserBuilder builder) {
        this.emailId = builder.emailId;
        this.userId = builder.userId;
        this.name = builder.name;
    }

    // Static method to return a new UserBuilder instance
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    // Inner class to create the User object
    public static class UserBuilder {
        private String name;
        private String emailId;
        private String userId;

        public UserBuilder() {
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
