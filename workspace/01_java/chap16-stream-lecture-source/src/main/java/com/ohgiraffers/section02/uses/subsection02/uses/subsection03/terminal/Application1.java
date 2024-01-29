package com.ohgiraffers.section02.uses.subsection02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 최종연산 중 하나인 calculating에 대해 이해하고 사용할 수 있다. */
        long count = IntStream.range(1, 10).count();
        long sum = IntStream.range(1, 10).sum();

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        OptionalInt max = IntStream.range(1, 10).max();
        OptionalInt test = IntStream.range(1, 1).max();     // OptionalInt.empty 형태로 나오고 기본 자료형에서 존재하지 않음을 나타내기 위함을 알 수 있다.
        OptionalInt min = IntStream.range(1, 10).min();

        /* 설명. OptionalInt는 결과 없음을 나타내야 하는 명확한 요구가 있는 메소드 반환 형식으로 사용하기 위한 타입이다. */
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("test = " + test);

        int oddSum = IntStream.range(1, 10)
                              .filter(i -> i % 2 == 1)
                              .sum();

        System.out.println("oddSum = " + oddSum);
    }
}
