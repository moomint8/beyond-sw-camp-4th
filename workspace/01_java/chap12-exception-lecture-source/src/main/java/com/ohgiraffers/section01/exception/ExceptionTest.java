package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if (money < price) {
            throw new Exception((price - money) + "원이 모자랍니다.");
        }
        System.out.println(price + "원 상품을 구입하기 위한 금액이 충분합니다.");
    }
}
