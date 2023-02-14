package com.hi_june.choi.ch23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // Key만 담고 있는 컬렉션 인스턴스 생성
        Set<Integer> ks = map.keySet();

        // Key와 Value를 출력(for-each문 기반)
        for (Integer age: ks) {
            System.out.println(age + " -> " + map.get(age));
        }
        System.out.println();

        // Key와 Value를 출력(반복자 기반)
        for (Iterator itr = ks.iterator(); itr.hasNext(); ) {
            Integer age = (Integer) itr.next();
            System.out.println(age + " -> " + map.get(age));
        }
    }
}
