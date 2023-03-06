package com.hi_june.choi.ch25;

enum Human {
    MAN(29), WOMAN(25);
    int age;

    private Human(int age) {
        this.age = age;
        System.out.println("Human Constructor called");
    }

    @Override
    public String toString() {
        return "I am " + age + " years old!";
    }
}

public class EnumExample {
    public static void main(String[] args) {
        System.out.println(Human.MAN);
        System.out.println(Human.WOMAN);
    }
}
