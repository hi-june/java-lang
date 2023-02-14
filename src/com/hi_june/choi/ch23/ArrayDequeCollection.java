package com.hi_june.choi.ch23;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCollection {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // 앞으로 넣기
        deque.offerFirst("1. Box");
        deque.offerFirst("2. Toy");
        deque.offerFirst("3. Robot");

        // 앞에서 빼기
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
    }
}
