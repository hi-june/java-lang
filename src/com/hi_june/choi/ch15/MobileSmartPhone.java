package com.hi_june.choi.ch15;

class MobilePhone {
    protected String number;

    public MobilePhone(String number) {
        this.number = number;
    }

    public void answer() {
        System.out.println("Hi~ from " + number);
    }
}

class SmartPhone extends MobilePhone{
    private String androidVer;

    public SmartPhone(String number, String androidVer) {
        super(number);
        this.androidVer = androidVer;
    }

    public void playApp() {
        System.out.println("App is running in " + androidVer);
    }
}

public class MobileSmartPhone {
    public static void main(String[] args) {
        // SmartPhone 인스턴스를 각각 SmartPhone과 MobilePhone 타입의 변수로 참조함
        SmartPhone phone1 = new SmartPhone("010-777-7777", "JellyBean");
        MobilePhone phone2 = new SmartPhone("010-999-9999", "Cookie");

        phone1.answer();
        phone1.playApp();
        System.out.println();

        phone2.answer();
        // phone2.playApp();    // phone2가 부모클래스형 참조변수라서 컴파일 에러가 남
    }
}
