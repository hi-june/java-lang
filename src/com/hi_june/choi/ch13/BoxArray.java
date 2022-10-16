package com.hi_june.choi.ch13;

class Box {
    private String conts;

    Box(String conts) {
        this.conts = conts;
    }

    public String toString() {
        return conts;
    }
}

public class BoxArray {
    public static void main(String[] args) {
        Box[] boxes = new Box[3];

        // 배열에 인스턴스 저장
        boxes[0] = new Box("One");
        boxes[1] = new Box("Two");
        boxes[2] = new Box("Three");

        // 저장된 인스턴스의 참조
        for (int i = 0; i < 3; i++) {
            System.out.println(boxes[i]);
        }
    }
}
