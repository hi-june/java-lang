package com.hi_june.choi.ch23;

import java.util.*;

public class ConvertCollection {
    public static void main(String[] args) {
        // 중복이 포함된 리스트
        List<String> list = Arrays.asList("Box", "Toy", "Box", "Toy");

        // 중복을 제거하기위해 Set으로 타입 변환
        Set<String> set = new HashSet<>(list);

        // 중복이 제거된 Set으로 List를 만듬
        List<String > new_list = new ArrayList<>(set);
    }
}
