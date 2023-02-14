package com.hi_june.choi.ch23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List<String> list = new LinkedList<>();

        // 컬렉션 인스턴스에 문자열 인스턴스 저장
        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        // 저장된 문자열 인스턴스의 참조
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + '\t');
        }
        System.out.println();

        list.remove(0); // 첫 번째 인스턴스 삭제

        // 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + '\t');
        }
        System.out.println();
    }
}
