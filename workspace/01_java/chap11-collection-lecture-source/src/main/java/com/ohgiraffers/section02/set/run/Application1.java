package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 hashSet을 이용할 수 있다. */
//        HashSet<String> hashSet = new HashSet<>();
        Set<String> hashSet = new HashSet<>();
        hashSet.add(new String("java"));
        hashSet.add(new String("mariaDB"));
        hashSet.add(new String("servlet"));
        hashSet.add(new String("spring"));
        hashSet.add(new String("html"));

        /* 설명. Set에 저장된 자료는 넣은 순서를 보장하지 않는다. */
        System.out.println("hashSet = " + hashSet);

        /* 설명. 중복값은 Set에 추가되지 않는다.(동등 객체 저장 안함)(feat. equals와 hashCode 오버라이딩 필요) */
        /* 설명. 중복되는 값이 있으면 새로 추가하려는 객체의 주소가 튕겨나간다.(덮어쓰지 않음) */
        hashSet.add(new String("mariaDB"));
        System.out.println("hashSet = " + hashSet);

        /* 설명. 인덱스 개념이 없는 Set은 iterator(반복자)를 돌리거나 배열로 바꿔야 확인 가능하다. */
        Iterator<String> iterator = hashSet.iterator();     // <String> 이렇게 제네릭을 걸어야 다운캐스팅 안해도 됨
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------");

        Object[] objArr = hashSet.toArray();
        for (Object obj : objArr) {
            System.out.println(obj);
        }

        System.out.println("size() : " + hashSet.size());
        hashSet.clear();
        System.out.println("size() : " + hashSet.size());
    }
}
