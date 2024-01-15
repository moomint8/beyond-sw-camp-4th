package com.ohgiraffers.section01.array;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */
        /* 필기.
         *  배열의 사용 방법
         *   1. 배열의 선언
         *   2. 배열의 할당
         *   3. 배열의 인덱스 공간에 값 대입
         */

        int[] iArr;
//        char cArr[];  // 대괄호를 변수명 뒤에 붙여도 돌아가지만 권장되지 않음

//        iArr = new int[]; 배열은 반드시 크기를 할당해 주어야 한다.
        iArr = new int[10];

        char[] cArr = new char[5];

        /* 필기. 참조자료형 변수 출력 결과 = 자료형@16진수주소값 */
        System.out.println("iArr = " + iArr);
        System.out.println("cArr = " + cArr);

        /* 필기. hashCode()를 통해 10진수 주소값도 확인할 수 있다. */
        System.out.println("iArr = " + iArr.hashCode());
        System.out.println("cArr = " + cArr.hashCode());

        /* 필기. null값을 지닌 참조 자료형 변수(아무것도 참조하지 않을 때)를 접근 시 발생하는 에러 확인 */
        cArr = null;
        System.out.println("null을 참조할 시 : " + cArr.hashCode());
    }
}
