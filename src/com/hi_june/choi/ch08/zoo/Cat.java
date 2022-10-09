package com.hi_june.choi.ch08.zoo;

public class Cat {
    public void makeSound() {   // public 메소드, 어디서든 호출 가능
        System.out.println("yaong(>_<)");
    }

    void makeHappy() {  // default 메소드, 동일 패키지로 묶은 클래스 내에서 호출 가능
        System.out.println("smile(^_^)");
    }
}
