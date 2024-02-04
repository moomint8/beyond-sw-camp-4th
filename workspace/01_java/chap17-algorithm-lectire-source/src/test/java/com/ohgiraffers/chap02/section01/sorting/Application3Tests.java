package com.ohgiraffers.chap02.section01.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Application3Tests {

    private static int input1, input2;
    private static int[] act1, act2;
    private static int[] exp1, exp2;

    @BeforeAll
    public static void set() {

        /* 설명. 예시 1 */
        input1 = 7;
        act1 = new int[]{34, 23, 5, 24, 1, 9, 12};
        exp1 = new int[]{1, 5, 9, 12, 23, 24, 34};

        /* 설명. 예시 1 */
        input2 = 6;
        act2 = new int[]{40, 47, 38, 8, 33, 35};
        exp2 = new int[]{8, 33, 35, 38, 40, 47};
    }

    public static Stream<Arguments> provideAscendingSource() {
        return Stream.of(
                Arguments.of(input1, act1, exp1),
                Arguments.of(input2, act2, exp2)
        );
    }


    @DisplayName("삽입 정렬 테스트")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideAscendingSource")
    public void bubbleSortTests(int length, int[] actual, int[] expected) {
        Application3.solution(length, actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}
