package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;        // 상품 코드
    private String brand;       // 제조사
    private String name;        // 상품명
    private int price;          // 가격
    private java.util.Date menuFacturingDate;   // 제조일자

    public Product() {
        System.out.println("Product 클래스의 기본생성자 호출함...");
    }

    public Product(String code, String brand, String name, int price, Date menuFacturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.menuFacturingDate = menuFacturingDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getMenuFacturingDate() {
        return menuFacturingDate;
    }

    public void setMenuFacturingDate(Date menuFacturingDate) {
        this.menuFacturingDate = menuFacturingDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", menuFacturingDate=" + menuFacturingDate +
                '}';
    }
}
