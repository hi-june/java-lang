package com.hi_june.choi.ch23;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p2.age - p1.age; // 나이가 많은 사람을 앞에 세우는 연산
    }
}

public class ComparatorPerson {
    public static void main(String[] args) {
        Set<Person> tree = new TreeSet<>(new PersonComparator());

        tree.add(new Person("Yoon", 37));
        tree.add(new Person("Hong", 53));
        tree.add(new Person("Park", 22));

        for (Person person : tree) {
            System.out.println(person);
        }
    }
}
