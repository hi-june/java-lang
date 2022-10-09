package com.hi_june.choi.ch08.animal;

public class Dog {
    public static void main(String[] args) {
        com.hi_june.choi.ch08.zoo.Cat cat = new com.hi_june.choi.ch08.zoo.Cat();
        welcome(cat);
    }

    public static void welcome(com.hi_june.choi.ch08.zoo.Cat cat){
        cat.makeSound();    // 호출 가능! 컴파일 성공!
        // cat.makeHappy(); // 호출 불가! 컴파일 오류!
    }
}
