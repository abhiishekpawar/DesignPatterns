package org.DesignPattern.BuilderPattern;

public class Tester {

    public static void main(String[] args) {

        User test = User.builder().setUserId("123")
                .setName("test")
                .setEmailId("test@dev.in")
                .build();

        System.out.println(test.getEmailId());
    }
}
