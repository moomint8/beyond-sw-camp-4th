package com.ohgiraffers.section04.assignment.run;


import com.ohgiraffers.section04.assignment.aggregate.BloodType;
import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.service.MemberService;

import java.util.Scanner;

/* 설명. 프로그램 실행 및 메뉴 출력과 사용자의 입력을 받을 View에 해당하는 클래스 */
public class Application {
    private static final MemberService memberService = new MemberService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("============== 회원 관리 프로그램 ==============");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요 : ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    memberService.selectAllMembers();
                    break;
                case 2:
                    memberService.selectMember(chooseMemberNo());
                    break;
                case 3:
                    memberService.registMember(signUp());
                    break;
                case 4:
                    memberService.deleteMember(chooseMemberNo());
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 확인 후 다시 입력해주시길 바랍니다.");
            }
        }
    }

    /* 설명. 사용자로부터 회원번호를 제외한 정보를 입력받아(회원가입용 정보) Mmeber 타입으로 반환하는 메소드(파싱 및 가공처리) */
    private static Member signUp() {
        Member newInfo = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();

        System.out.print("비밀번호를 입력하세요 : ");
        String pwd = sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.print("입력할 취미 개수를 입력하세요 : ");
        int length = sc.nextInt();
        sc.nextLine();                  // Scanner 버퍼에 남아있을 엔터 제거용

        String[] hobbies = new String[length];
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print((i + 1) + "번 째 취미를 입력하세요 : ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        newInfo = new Member(id, pwd, age, hobbies);

        System.out.print("혈액형을 입력하세요(A, B, AB, O) : ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch (bloodType) {
            case "A": bt = BloodType.A; break;
            case "B": bt = BloodType.B; break;
            case "AB": bt = BloodType.AB; break;
            case "O": bt = BloodType.O; break;
        }

        /* 필기.
         *  회원으로부터 회원가입을 위한 정보를 입력받아 Member 타입객체 하나로 가공 처리할 때, 방법이 두 가지 있다.
         *   1. 생성자 방식(장점 : 한 줄 코딩 가능, 단점 : 따로 생성자 추가)
         *   2. setter 방식(장점 : 초기화할 갯수 수정 용이, 단점 : 코딩 줄 수 늘어날 수 있음)
         */
        newInfo.setBloodType(bt);

        return newInfo;
    }

    /* 설명. 회원 한 명 조회를 위해 해당 회원 번호를 입력받아 반환하는 메소드 */
    private static int chooseMemberNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호를 입력하세요 : ");

        return sc.nextInt();
    }
}
