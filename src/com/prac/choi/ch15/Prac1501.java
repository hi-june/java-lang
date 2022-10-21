package com.prac.choi.ch15;

class Box {
    public void wrap() {
        System.out.println("Simple Wrapping");
    }
}

class PaperBox extends Box {
    public void wrap() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox {
    public void wrap() {
        System.out.println("Gold Wrapping");
    }
}

public class Prac1501 {
    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);  // Simple Wrapping
        wrapBox(box2);  // Paper Wrapping
        wrapBox(box3);  // Gold Wrapping
    }

    public static void wrapBox(Box box) {
        box.wrap();
    }
}
