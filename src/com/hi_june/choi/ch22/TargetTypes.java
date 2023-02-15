package com.hi_june.choi.ch22;

class EmptyBoxFactory {
    public static <T> Box<T> makeBox() {    // 제네릭 메소드
        Box<T> box = new Box<>();
        return box;
    }
}

public class TargetTypes {
    public static void main(String[] args) {
        Box<Integer> iBox = EmptyBoxFactory.makeBox();

        iBox.set(123);
        System.out.println(iBox.get());
    }
}
