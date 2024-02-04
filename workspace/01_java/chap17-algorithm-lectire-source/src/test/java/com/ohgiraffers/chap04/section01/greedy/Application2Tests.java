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
public class Application2Tests {
    private static String input1, input2;
    private static Integer output1, output2;

    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = "10 4200\n" +
                "1\n" +
                "5\n" +
                "10\n" +
                "50\n" +
                "100\n" +
                "500\n" +
                "1000\n" +
                "5000\n" +
                "10000\n" +
                "50000";
        output1 = 6;
        input2 = "10 4790\n" +
                "1\n" +
                "5\n" +
                "10\n" +
                "50\n" +
                "100\n" +
                "500\n" +
                "1000\n" +
                "5000\n" +
                "10000\n" +
                "50000";
        output2 = 12;

    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1),
                arguments(input2, output2)
        );
    }

    @DisplayName("greedy2")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void greedy2test(String input, Integer output) throws Exception {
        Integer result = Application2.solution(input);
        Assertions.assertEquals(output, result);
    }
}
