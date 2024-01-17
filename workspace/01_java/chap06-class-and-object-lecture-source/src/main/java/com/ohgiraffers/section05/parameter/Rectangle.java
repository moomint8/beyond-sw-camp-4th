package com.ohgiraffers.section05.parameter;

public class Rectangle {

    /* 설명. 사각형의 가로와 높이를 저장하는 필드 */
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /* 설명. 사각형의 넓이를 구할 수 있는 메소드 */
    public void calArea() {
        System.out.println("사각형의 넓이 : " + (this.width * this.height));
    }

    /* 설명. 사각형의 둘레를 구할 수 있는 메소드 */
    public void calRound() {
        System.out.println("사각형의 둘레 : " + ((this.width + this.height) * 2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
