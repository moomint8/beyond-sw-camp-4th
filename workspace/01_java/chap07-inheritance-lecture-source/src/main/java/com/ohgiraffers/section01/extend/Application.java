package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 상속에 대해 이해할 수 있다. */
        /* 필기.
         *  상속은 부모의 멤버를 물려받아 재사용성에 유리하게 만들기 위한 객체지향의 특징이자 문법이다.
         *  하지만 단순히 물려받아 재사용하는 개념보다 부모클래스의 개념을 확장(extends)하는데 더 의의가 있으며
         *  현재 가장 중요한 의미는 '다형성을 적용하기 위한 문법적 토대'가 된다는 사실이다.
         *
         * 필기.
         *  상속의 장점
         *   1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재사용할 수 있다.
         *    1-1. 재사용 시 생산성을 크게 향상시킬 수 있다.
         *    1-2. 부모 클래스만 수정해도 자식 클래스들 전체에 적용된다.(유지보수 측면)
         *   2. 클래스 간의 계층 관계가 형성되며 다형성의 문법적인 토대가 된다.
         *
         * 필기.
         *  상속의 단점
         *   1. 부모 클래스의 기능을 추가/변경할 시 자식 클래스가 정상적으로 작동하게 될지 예측하기 힘들다.
         *      (경우에 따라 유지보수에 악영향을 미칠 수 있다.)
         *   2. 부모 클래스에서는 의미있고 중요했던 기능이 자식 클래스에서는 무의미할 수 있다.(불필요한 멤버가 추가되기 때문)
         *
         * 필기.
         *  메소드 오버라이딩
         *   메소드를 재정의(Overriding)하는 것으로 부모 메소드의 헤드부를 그대로 사용하면서 자식 클래스가
         *   정의한 메소드대로 동작하도록 메소드 바디부(몸체)를 새롭게 다시 작성하는 것이다.
         *   이후 다형성을 적용하면 자식의 오버라이딩 된 메소드가 우선적으로 동작하게 된다.(동적 바인딩)
         *
         * 필기.
         *  장점과 단점을 고려했을 때, 상속은 오용의 가능성이 있기 때문에 IS-A 관계로 구분되는 경우에 잘 고려하여
         *  적용해야 한다.
         *  (IS-A 관계 vs HAS-A 관계)
         */
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();

        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.soundHorn();
    }
}
