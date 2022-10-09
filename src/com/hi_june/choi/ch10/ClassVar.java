package com.hi_june.choi.ch10;

class InstCnt{
    static int instNum = 0;

    InstCnt() {
        instNum++;
        System.out.println("Instance create: " + instNum);
    }
}

public class ClassVar {
    public static void main(String[] args) {
        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();
    }
}
