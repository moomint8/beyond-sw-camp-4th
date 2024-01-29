package com.ohgiraffers.section02.uses.subsection02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 스트림의 최종연산중 하나인 collect에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  collect() 는 Collector 타입을 받아서 처리하는데, 해당 메소드를 통해 컬렉션을 출력으로 받을 수 있다.
         *  collect() 메소드는 Collector 객체에서 제공하는 정적 메소드를 사용할 수 있다.
         */
        List<Member> memberList = Arrays.asList(
                new Member("test01", "testName01"),
                new Member("test02", "testName02"),
                new Member("test03", "testName03")
        );

        List<String> collectorCollection = memberList
                .stream()
                .map(Member::getMemberName)
                .collect(Collectors.toList());

        System.out.println("collectorCollection = " + collectorCollection);

        /* 설명. joining()는 요소들을 하나의 합쳐서 하나의 문자열로 바꿔주는 메소드이다. */
        String str = memberList
                .stream()
                .map(Member::getMemberName)
                .collect(Collectors.joining());

        System.out.println("str = " + str);

        String str2 = memberList
                .stream()
                .map(Member::getMemberName)
                .collect(Collectors.joining(" || ", "**", "**"));

        System.out.println("str2 = " + str2);
    }
}
