package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public void NonStaticField() {
        System.out.println("product 클래스의 nonStaticMethod 호출함...");
    }

    public void StaticField() {
        System.out.println("product 클래스의 StaticMethod 호출함...");
    }

    public abstract void abstractMethod();
}