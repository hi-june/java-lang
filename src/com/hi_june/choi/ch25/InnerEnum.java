package com.hi_june.choi.ch25;

class Customer {
    enum Gender {
        MALE, FEMALE
    }

    private String name;
    private Gender gender;

    Customer(String name, String gender) {
        this.name = name;

        if(gender.equals("man"))
            this.gender = Gender.MALE;
        else
            this.gender = Gender.FEMALE;
    }

    @Override
    public String toString() {
        if (gender == Gender.MALE)
            return "Thank you, Mr " + name;
        else
            return "Thank you, Ms " + name;
    }
}

public class InnerEnum {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Brown", "man");
        Customer customer2 = new Customer("Susan Hill", "woman");

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
