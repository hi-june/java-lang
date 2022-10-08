package com.hi_june.choi.ch04;

public class SCE {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        boolean result;

        result = ((num1 += 10)<0) && ((num2 += 10) > 0);    // 앞 조건문에서 false를 반환하고, and 연산이 수행되기 때문에 뒷 연산이 생략된다.
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + '\n');

        result = ((num1 += 10) > 0) || ((num2 += 10) > 0);  // 앞 조건문에서 true를 반환하고, or 연산이 수행되기 때문에 뒷 연산이 생략된다.
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
