package com.hi_june.choi.ch11;

public class StringConcat {
    public static void main(String[] args) {
        String st1 = "Coffee";
        String st2 = "Bread";

        String st3 = st1.concat(st2);

        System.out.println(st3);    // CoffeBread
    }
}
