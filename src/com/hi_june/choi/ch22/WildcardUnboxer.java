package com.hi_june.choi.ch22;

class Box<T> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}

class Unboxer {
    public static <T> T openBox(Box<T> box) {
        return box.getObject();
    }

    public static <T> void peekBox(Box<T> box) {
        System.out.println(box);
    }
}

public class WildcardUnboxer {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setObject("So Simple String");
        Unboxer.peekBox(box);
    }
}
