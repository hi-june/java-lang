package com.hi_june.choi.ch20;

import java.util.StringTokenizer;

public class TokenizeString {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("PM:08:45", ":");
        while (st1.hasMoreTokens()) {
            System.out.print(st1.nextToken() + " ");
        }

        System.out.println();

        // 구분자로 여러 개를 설정할 수 있다.
        StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/= ");
        while (st2.hasMoreTokens()) {
            System.out.print(st2.nextToken() + " ");
        }
    }
}
