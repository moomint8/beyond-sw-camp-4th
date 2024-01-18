package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
    public FireCar() {
        super();        // 부모 클래스인 Car 를 뜻함
        System.out.println("FireCar 클래스의 기본 생성자 호출됨");
    }

    @Override
    /* 필기.
     *  @Override 어노테이션을 추가하는 이유?
     *   1. 메소드 중에 부모로부터 물려받은 메소드인 것을 한 눈에 알아보기 쉽게 하기 위해서(가독성 측면)
     *   2. 부모의 메소드를 오버라이딩할 때 발생할 수 있는 실수를 방지하기 위해서(실수방지 측면)
     */
    public void soundHorn() {
        System.out.println("빠아아아아아아앙!!!빠아아아앙!!!!");
    }

    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ====================3");
    }
}
