package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    /* 설명. 차 한 대(Car 객체 하나)를 필드로 가진다. */
    private Car myCar = new Car();

    /* 자신이 뵤유한 차량에 시동을 건다. */
    public void startUp() {
        myCar.startUp();
    }

    public void stepAccelerator() {
        myCar.go();
    }

    public void stepBreak() {
        myCar.stop();
    }

    public void turnOff() {
        myCar.turnOff();
    }
}
