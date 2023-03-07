package com.hi_june.choi.ch26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SSComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

public class SortComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ROBOT");
        list.add("APPLE");
        list.add("BOX");

        SSComp cmp = new SSComp();      // 정렬 기준
        Collections.sort(list, cmp);    // 정렬 기준 변경해서 정렬 진행
        System.out.println(list);
    }
}
