package com.hi_june.choi.ch20;

import java.util.Random;

public class GanRandom {
    public static void main(String[] args) {
        Random rand = new Random(10);

        for (int i = 0; i < 5; i++) {
            System.out.println(rand.nextInt(1000));
        }
    }
}
