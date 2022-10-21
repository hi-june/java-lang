package com.hi_june.choi.ch16;

class ParentAdder {
    public int add(int a, int b) {
        return a + b;
    }
}

class ChildAdder extends ParentAdder {
    // @Override    // 상위 클래스의 add를 오버라이딩 하려는 의도 -> 오버로딩이 되어버렸다..
    public double add(double a, double b) {
        return a + b;
    }
}

public class OverrideMistake {
    public static void main(String[] args) {
        ParentAdder adder = new ChildAdder();
        System.out.println(adder.add(3, 4));
    }
}
