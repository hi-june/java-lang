package com.hi_june.choi.ch11;

class Person {
    private int regiNum;    // 주민등록 번호
    private int passNum;    // 여권 번호

    Person(int rnum, int pnum){ // 매개변수의 갯수가 다름
        regiNum = rnum;
        passNum = pnum;
    }
    Person(int rnum){
        this(rnum,0);
    }
//    Person(int rnum) {
//        regiNum = rnum;
//        passNum = 0;
//    }
}

class ConOverloading{
    public static void main(String[] args){
        Person choi = new Person(335577, 112233);    // 여권이 있는 경우
        Person park = new Person(335577);   // 여권이 없는 경우
    }
}