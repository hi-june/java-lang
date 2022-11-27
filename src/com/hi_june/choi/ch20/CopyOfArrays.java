package com.hi_june.choi.ch20;

import java.util.Arrays;

public class CopyOfArrays {
    public static void main(String[] args) {
        int n = 3;
        double[] originArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        // copyOf 메소드: 첫 번째 요소부터 n번째 요소까지 배열 복사
        double[] copyArray1 = Arrays.copyOf(originArray, n);

        // copyOfRange 메소드: 인덱스 번호 from 부터 to 이전 요소까지 복사
        double[] copyArray2 = Arrays.copyOfRange(originArray, 1, 4);

        // 이미 존재하는 배열에 복사를 하려는 경우
        // 배열 org의 인덱스 1에서 배열 copyArray3의 인덱스 1로 n 개의 요소 복사
        double[] copyArray3 = new double[4];
        System.arraycopy(originArray, 1, copyArray3, 1, n);

        for (double i : copyArray1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (double i : copyArray2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (double i : copyArray3) {
            System.out.print(i + " ");
        }
    }
}
