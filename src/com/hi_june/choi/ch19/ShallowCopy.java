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
//    public void changePos(int x, int y) {
//        xPos = x;
//        yPos = y;
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//
//class Rectangle implements Cloneable {
//    private Point upperLeft;    // 좌측 상단 좌표
//    private Point lowerRight;   // 우측 하단 좌표
//
//    public Rectangle(int x1, int y1, int x2, int y2) {
//        upperLeft = new Point(x1, y1);
//        lowerRight = new Point(x2, y2);
//    }
//
//    public void changePos(int x1, int y1, int x2, int y2) {
//        upperLeft.changePos(x1, y1);
//        lowerRight.changePos(x2, y2);
//    }
//
//    public void showPosition() {
//        System.out.println("좌측 상단: " + upperLeft.showPosition());
//        System.out.println("우측 하단: " + lowerRight.showPosition());
//        System.out.println();
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//
//public class ShallowCopy {
//    public static void main(String[] args) {
//        Rectangle origin = new Rectangle(1, 1, 9, 9);
//        Rectangle copy;
//
//        try {
//            copy = (Rectangle) origin.clone();  // 인스턴스 복사
//
//            origin.changePos(2, 2, 7, 7);   // 인스턴스의 좌표 정보 수정
//
//            origin.showPosition();
//            copy.showPosition();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//    }
//}
