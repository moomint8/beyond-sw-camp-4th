package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("토끼가 풀을 옴뇸뇸 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼는 나약한 대신 매우 민첩하게 뜁니다. 좌33 우33");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다. 끼익~!");
    }

    public void jump() {
        System.out.println("토끼가 점프합니다. 폴짝!!");
    }
}
