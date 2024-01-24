package com.ohgiraffers.section02.userexception;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 정의의 예외 클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(30_000, 50_000);
//            et.checkEnoughMoney(-30_000, 50_000);
            et.checkEnoughMoney(30_000, -50_000);
        }
//        catch (PriceNegaticeException e) {
//            System.out.println(e.getMessage());
//        } catch (MoneyNegaticeException e) {
//            System.out.println(e.getMessage());
//        } catch (NotEnoughMoneyException e) {
//            System.out.println(e.getMessage());
//        }
        catch (Exception e) {
            System.out.println("예외 메세지 : " + e.getMessage());
        }
    }
}
