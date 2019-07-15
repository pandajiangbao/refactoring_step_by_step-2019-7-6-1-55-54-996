package com.tws.refactoring;

public class Driver {
    private int age;
    public static final Integer ADULT_LIMIT=18;
    public Driver(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
