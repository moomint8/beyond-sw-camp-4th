package com.ohgiraffers.section02.uses.subsection02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 스트림의 최종연산중 하나인 reduce에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  Optional<T> reduce(BinaryOperator<T> accumulator);
         *  T reduce(T identity, BinaryOperator<T> accumulator);
         *  U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
         *  reduce() 라는 메소드는 스트림에 있는 데이터들의 총합을 계산해준다. reduce() 파라미터에 따라 3가지 종류가 있다.
         */

        /* 설명. 인자가 1개일 경우 */
        OptionalInt reduceOneParam = IntStream.range(1, 4)     // 1, 2, 3
                .reduce((a, b) -> {
                    return Integer.sum(a, b);
                });

        System.out.println("reduceOneParam = " + reduceOneParam.getAsInt());

        /* 설명. 인자가 2개일 경우 */
        int reduceTwoParam = IntStream.range(1, 4)      // 1, 2, 3
                .reduce(100, Integer::sum);

        System.out.println("reduceTwoParam = " + reduceTwoParam);

        /* 설명. 인자가 3개일 경우 */
        Integer reduceThreeParam = Stream.of(1, 2, 3, 4, 5, 6 ,7 ,8 ,9 ,10)
                .reduce(100,
                        Integer::sum,
                        (x, y) -> x + y
                );

        System.out.println("reduceThreeParam = " + reduceThreeParam);
    }
}
