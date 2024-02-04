package com.ohgiraffers.chap03.section01.graph_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Application1Tests {
    private static String input;
    private static Integer output;
    @BeforeAll
    public static void set() {

        /* 예시1 */
        input = "7\n" +
                "6\n" +
                "1 2\n" +
                "2 3\n" +
                "1 5\n" +
                "5 2\n" +
                "5 6\n" +
                "4 7";
        output = 4;
    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input, output)
        );
    }
    @DisplayName("DFS1")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void DFS1test(String input, Integer output) throws IOException {
        Integer result = Application1.solution(input);
        Assertions.assertEquals(output, result);
    }
}
