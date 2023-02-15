package com.hi_june.choi.ch21;

class Apple {
    @Override
    public String toString() {
        return "I am an apple";
    }
}

class Orange {
    @Override
    public String toString() {
        return "I am an Orange";
    }
}

class GeneralBox {  // 무엇이든지 담을 수 있는 박스
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}

public class BeforeGeneric {
    public static void main(String[] args) {
        GeneralBox appleBox = new GeneralBox();
        GeneralBox orangeBox = new GeneralBox();

        appleBox.set(new Apple());
        orangeBox.set(new Orange());

        // 명시적 형 변환이 필요함
        Apple apple = (Apple) appleBox.get();
        Orange orange = (Orange) orangeBox.get();

        System.out.println(apple);
        System.out.println(orange);
    }
}
