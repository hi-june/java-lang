package com.hi_june.choi.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//class Car implements Comparable<Car> {
//    protected int disp; // 배기량
//
//    public Car(int disp) {
//        this.disp = disp;
//    }
//
//    @Override
//    public String toString() {
//        return "cc: " + disp;
//    }
//
//    @Override
//    public int compareTo(Car car) {
//        return this.disp - car.disp;
//    }
//}
//
//class ECar extends Car {
//    private int battery;    // 배기량
//
//    public ECar(int disp, int battery) {
//        super(disp);
//        this.battery = battery;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("cc: %s, ba: %s", disp, battery);
//    }
//}

public class CarSortCollections {
    public static void main(String[] args) {
        List<ECar> list = new ArrayList<>();
        list.add(new ECar(1200, 99));
        list.add(new ECar(3000, 55));
        list.add(new ECar(1800, 87));

        Collections.sort(list);

        for (Iterator itr = list.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }
    }
}
