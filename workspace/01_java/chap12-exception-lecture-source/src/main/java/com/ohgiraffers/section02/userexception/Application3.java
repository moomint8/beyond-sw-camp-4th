package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegaticeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegaticeException;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. multi-catch 구문을 이해하고 활용할 수 있다. */
        ExceptionTest2 et = new ExceptionTest2();
        try {
            et.checkEnoughMoney(20_000, 50_000);
        } catch (PriceNegaticeException | NotEnoughMoneyException e) {
            System.out.println("두 개의 예외 처리 : " + e.getMessage());
        } catch (MoneyNegaticeException e) {
            System.out.println("하나의 예외 처리 : " + e.getMessage());

            /* 필기.
             *  예외 클래스, 예외발생 경로, 예외 메시지, 등을 stack 호출 역순으로
             *  빨간 글씨의 로그 형태로 나타내주는 기능
             */
            e.printStackTrace();
        } finally {
            System.out.println("반드시 실행되는 finally 내용");
        }

        System.out.println("프로그램을 종료합니다...");
        /* 필기.
         *  catch 블럭이 많을 때는 위에서 아래로 예외 타입을 확인하게 되며 부모 타입에 해당하는 예외 처리는
         *  자식 타입보다 아래 작성해야 한다.
         */
    }
}
