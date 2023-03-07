package com.hi_june.choi.ch26;

//interface Printable {
//    void print();
//}
//
//class Paper {
//    private String con;
//
//    public Paper(String con) {
//        this.con = con;
//    }
//
//    public Printable getPrinter() {
//        return new Printer();   // 멤버 클래스 인스턴스 생성 및 반환
//    }
//
//    private class Printer implements Printable {    // 멤버 클래스의 정의
//        public void print() {
//            System.out.println(con);
//        }
//    }
//}
//
//public class UseMemberInner {
//    public static void main(String[] args) {
//        Paper p = new Paper("서류 내용: 행복합니다.");
//        Printable prn = p.getPrinter();
//        prn.print();    // 서류 내용: 행복합니다.
//    }
//}
