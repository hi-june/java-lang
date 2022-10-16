package com.hi_june.choi.ch13;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] ar1 = new int[10];
        int[] ar2 = new int[10];

        Arrays.fill(ar1, 7);    // 배열 ar1을 7로 초기화

        // 배열 ar1을 ar2로 부분 복사
        System.arraycopy(ar1, 0, ar2, 2, 5);    // ar1의 0번 인덱스부터 5개의 요소를 ar2의 2번 인덱스로 부분 복사

        for (int e: ar1) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (int e: ar2) {
            System.out.print(e + " ");
        }

    }
}
