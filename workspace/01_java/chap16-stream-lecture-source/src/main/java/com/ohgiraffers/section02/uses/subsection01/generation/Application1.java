package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 배열이나 컬렉션은 스트림을 이용할 수 있고, 이를 이해해서 활용할 수 있다. */
        String[] strArr = new String[]{"java", "oracle", "jdbc"};

        /* 필기.
         *  Arrays.stream(배열) : 배열 자료형을 Stream 자료형으로 변환
         */
        /* 설명. 1. 배열로 스트림 생성 */
        Stream<String> stringStream1 = Arrays.stream((strArr));
        stringStream1.forEach(System.out::println);
//        stringStream1.forEach(s -> System.out.println(s));

        System.out.println("======================================================");

        Stream<String> stringStream2 = Arrays.stream(strArr, 0, 2);
        stringStream2.forEach((System.out::println));
        System.out.println();

        /* 설명. 2. 컬렉션 스트림 생성 */
        List<String> stringList = Arrays.asList("html", "css", "javascript");

        Stream<String> stringStream3 = stringList.stream();
        stringStream3.forEach(System.out::println);
        System.out.println();

        /* 설명. 3.
         *  Builder를 활용한 스트림 생성
         *  builder는 static<T>로 되어있는 메소드이며, 호출 시 타입 파라미터를 메소드 호출 방식으로 전달한다.
         */
        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();

        builderStream.forEach(System.out::println);

        /* 설명. 4. iterator()를 활용하여 수열 형태의 스트림을 생성할 수도 있다. */
        Stream<Integer> integerStream = Stream.iterate(10, value -> value * 2)
                .limit(10);
        integerStream.forEach(value -> System.out.print(value + " "));
    }
}
