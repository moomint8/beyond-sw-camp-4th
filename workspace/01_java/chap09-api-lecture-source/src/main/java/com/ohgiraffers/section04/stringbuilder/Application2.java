package com.ohgiraffers.section04.stringbuilder;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법을 이해할 수 있다. */
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        /* 필기. capacity() : 용량을 정수형으로 반환하는 메소드(초기 16Byte 할당) */
        for (int i = 0; i < 50; i++) {
            sb.append(i);

            /* 설명. 용량은 초과할 것 같으면 X2 + 1만큼 관리한다. */
            System.out.println("sb : " + sb);
            System.out.println("sb.capacity() : " + sb.capacity());
            System.out.println("hashCode := " + System.identityHashCode(sb));
        }

//        StringBuilder sb2 = new StringBuilder("javamariaDB");   // 문자열 크기 + 16Byte
        StringBuffer sb2 = new StringBuffer("javamariaDB");   // 문자열 크기 + 16Byte

        /* 필기.
         *  delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
         *  deleteCharAt : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
         */
//        System.out.println("delete() : " + sb2.delete(2, 5));                   // jaariaDB
//        System.out.println("deleteCharAt() : " + sb2.deleteCharAt(0));    // aariaDB

        /* 필기.
         *  insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
         */
        System.out.println("insert() : " + sb2.insert(1, "vao"));
        System.out.println("insert() : " + sb2.insert(0, "j"));
        System.out.println("insert() : " + sb2.insert(sb2.length(), "jdbc"));

        /* 필기.
         *  reverse() : 문자열 인덱스 순번을 역순으로 재배열한다.
         */
        System.out.println("reverse() : " + sb2.reverse());
    }
}
