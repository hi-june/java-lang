package com.hi_june.choi.ch22;

//class Box<T> {
//    protected T object;
//
//    public void set(T object) {
//        this.object = object;
//    }
//
//    public T get() {
//        return object;
//    }
//}

//class Toy {
//    @Override
//    public String toString() {
//        return "I am a Toy";
//    }
//}

class BoxHandler {
    public static void outBox(Box<? extends Toy> box) {
        Toy toy = box.get();
        System.out.println(toy);
    }

    public static void inBox(Box<? super Toy> box, Toy toy) {
        box.set(toy);
    }
}

public class BoundedWildcardBase {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();

        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
