package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegaticeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegaticeException;

public class ExceptionTest2 {
    public void checkEnoughMoney(int price, int money)
            throws PriceNegaticeException, NotEnoughMoneyException, MoneyNegaticeException {

        /* 설명. throw를 통한 예외 발생 시 바로 메소드를 호출한 곳으로 예외 인스턴스와 함께 반환된다. */
        if (price < 0) {
            throw new PriceNegaticeException("상품 가격이 음수일 수 없습니다.");
        }
        if (money < 0) {
            throw new MoneyNegaticeException("소지금이 음수일 수 없습니다.");
        }
        if (money < price) {
            throw new NotEnoughMoneyException("소지금보다 상품 가격이 더 비쌉니다.");
        }

        System.out.println("가진 돈이 충분하시군요! 즐거운 쇼핑 되시길 바랍니다 고객님!");
    }
}
