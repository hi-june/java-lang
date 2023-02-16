package com.hi_june.choi.ch24;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
        for (Iterator itr = list.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next() + "\t");
        }

        Collections.sort(list);
        System.out.println();

        for (Iterator itr = list.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next() + "\t");
        }
    }
}
