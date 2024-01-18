package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;                 // 연산자
    private int hdd;                    // 하드디스크
    private int ram;                    // 램
    private String operationSystem;     // 운영체제

    public Computer() {
        super();
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    public Computer(String code, String brand, String name, int price, Date menuFacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, menuFacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드까지 초기화하는 생성자 호출함...");
    }

    @Override
    public String toString() {
//        return "Computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operationSystem='" + operationSystem + '\'' +
//                "} " + super.toString();
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem + '\'' +
                "} " +
                "Product{" +
                "code='" + super.getCode() + '\'' +
                ", brand='" + super.getBrand() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", price=" + getPrice() +
                ", menuFacturingDate=" + getMenuFacturingDate() +
                '}';
    }
}
