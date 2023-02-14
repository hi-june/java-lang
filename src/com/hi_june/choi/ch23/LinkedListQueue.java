package com.hi_june.choi.ch23;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Box");
        queue.add("Toy");
        queue.add("Robot");

        // 다음에 나올 요소 확인
        System.out.println("next: " + queue.peek());

        // 첫 번째,, 두 번째 인스턴스 꺼내기
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        // 다음에 나올 요소 확인
        System.out.println("next: " + queue.peek());

        // 마지막 인스턴스 꺼내기
        System.out.println(queue.poll());
    }
}
