package com.hi_june.choi.ch19;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("destroyed: " + name);
    }
}

public class ObjectFinalize {
    public static void main(String[] args) {
        Person person1 = new Person("choi");
        Person person2 = new Person("park");

        person1 = null;
        person2 = null;

//        System.gc();
//        System.runFinalization();

        System.out.println("end of program");
    }
}
