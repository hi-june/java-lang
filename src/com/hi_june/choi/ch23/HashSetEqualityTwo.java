package com.hi_june.choi.ch23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Num {
    private int num;
    public Num(int n) {
        num = n;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public int hashCode() {
        return num % 3;
    }

    @Override
    public boolean equals(Object o) {
        return num == ((Num)o).num;
    }
}

public class HashSetEqualityTwo {
    public static void main(String[] args) {
        Set<Num> set = new HashSet<>();

        set.add(new Num(4444));
        set.add(new Num(5555));
        set.add(new Num(4444));

        for (Iterator<Num> itr = set.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }
    }
}
