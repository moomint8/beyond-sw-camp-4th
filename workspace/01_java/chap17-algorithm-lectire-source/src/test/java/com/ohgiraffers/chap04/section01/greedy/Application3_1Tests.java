package com.ohgiraffers.chap04.section01.greedy;

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

public class Application3_1Tests {
    private static String input1;
    private static Integer output1;

    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = "11\n" +
                "1 4\n" +
                "3 5\n" +
                "0 6\n" +
                "5 7\n" +
                "3 8\n" +
                "5 9\n" +
                "6 10\n" +
                "8 11\n" +
                "8 12\n" +
                "2 13\n" +
                "12 14";
        output1 = 4;

    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1)

        );
    }

    @DisplayName("greedy3_1")
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void greedy3_1test(String input, Integer output) throws Exception {
        Integer result = Application3_1.solution(input);
        Assertions.assertEquals(output, result);
    }
}
