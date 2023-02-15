package com.hi_june.choi.ch22;

interface Getable<T> {
    T get();
}

class GBox<T> implements Getable<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    @Override
    public T get() {
        return ob;
    }
}

class Toy {
    @Override
    public String toString() {
        return "I am a Toy";
    }
}

public class GetableGenericInterface {
    public static void main(String[] args) {
        GBox<Toy> box = new GBox<>();
        box.set(new Toy());

        // GBox<T>가 Getable<T>를 구현하므로 참조 가능
        Getable<Toy> gt = box;
        System.out.println(gt.get());
    }
}
