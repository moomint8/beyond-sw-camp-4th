package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {          // 생성자의 접근제어자를 private으로 해서 다른 곳에서 객체 생성이 안되도록 설정

    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
