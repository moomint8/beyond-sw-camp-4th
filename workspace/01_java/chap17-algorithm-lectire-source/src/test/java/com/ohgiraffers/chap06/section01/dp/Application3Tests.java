package com.ohgiraffers.chap06.section01.dp;

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
    private static Integer input1, input2;
    private static Integer output1,output2;
    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = 6;
        output1 = 3;
        input2 = 12;
        output2 = 16;

    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1),
                arguments(input2, output2)
        );
    }
    @DisplayName("dp3")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void dp3test(Integer input, Integer output) throws Exception {
        Integer result = Application3.solution(input);
        Assertions.assertEquals(output, result);
    }
}
