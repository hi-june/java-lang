package com.hi_june.choi.ch13;

/*
class Box {
    private String conts;

    Box(String conts) {
        this.conts = conts;
    }

    public String toString() {
        return conts;
    }
}
 */
public class ArrayIsInstance2 {
    public static void main(String[] args) {
        Box[] boxes = new Box[5];   // 길이가 5인 Box형 1차원 배열의 생성
        System.out.println("length : " + boxes.length);
    }
}
