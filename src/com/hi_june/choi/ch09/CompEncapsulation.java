package com.hi_june.choi.ch09;

class SinivelCap{   // 콧물 처치용 캡슐
    void take(){
        System.out.println("콧물이 싹~ 납니다.");
    }
}

class SneezeCap{    // 재채기 처치용 캡슐
    void take() {
        System.out.println("재채기가 멎습니다.");
    }
}

class SnuffleCap{   // 코막힘 처치용 캡슐
    void take() {
        System.out.println("코가 뻥 뚫립니다.");
    }
}

class TotalCap{ // 포함 관계가 담긴 캡슐 class
    SinivelCap siCap = new SinivelCap();
    SneezeCap szCap = new SneezeCap();
    SnuffleCap sfCap = new SnuffleCap();

    void take(){
        siCap.take(); szCap.take(); sfCap.take();
    }
}

class Patient{
    void takeSinus(TotalCap cap){
        cap.take();
    }
}

public class CompEncapsulation {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.takeSinus(new TotalCap());
    }
}