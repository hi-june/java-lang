package com.prac.choi.ch19;

//class Point {
//    private int xPos;
//    private int yPos;
//
//    public Point(int x, int y) {
//        xPos = x;
//        yPos = y;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this.xPos == ((Point) obj).xPos && this.yPos == ((Point) obj).yPos) {
//            return true;
//        }
//        return false;
//    }
//}
//
//class Rectangle {   // 직사각형
//    private Point upperLeft;    // 좌측 상단 좌표
//    private Point lowerRight;   // 우측 하단 좌표
//
//    public Rectangle(int x1, int y1, int x2, int y2) {
//        upperLeft = new Point(x1, y1);
//        lowerRight = new Point(x2, y2);
//    }
//
//    @Override
//    public boolean equals(Object obj) { // 좌측 상단 좌표와 우측 하단 좌표가 모두 같아야 함
//        if (this.upperLeft.equals(((Rectangle) obj).upperLeft) && this.lowerRight.equals(((Rectangle) obj).lowerRight)) {
//            return true;
//        }
//        return false;
//    }
//}
//
//public class Prac1901 {
//    public static void main(String[] args) {
//        Rectangle rectangle1 = new Rectangle(1, 3, 4, 1);
//        Rectangle rectangle2 = new Rectangle(1, 3, 4, 1);
//        Rectangle rectangle3 = new Rectangle(4, 1, 1, 3);
//
//        System.out.println("rectangle1 and rectangle2 is same: " + rectangle1.equals(rectangle2));
//        System.out.println("rectangle1 and rectangle3 is same: " + rectangle1.equals(rectangle3));
//    }
//}
