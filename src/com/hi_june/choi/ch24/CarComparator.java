package com.hi_june.choi.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car implements Comparable<Car> {
    protected int disp; // 배기량

    public Car(int disp) {
        this.disp = disp;
    }

    @Override
    public String toString() {
        return "cc: " + disp;
    }

    @Override
    public int compareTo(Car car) {
        return this.disp - car.disp;
    }
}

class ECar extends Car {
    private int battery;    // 배기량

    public ECar(int disp, int battery) {
        super(disp);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return String.format("cc: %s, ba: %s", disp, battery);
    }
}

class CarComp implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.disp - car2.disp;
    }
}

public class CarComparator {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1800));
        cars.add(new Car(1200));
        cars.add(new Car(3000));

        List<ECar> eCars = new ArrayList<>();
        eCars.add(new ECar(3000, 55));
        eCars.add(new ECar(1800, 87));
        eCars.add(new ECar(1200, 99));

        CarComp comp = new CarComp();

        // 각각 정렬
        Collections.sort(cars, comp);
        Collections.sort(eCars, comp);

        for (Car car : cars) {
            System.out.print(car + "\t");
        }
        System.out.println();
        for (ECar eCar : eCars) {
            System.out.print(eCar + "\t");
        }
    }
}
