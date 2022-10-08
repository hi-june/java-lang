package com.hi_june.choi.ch06;

public class MethodDef {
    public static void main(String[] args) {
        System.out.println("프로그램의 시작");
        hiEveryone(26);
        System.out.println("프로그램의 끝");
    }

    public static void hiEveryone(int age) {
        System.out.println("좋은 아침입니다.");
        System.out.println("제 나이는 " + age + "입니다.");
    }
}
