package com.ohgiraffers.chap05.section01.tree;

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
    private static String input1;
    private static String output1;

    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = "7\n" +
                "A B C\n" +
                "B D .\n" +
                "C E F\n" +
                "E . .\n" +
                "F . G\n" +
                "D . .\n" +
                "G . .";
        output1 = "ABDCEFG\n" +
                "DBAECFG\n" +
                "DBEGFCA";

    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1)
        );
    }

    @DisplayName("tree1")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void greedy2test(String input, String output) throws Exception {
        String result = Application2.solution(input);
        Assertions.assertEquals(output, result);
    }
}
