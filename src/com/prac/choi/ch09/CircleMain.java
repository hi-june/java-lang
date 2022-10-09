package com.prac.choi.ch09;

class Point{
    int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPointInfo() {
        System.out.printf("좌표는 [%d , %d]입니다.\n", xPos, yPos);
    }
}

class Circle{
    Point circlePoint;
    int radius;

    Circle(int x, int y, int rad){
        circlePoint = new Point(x, y);
        radius = rad;
    }

    public void showCircleInfo(){
        circlePoint.showPointInfo();
        System.out.println("반지름은 " + radius + "입니다.");
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle(2, 2, 4);
        c.showCircleInfo();
    }
}
