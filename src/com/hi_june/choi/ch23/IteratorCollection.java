package com.hi_june.choi.ch23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");
        list.add("Box");

        Iterator itr = list.iterator(); // 반복자 처음 획득

        // 반복자를 이용한 순차적 참조
        while (itr.hasNext()) {
            System.out.println(itr.next() + "\t");
        }
        System.out.println();

        itr = list.iterator();  // 반복자 다시 획득

        // 모든 "Box" 삭제
        while (itr.hasNext()) {
            if (itr.next().equals("Box")) {
                itr.remove();
            }
        }

        itr = list.iterator(); // 반복자 다시 획득

        // 삭제 후 결과 확인
        while (itr.hasNext()) {
            System.out.println(itr.next() + "\t");
        }
        System.out.println();
    }
}
