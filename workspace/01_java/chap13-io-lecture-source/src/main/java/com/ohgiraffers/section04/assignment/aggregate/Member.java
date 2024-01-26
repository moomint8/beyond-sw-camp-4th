package com.ohgiraffers.section04.assignment.aggregate;

import java.io.Serializable;
import java.util.Arrays;

/* 설명. 객체 입출력의 대상이 되는 클래스이자 엔티티 개념의 클래스(DB에 저장된 데이터를 담거나 넣을 데이터를 담을 객체) */
public class Member implements Serializable {       // 객체 입출력을 위해 Serializable 인터페이스 구현
    private int memberNo;           // 회원 번호
    private String id;              // 회원 아이디
    private String pwd;             // 회원 비밀번호
    private int age;                // 회원 나이
    private String[] hobbies;       // 회원 취미들
    private BloodType bloodType;    // 혈액형

    /* 설명. 엔티티 클래스는 setter를 꼭 필요한 것만 만든다. */
    public Member() {
    }

    public Member(String id, String pwd, int age, String[] hobbies) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Member(int memberNo, String id, String pwd, int age, String[] hobbies, BloodType bloodType) {
        this.memberNo = memberNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public int getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                '}';
    }
}
