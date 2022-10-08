package com.hi_june.choi.ch03;

public class Constant {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;

        CONST_ASSIGNED = 12;

        // CONST_CHAR = '하' // 컴파일 에러: 상수는 중간에 변경 불가

        System.out.println("상수1 : " + MAX_SIZE);
        System.out.println("상수2 : " + CONST_CHAR);
        System.out.println("상수3 : " + CONST_ASSIGNED);
    }
}
