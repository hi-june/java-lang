package com.hi_june.choi.ch19;

//class Point implements Cloneable {
//    private int xPos;
//    private int yPos;
//
//    public Point(int x, int y) {
//        xPos = x;
//        yPos = y;
//    }
//
//    public String showPosition() {
//        return "[ " + xPos + ", " + yPos + " ]";
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//
//public class InstanceCloning {
//    public static void main(String[] args) {
//        Point org = new Point(3, 5);
//        Point cpy;
//
//        try {
//            cpy = (Point) org.clone();
//            System.out.println(org.showPosition());
//            System.out.println(cpy.showPosition());
//
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//    }
//}
