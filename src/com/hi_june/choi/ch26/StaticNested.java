package com.hi_june.choi.ch26;

class Outer {
    private static int num = 0;

    static class Nested1 {
        void add(int n) {
            num += n;   // Outer 클래스의 static 변수를 공유한다.
        }
    }

    static class Nested2 {
        int get() {
            return num; // Outer 클래스의 static 변수를 공유한다.
        }
    }
}

public class StaticNested {
    public static void main(String[] args) {
        // 인스턴스 생성방법
        Outer.Nested1 nst1 = new Outer.Nested1();
        Outer.Nested2 nst2 = new Outer.Nested2();

        // static 변수 num을 공유한다.
        nst1.add(5);
        System.out.println(nst2.get());
    }
}
