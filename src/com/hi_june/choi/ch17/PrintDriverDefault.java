package com.hi_june.choi.ch17;

interface Printable {
    void print(String doc);
    default void printCMYK(String doc) {}   // default 메소드 추가
}

class Prn731Drv implements Printable {  // 최초 출시한 프린터
    @Override
    public void print(String doc) {
        System.out.println("From MD-731 printer");
        System.out.println(doc);
        System.out.println();
    }
}

class Prn909Drv implements Printable {  // 그 이후 출시한 컬러프린터
    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
        System.out.println();
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
        System.out.println();
    }
}

public class PrintDriverDefault {
    public static void main(String[] args) {
        String myDoc = "This is a report about ...";

        Printable printer731 = new Prn731Drv();
        Printable printer909 = new Prn909Drv();


        printer731.print(myDoc);

        printer909.print(myDoc);
        printer909.printCMYK(myDoc);
    }
}
