package com.hi_june.choi.ch15;

class Cake {
    public void yummy() {
        System.out.println("Yummy Cake");
    }
}

class CheeseCake extends Cake {
    public void yummy() {
        super.yummy();  // 하위 클래스의 메소드 안에서는 오버라이딩 된 메소드의 호출이 가능하다.
        System.out.println("Yummy CheeseCake");
    }

    public void tasty() {
        super.yummy();  // Cake의 yummy 메소드 호출
        System.out.println("Yummy Tasty Cake");
    }
}

public class YummyCakeSuper {
    public static void main(String[] args) {
        CheeseCake cake = new CheeseCake();

        cake.yummy();
        System.out.println();
        cake.tasty();
    }
}
