package com.ohgiraffers.section01.generic;

/* 필기.
 *  제네릭 클래스의 다이아몬드 연산자(<>) 안에는 4가지 타입을 지정할 수 있다.
 *   1. E : Element
 *   2. T : Type
 *   3. K : jey
 *   4. V : Value
 */
public class GenericTest<T> {

    /* 설명. 필드 및 메소드의 매개변수와 반환형의 자료형(Type)은 현재 정해져 있지 않은 상태이다. */
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
