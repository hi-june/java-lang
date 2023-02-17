package com.hi_june.choi.ch24;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}

public class StringComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Robot", "Apple", "Box");

        StrComp comp = new StrComp();   // 정렬과 탐색의 기준

        Collections.sort(list, comp);   // 정렬

        int idx = Collections.binarySearch(list, "Robot", comp);
        System.out.println(list.get(idx));
    }
}
