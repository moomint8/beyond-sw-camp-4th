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

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Application4Tests {

    private static int low1 = 0, low2 = 0;
    private static int high1, high2;
    private static int[] act1, act2;
    private static int[] exp1, exp2;

    public Application4Tests() {
    }

    @BeforeAll
    public static void set() {

        /* 예시1 */
        high1 = 7;      // size는 8
        act1 = new int[]{7, 25, 33, 8, 12, 5, 29, 31};
        exp1 = new int[]{5, 7, 8, 12, 25, 29, 31, 33};

        /* 예시2 */
        high2 = 8;      // size는 9
        act2 = new int[]{46, 13, 14, 23, 28, 31, 32, 17, 3};
        exp2 = new int[]{3, 13, 14, 17, 23, 28, 31, 32, 46};
    }

    public static Stream<Arguments> provideDescendingSource() {
        return Stream.of(
                arguments(low1, high1, act1, exp1),
                arguments(low2, high2, act2, exp2)
        );
    }

    @DisplayName("퀵 정렬 테스트")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideDescendingSource")
    public void selectionSortTests(int low, int high, int[] actual, int[] expected) {
        Application4.solution(low, high, actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}