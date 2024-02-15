package com.ohgiraffers.common;

public class PersonalAccount implements Account {
    private final int bankCode;     // 은행코드
    private final String accNo;     // 계좌번호
    private int balance;            // 잔액

    public PersonalAccount(int bankCode, String accNo) {
        this.bankCode = bankCode;
        this.accNo = accNo;
    }

    @Override
    public String getBalance() {
        return this.accNo + " 계좌의 현재 잔액은 " + this.balance + "원 입니다.";
    }

    @Override
    public String depository(int money) {
        if (money >= 0) {
            this.balance += money;
            return money + "원이 입급되었습니다.";
        }

        return "잘못된 금액을 입력하셨습니다.";
    }

    @Override
    public String withDraw(int money) {
        if (this.balance >= money && money > 0) {
            this.balance -= money;
            return money + "원이 출금되었습니다.";
        }
        if (this.balance < money) {
            return "잔액이 부족합니다. 잔액을 확인해주세요.";
        }
        return "잘못된 금액을 입력하셨습니다.";
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "bankCode=" + bankCode +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
