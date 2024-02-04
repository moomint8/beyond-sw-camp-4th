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

public class Application3_2Tests {
    private static String input1, input2;
    private static Integer output1, output2;

    @BeforeAll
    public static void set() {

        input1 = "5\n" +
                "1 4\n" +
                "2 3\n" +
                "3 5\n" +
                "4 6\n" +
                "5 7\n";
        output1 = 3;

        input2 = "3\n" +
                "3 3\n" +
                "1 3\n" +
                "2 3\n";
        output2 = 2;


    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1),
                arguments(input2, output2)
        );
    }

    @DisplayName("greedy3_2")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void greedy3_2test(String input, Integer output) throws Exception {
        Integer result = Application3_2.solution(input);
        Assertions.assertEquals(output, result);
    }
}
