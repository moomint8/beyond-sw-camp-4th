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

public class Application1Tests {
    private static Integer input1, input2, input3;
    private static Integer output1,output2, output3;
    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = 18;
        output1 = 4;
        input2 = 4;
        output2 = -1;
        input3 = 6;
        output3 = 2;
    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1),
                arguments(input2, output2),
                arguments(input3, output3)
        );
    }
    @DisplayName("greedy1")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void greedy1test(Integer input, Integer output) throws Exception {
        Integer result = Application1.solution(input);
        Assertions.assertEquals(output, result);
    }
}
