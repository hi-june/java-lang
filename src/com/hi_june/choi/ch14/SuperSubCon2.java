package com.hi_june.choi.ch14;

class SuperCLS {
    public SuperCLS() { // 1
        System.out.println("Con: SuperCLS()");
    }
    public SuperCLS(int i) {    // 2
        System.out.println("Con: SuperCLS(int i)");
    }
    public SuperCLS(int i, int j) { // 3
        System.out.println("Con: SuperCLS(int i, int j)");
    }
}

class SubCLS extends SuperCLS { // super(); // 상위 클래스의 생성자를 명시적으로 호출하지 않으면 자동으로 호출됨
    // super를 이용한 상위 클래스의 생성자 호출문은 생성자의 첫 문장에 들어가야 함
    public SubCLS() {
        System.out.println("Con: SubCLS()");
    }
    public SubCLS(int i) {
        super(i);   // 상위 클래스의 2번 메소드 호출
        System.out.println("Con: SubCLS(int i)");
    }
    public SubCLS(int i, int j) {
        super(i, j);    // 상위 클래스의 3번 메소드 호출
        System.out.println("Con: SubCLS(int i, int j)");
    }
}

public class SuperSubCon2 {
    public static void main(String[] args) {
        System.out.println("1. ");
        new SubCLS();
        System.out.println();

        System.out.println("2. ");
        new SubCLS(1);
        System.out.println();

        System.out.println("3. ");
        new SubCLS(1, 2);
        System.out.println();
    }
}
