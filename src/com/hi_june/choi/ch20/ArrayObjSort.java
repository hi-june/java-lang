package com.hi_june.choi.ch20;

import java.util.Arrays;

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    /**
     * 나이가 어린 인스턴스의 크기가 작은 것으로 결정한다.
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.age - p.age;
//        if (this.age > ((Person)o).age) return 1;
//        else if (this.age < ((Person)o).age) return -1;
//        else return 0;
    }
}

public class ArrayObjSort {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Kim", 22);
        ar[1] = new Person("Choi", 26);
        ar[2] = new Person("Park", 24);

        Arrays.sort(ar);

        int idx = Arrays.binarySearch(ar, new Person("Who are you?", 26));
        System.out.println(ar[idx]);
    }
}
