package com.hi_june.choi.ch26;

interface Printable {
    void print(String s);
}

public class LambdaExample {
    public static void main(String[] args) {
        Printable prn = (s) -> { System.out.println(s); };
        prn.print("What is Lambda");
    }
}
