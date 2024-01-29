package com.ohgiraffers.section02.uses.subsection02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 스트림의 최종연산중 하나인 match에 대해 이해하고 사용할 수 있다. */
        /* boolean anyMatch(Predicate<? super T> predicate);     // 하나라도 조건을 만족하는 값이 있는지
         * boolean allMatch(Predicate<? super T> predicate);     // 모든 조건을 만족하는지
         * boolean noneMatch(Predicate<? super T> predicate);    // 모든 조건을 만족하지 않는지
         * */
        List<String> stringList = Arrays.asList("Java", "Spring", "SpringBoot");

        boolean anyMatch = stringList.stream()
                .anyMatch(str -> str.contains("p"));
        boolean allMatch = stringList.stream()
                .allMatch(str -> str.length() > 4);
        boolean noneMatch = stringList.stream()
                .noneMatch(str -> str.contains("c"));

        System.out.println("anyMatch = " + anyMatch);
        System.out.println("allMatch = " + allMatch);
        System.out.println("noneMatch = " + noneMatch);
    }
}
