package com.hi_june.choi.ch25;

interface Animal {
    int DOB = 1;
    int CAT = 2;
}

interface Person {
    int MAN = 1;
    int WOMAN = 2;
}

public class NonSafeConst {
    public static void main(String[] args) {
        who(Person.MAN);    // 정상적인 메소드 호출
        who(Animal.DOB);    // 비정상적 메소드 호출
    }

    public static void who(int man) {
        switch (man) {
        case Person.MAN:    // Animal.DOB도 1이기 때문에 오류가 발생하지 않음
            System.out.println("남성 손님입니다.");
            break;
        case Person.WOMAN:
            System.out.println("여성 손님입니다.");
            break;
        }
    }
}
