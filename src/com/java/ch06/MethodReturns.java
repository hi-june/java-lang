package com.java.ch06;

public class MethodReturns {
    public static void main(String[] args) {
        int result;
        result = adder(4,5);
        System.out.println(result);
        System.out.println(square(3));
    }

    public static int adder(int a, int b) {
        int addResult = a+b;
        return addResult;
    }

    public static double square(double a) {
        return a*a;
    }
}