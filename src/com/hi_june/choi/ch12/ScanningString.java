package com.hi_june.choi.ch12;

import java.util.Scanner;

public class ScanningString {
    public static void main(String[] args) {
        String source = "1  3 5";
        Scanner scanner = new Scanner(source);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(num1 + num2 + num3);
    }
}
