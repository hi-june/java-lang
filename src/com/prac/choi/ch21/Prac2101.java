package com.prac.choi.ch21;

class DBox<L, R> {
    private L left;
    private R right;

    public void set(L l, R r) {
        left = l;
        right = r;
    }

    @Override
    public String toString() {
        return left + " & " + right;
    }
}

//class DDBox<LB, RB> {
//    private LB leftBox;
//    private RB rightBox;
//
//    public void set(LB lb, RB rb) {
//        leftBox = lb;
//        rightBox = rb;
//    }
//
//    @Override
//    public String toString() {
//        return leftBox + "\n" + rightBox;
//    }
//}

public class Prac2101 {
    public static void main(String[] args) {
        DBox<String, Integer> box1 = new DBox<>();
        DBox<String, Integer> box2 = new DBox<>();

        box1.set("Apple", 25);
        box2.set("Orange", 33);

        DBox<DBox<String, Integer>, DBox<String, Integer>> dbox = new DBox<>();
        dbox.set(box1, box2);

        System.out.println(dbox);
    }
}
