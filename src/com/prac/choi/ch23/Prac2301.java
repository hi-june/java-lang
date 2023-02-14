package com.prac.choi.ch23;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {  // 이름과 나이가 같으면 동일 인스턴스로 판단이 되도록!
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s(%d세)", name, age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        return name.equals(((Person) o).name) && age == ((Person) o).age;
    }
}

public class Prac2301 {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("최준혁", 23));
        personSet.add(new Person("최준혁", 24));
        personSet.add(new Person("최준혁", 23));

        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}
