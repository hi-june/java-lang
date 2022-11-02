//package com.hi_june.choi.ch17;
//
//interface Printable {
//    void print(String doc); // public은 생략되어있으니까 주의하자!
//}
//
//interface ColorPrintable extends Printable {    // Printable을 상속하는 인터페이스
//    void printCMYK(String doc); // public은 생략되어있으니까 주의하자!
//}
//
//class Prn909Drv implements ColorPrintable { // ColorPrintable 뿐만 아니라 Printable에 있는 메소드도 구현해야 함
//    @Override
//    public void print(String doc) {    // Printable에 있는 메소드
//        System.out.println("From MD-909 black & white ver");
//        System.out.println(doc);
//        System.out.println();
//    }
//
//    @Override
//    public void printCMYK(String doc) {    // ColorPrintable에 있는 메소드
//        System.out.println("From MD-909 CMYK ver");
//        System.out.println(doc);
//        System.out.println();
//    }
//}
//
//public class PrintDriver {
//    public static void main(String[] args) {
//        String mydoc = "This is a report about ...";
//        ColorPrintable printer = new Prn909Drv();
//
//        printer.print(mydoc);
//        printer.printCMYK(mydoc);
//    }
//}
