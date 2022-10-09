package com.prac.choi.ch10;

public class Accumulator {
    static int result = 0;

    static void add(int i){
        result += i;
    }

    static void showResult() {
        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Accumulator.add(i);
        }
        Accumulator.showResult();
    }
}
