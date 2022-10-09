package com.hi_june.choi.ch10;

class AccessWay {
    static int num = 0;
    AccessWay() {
        incrCnt();
    }
    void incrCnt() {    // 클래스 내부에서 이름을 통한 접근
        num++;
    }
}

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay way = new AccessWay();
        way.num++;  // 외부에서 인스턴스의 이름을 통한 접근
        AccessWay.num++;    // 외부에서 클래스의 이름을 통한 접근
        System.out.println("num + " + AccessWay.num);
    }
}
