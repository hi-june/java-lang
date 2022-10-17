package com.prac.choi.ch14;

class Car { // 기본 연료 자동차
    int gasolineGauge;  // 가솔린 잔여량

    public Car(int gasolineGauge) {
        this.gasolineGauge = gasolineGauge;
    }
}

class HybridCar extends Car {   // 하이브리드 자동차
    int electricGauge;  // 전기 배터리 잔여량

    public HybridCar(int gasolineGauge, int electricGauge) {
        super(gasolineGauge);
        this.electricGauge = electricGauge;
    }
}

class HybridWaterCar extends HybridCar {    // 하이브리드 워터카
    int waterGauge; // 에너지 전환용 물의 잔여량

    public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
        super(gasolineGauge, electricGauge);
        this.waterGauge = waterGauge;
    }

    public void showCurrentGauge() {
        System.out.println("잔여 가솔린: " + gasolineGauge);
        System.out.println("잔여 전기량: " + electricGauge);
        System.out.println("잔여 워터량: " + waterGauge);
    }
}

public class Prac1401 {
    public static void main(String[] args) {
        HybridWaterCar car = new HybridWaterCar(10, 20, 30);

        car.showCurrentGauge();
    }
}
