package com.hi_june.choi.ch05;

import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        // int n = 24;
        System.out.print("정수를 입력해주세요: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n/10){
        case 0:
            System.out.println("0 이상 10미만의 수");
            break;
        case 1:
            System.out.println("10이상 20미만의 수");
            break;
        case 2:
            System.out.println("20이상 30미만의 수");
            break;
        default:
            System.out.println("음수 혹은 30 이상의 수");
            break;
        }
    }
}
