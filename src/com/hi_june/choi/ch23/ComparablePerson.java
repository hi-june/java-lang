package com.hi_june.choi.ch23;

import java.util.Set;
import java.util.TreeSet;

/**
 나이가 적으면 앞으로 오도록 만들 것!
 */
class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", name, age);
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }
}

public class ComparablePerson {
    public static void main(String[] args) {
        Set<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("Yoon", 37));
        treeSet.add(new Person("Hong", 53));
        treeSet.add(new Person("Park", 22));

        for (Person person : treeSet) {
            System.out.println(person);
        }
    }
}
