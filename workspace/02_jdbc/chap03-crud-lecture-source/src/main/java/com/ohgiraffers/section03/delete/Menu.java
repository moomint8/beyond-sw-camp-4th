package com.ohgiraffers.section03.delete;

public class Menu {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderAbleStatus;

    public Menu() {
    }

    /* 설명. UPDATE용 생성자 */
    public Menu(int menuCode, String menuName, int menuPrice) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
    }

    public Menu(String menuName, int menuPrice, int categoryCode, String orderAbleStatus) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderAbleStatus = orderAbleStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public String getOrderAbleStatus() {
        return orderAbleStatus;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + categoryCode +
                ", orderAbleStatus='" + orderAbleStatus + '\'' +
                '}';
    }
}
