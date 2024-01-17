package com.ohgiraffers.section03.abstraction;

public class Car {
    private final String isNotStartUp = "차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.";

    private boolean isOn;
    private int speed = 0;

    /* 설명. 시동이 걸려있는 상태인 경우엔 할 일이 없고, 시동이 걸려있지 않은 상태인 경우 시동을 건다. */
    public void startUp() {
        if (isOn) {         // 시동이 걸려 있으면
            System.out.println("이미 시동이 걸려 있습니다.");
            return;
        }
        if (!isOn) {        // 시동이 걸려 있지 않다면
            isOn = true;    // isOn 앞에는 this.  이 있지만 this. 를 생략해도 자동으로 적용된다.
            System.out.println("시동을 걸었습니다. 부릉부릉~!");
        }
    }

    /* 설명. 시동이 걸린 상태인 경우에만 호출시마다 10km/h씩 속도를 증가시킨다. */
    public void go() {
        if (isOn) {         // 시동이 켜져있어 달릴 수 있음
            System.out.println("차가 앞으로 움직입니다.");
            speed += 10;
            System.out.println("현재 차의 시속은 " + speed + "km/h 입니다.");

            return;
        }
        System.out.println(isNotStartUp);
    }

    /* 설명. 시동이 걸려있고 달리는 상태인 경우에만 멈출 수 있다. */
    public void stop() {
        if (isOn) {
            if (speed > 0) {
                speed = 0;
                System.out.println("급브레이크를 밟았습니다. 차를 멈춥니다.");
                return;
            }
            System.out.println("차는 이미 멈춰있는 상태입니다.");
            return;
        }
        System.out.println(isNotStartUp);
    }

    /* 설명. 시동이 걸려있고, 멈춰있는 상태인 경우 시동을 끄고, 주행 중이거나, 시동이 꺼져있는 경우 아무 것도 하지 않는다. */
    public void turnOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("주행 중에 시동을 끌 수 없습니다. 차를 우선 정지해주시길 바랍니다.");

                return;
            }
            isOn = false;
            System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주시길 바랍니다.");

            return;
        }
        System.out.println("이미 시동이 꺼져 있는 상태입니다. 시동 상태를 확인해주세요.");
    }
}
