package com.prac.choi.ch11;

public class BetterNationNumber {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("970622-10127777");

        s.replace(6,7," ");
        System.out.println(s);
    }
}
