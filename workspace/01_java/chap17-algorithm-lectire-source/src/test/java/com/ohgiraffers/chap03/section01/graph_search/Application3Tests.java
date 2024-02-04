package com.ohgiraffers.chap03.section01.graph_search;

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

public class Application3Tests {
    private static String input1, input2, input3;
    private static Integer output1,output2, output3;
    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = "4 6\n" +
                "101111\n" +
                "101010\n" +
                "101011\n" +
                "111011";
        output1 = 15;
        input2 = "4 6\n" +
                "110110\n" +
                "110110\n" +
                "111111\n" +
                "111101";
        output2 = 9;
        input3 = "2 25\n" +
                "1011101110111011101110111\n" +
                "1110111011101110111011101";
        output3 = 38;

    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1),
                arguments(input2, output2),
                arguments(input3, output3)
        );
    }
    @DisplayName("BFS2")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void BFS2test(String input, Integer output) throws Exception {
        Integer result = Application3.solution(input);
        Assertions.assertEquals(output, result);
    }
}
