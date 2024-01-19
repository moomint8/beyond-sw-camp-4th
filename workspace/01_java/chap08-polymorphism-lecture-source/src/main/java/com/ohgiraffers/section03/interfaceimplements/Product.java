package com.ohgiraffers.section03.interfaceimplements;

import java.io.Serializable;

public class Product implements InterProduct, Serializable {    // 인터페이스는 다중구현(다중상속 개념)이 가능하다.
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 메소드 호출됨...");
    }

    @Override
    public void defaultMethod() {       // 오버라이딩 시에는 default 예약어 제거함)
        System.out.println("Product 클래스에서 인터페이스로부터 물려받은 defaultMethod 호출됨...");
    }
}
