package com.hi_june.choi.ch09;

class SinusCap{
    void sinTake() {
        System.out.println("콧물이 싹! 납니다.");
    }

    void sneTake() {
        System.out.println("재채기가 멎습니다.");
    }

    void snuTake() {
        System.out.println("코가 뻥 뚫립니다.");
    }

    void take(){    // 약의 복용 방법 및 순서가 담김
        sinTake();
        sneTake();
        snuTake();
    }
}

class ColdPatient{
    void takeSinus(SinusCap cap){
        cap.take();
    }
}

public class OneClassEncapsulation {
    public static void main(String[] args) {
        ColdPatient patient = new ColdPatient();
        patient.takeSinus(new SinusCap());
    }
}
