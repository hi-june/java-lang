package com.prac.choi.ch21;

class Box<T> {
    private T ob;
    public void set(T o) {
        ob = o;
    }
    public T get() {
        return ob;
    }
}

public class BoxSwapDemo {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        box1.set(99); box2.set(55);

        System.out.println(box1.get() + " & " + box2.get());

        swapBox(box1, box2);
        System.out.println(box1.get() + " & " + box2.get());
    }

    public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
        //Box<T> box = new Box<>();
        T temp = box1.get();

        //box.set(box1.get());
        box1.set(box2.get());
        box2.set(temp);
    }
}
