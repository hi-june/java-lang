package com.hi_june.choi.ch09;

class Circle{
    private double rad = 0;
    final double PI = 3.14;

    public Circle(double r){
        setRad(r);
    }
    public void setRad(double rad) {
        if(rad < 0){    // 0보다 작은 반지름이 전달되었을 시
            this.rad = 0;   // 0으로 초기화
        }
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public double getArea() {
        return (rad * rad) * PI;
    }
}

public class InfoHideCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1.5);
        System.out.println("반지름: " + circle.getRad());
        System.out.println("반지름: " + circle.getArea() + '\n');

        // circle.rad = 3.4;    // 다음과 같이 멤버에 직접 접근하는 방식은 치명적 오류를 발생시킬 수 있음!
        circle.setRad(3.4);
        System.out.println("반지름: " + circle.getRad());
        System.out.println("반지름: " + circle.getArea());
    }
}
