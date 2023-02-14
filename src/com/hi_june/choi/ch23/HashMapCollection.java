package com.hi_june.choi.ch23;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Key-Value 기반 데이터 저장
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // 데이터 탐색
        System.out.println(map.get(45));
        System.out.println(map.get(37));
        System.out.println(map.get(23));

        // 데이터 삭제
        map.remove(37);

        // 데이터 삭제 확인
        System.out.println("37번: " + map.get(37));
    }
}
