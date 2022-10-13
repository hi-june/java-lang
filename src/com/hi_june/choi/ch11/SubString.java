package com.hi_june.choi.ch11;

public class SubString {
    public static void main(String[] args) {
        String st1 = "abcdefg";

        String st2 = st1.substring(2);
        String st3 = st1.substring(2,4);

        System.out.println(st2);    // cdefg
        System.out.println(st3);    // cd
    }
}
