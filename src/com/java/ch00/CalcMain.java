package com.java.ch00;

import java.util.Scanner;

class Calc{
    double sum(double a, double b) {
        return a+b;
    }
    double sub(double a, double b) {
        return a-b;
    }
    double mul(double a, double b) {
        return a*b;
    }
    double div(double a, double b) {
        return a/b;
    }
}

public class CalcMain {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st num: ");
        double a = scanner.nextDouble();

        System.out.print("2nd num: ");
        double b = scanner.nextDouble();

        System.out.println("\nsum: " + calc.sum(a,b));
        System.out.println("sub: " + calc.sub(a,b));
        System.out.println("mul: " + calc.mul(a,b));
        System.out.println("div: " + calc.div(a,b));
    }
}
