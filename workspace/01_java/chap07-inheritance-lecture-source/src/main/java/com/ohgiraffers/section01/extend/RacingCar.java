package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    @Override
    public void run() {
        System.out.println("레이싱 자동차가 신나게 달립니다. 쌔애애애애앵~!");
    }

    @Override
    public void soundHorn() {
        System.out.println("경적은 나약한 차들이나 울리는 겁니다. 레이싱카는 그딴 것 필요 없습니다.");
    }
}
