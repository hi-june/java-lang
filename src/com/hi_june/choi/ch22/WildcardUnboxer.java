package com.hi_june.choi.ch22;

class Box<T> {
    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}

class Unboxer {
    public static <T> T openBox(Box<T> box) {
        return box.get();
    }

    public static void peekBox(Box<?> box) {
        System.out.println(box);
    }
}

public class WildcardUnboxer {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("So Simple String");
        Unboxer.peekBox(box);
    }
}
