//package com.hi_june.choi.ch17;

//interface Printable {   // MS가 정의하고 제공한 인터페이스
//    void print(String doc);
//}
//
//class SPrinterDriver implements Printable {
//    @Override
//    public void print(String doc) {
//        System.out.println("From Samsung printer");
//        System.out.println(doc);
//    }
//}
//
//class LPrinterDriver implements Printable {
//    @Override
//    public void print(String doc) {
//        System.out.println("From LG printer");
//        System.out.println(doc);
//    }
//}
//
//public class PrinterDriver {
//    public static void main(String[] args) {
//        String myDoc = "This is a report about ...";
//        Printable printer;
//
//        // 삼성 프린터로 출력
//        printer = new SPrinterDriver();
//        printer.print(myDoc);
//
//        System.out.println();
//
//        // LG 프린터로 출력
//        printer = new LPrinterDriver();
//        printer.print(myDoc);
//    }
//}
