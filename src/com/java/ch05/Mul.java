package com.java.ch05;

public class Mul {
    public static void main(String[] args) {
        int result = 1;

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            result *= i;
        }

        System.out.println(result);
    }
}
