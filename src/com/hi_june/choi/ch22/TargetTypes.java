package com.hi_june.choi.ch22;

//class Box<T> {
//    protected T object;
//
//    public void setObject(T object) {
//        this.object = object;
//    }
//
//    public T getObject() {
//        return object;
//    }
//}
//
//class EmptyBoxFactory {
//    public static <T> Box<T> makeBox() {
//        Box<T> box = new Box<>();
//        return box;
//    }
//}

public class TargetTypes {
    public static void main(String[] args) {
//        Box<Integer> iBox7 = EmptyBoxFactory.<Integer>makeBox();    // java 7 이전 문법
//        Box<Integer> iBox8 = EmptyBoxFactory.makeBox(); // java 8부터 가능해짐
//
//        iBox7.setObject(7);
//        iBox8.setObject(8);
//
//        System.out.println(iBox7.getObject());
//        System.out.println(iBox8.getObject());
    }
}
