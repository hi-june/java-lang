package com.hi_june.choi.ch25;

enum Scale {    // 자바 5에서 추가된 자료형. 의미가 부여된 이름을 갖는 상수의 선언
    DO, RE, MI, FA, SO, RA, TI
}

public class SimpleEnum {
    public static void main(String[] args) {
        Scale sc = Scale.DO;    // 다음과 같이 참조변수 선언도 가능함. 다만 열거형 값만 대입이 가능하다.
        System.out.println(sc);

        switch (sc) {
        case DO:
            System.out.println("도~ ");
            break;
        case RE:
            System.out.println("레~ ");
            break;
        case MI:
            System.out.println("미~ ");
            break;
        case FA:
            System.out.println("파~ ");
            break;
        default:
            System.out.println("솔라시");
        }
    }
}
