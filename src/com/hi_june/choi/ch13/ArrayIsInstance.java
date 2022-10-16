package com.hi_june.choi.ch13;

public class ArrayIsInstance {
    public static void main(String[] args) {
        // 길이가 5인 int형 1차원 배열의 생성
        int[] ar1 = new int[5];

        // 배열의 참조변수와 인스턴스 생성 분리
        double[] ar2;
        ar2 = new double[10];

        // 배열 '인스턴스 변수(length)' 접근
        System.out.println("배열 ar1의 길이: " + ar1.length);
        System.out.println("배열 ar2의 길이: " + ar2.length);
    }
}
