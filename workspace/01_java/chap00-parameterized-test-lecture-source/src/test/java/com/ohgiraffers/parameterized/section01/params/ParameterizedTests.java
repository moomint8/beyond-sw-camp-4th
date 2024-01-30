package com.ohgiraffers.parameterized.section01.params;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.lang.annotation.*;
import java.time.Month;
import java.util.stream.Stream;

public class ParameterizedTests {

    /* 목차. 1. @ValueSource를 이용한 parameter value 목록 지정 */
    /* 설명. @ValueSource를 이용하여 한 개의 파라미터로 전달할 값들의 목록을 지정할 수 있다. */
    /* 설명. 가능한 자료형은 short, int, long, float, double, char, java.lang패키지 클래스들(String 포함) */
    @DisplayName("홀수 짝수 판별 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 3, -1, 15, 123})
    void testIsOdd(int number) {

        //when
        boolean result = NumberValidator.isOdd(number);

        //then
        Assertions.assertTrue(result);
    }

    /* 목차. 2. @NullSource와 @EmptySource */
    @DisplayName("null값 테스트")
    @ParameterizedTest
    @NullSource
    void testIsNull(String input) {

        //when
        boolean result = StringValidator.isNull(input);

        //then
        Assertions.assertTrue(result);
    }

    @DisplayName("empty값 테스트")
    @ParameterizedTest
    @EmptySource
    void testIsEmpty(String input) {

        //when
        boolean result = StringValidator.isEmpty(input);

        //then
        Assertions.assertTrue(result);
    }

    @DisplayName("blank값 테스트")
    @ParameterizedTest
    @NullAndEmptySource
    void testIsBlank(String input) {

        //when
        boolean result = StringValidator.isBlank(input);

        //then
        Assertions.assertTrue(result);
    }

    /* 목차. 3. 열거형을 이용한 @EnumSource 활용하기 */
    /* 설명. Enum의 필드 갯수만큼 각각 파라미터로 넣어주며 테스트 메소드 동작시킴 */
    @DisplayName("Month에 정의된 타입들이 1~12월 사이의 범위인지 테스트")
    @ParameterizedTest
    @EnumSource(Month.class)
    void testMonthValueIsCollect(Month month) {

        //when
        boolean result = DateValidator.isCollect(month);

        //then
        Assertions.assertTrue(result);
    }

    @DisplayName("4월, 6월, 9월, 11월이 30일인지 확인")
    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void testHasThirtyDaysLong(Month month) {

        //given
        int verifyValue = 30;

        //when
        int actual = DateValidator.getLastDayOf(month);

        //then
        Assertions.assertEquals(verifyValue, actual);
    }

    @DisplayName("2월, 4월, 6월, 9월, 11월을 제외한 달이 31일인지 확인")
    @ParameterizedTest
    @EnumSource(
            value = Month.class,
            names = {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"},
            mode = EnumSource.Mode.EXCLUDE
    )
    void testHasThityOneDaysLong(Month month) {

        //given
        int verifyValue = 31;

        //when
        int actual = DateValidator.getLastDayOf(month);

        //then
        Assertions.assertEquals(verifyValue, actual);
    }

    /* 목차. 4. @CsvSource를 이용한 CSV 리터럴 */
    @DisplayName("영문자를 대문자로 변경하는지 확인")
    @ParameterizedTest
//    @CsvSource({"test,TEST", "tEst,TEST", "JavaScript, JAVASCRIPT"})
    @CsvSource(
            value = {"test:TEST", "tEst:TEST", "JavaScript: JAVASCRIPT"},
            delimiter = ':'
    )
    void testToUpperCase(String input, String verifyValue) {

        //when
        String actual = input.toUpperCase();

        //then
        Assertions.assertEquals(verifyValue, actual);
    }

    @DisplayName("CSV 파일을 읽은 테스트 데이터를 테스트에 활용하는지 확인")
    @ParameterizedTest
    @CsvFileSource(resources = "/parameter-test-data.csv", numLinesToSkip = 1)
    void testToUpperCaseWithCSVFileData(String input, String verifyValue) {

        //when
        String actual = input.toUpperCase();

        //then
        Assertions.assertEquals(verifyValue, actual);
    }

    /* 목차. 5. @MethodSource를 활용한 메소드 인수 활용하기 */
    /* 필기. Stream을 반환하는 메소드를 만들어서 이를 테스트에 활용할 수 있다. */

    private static Stream<Arguments> providerStringSource() {

        return Stream.of(
                Arguments.of("hello world", "HELLO WORLD"),
                Arguments.of("JavaScript", "JAVASCRIPT"),
                Arguments.of("tEsT", "TEST")
        );
    }

    @DisplayName("메소드 소스를 활용한 대문자 변환 테스트")
    @ParameterizedTest
    @MethodSource("providerStringSource")
//    @MethodSourceStringSource
    void testToUpperCaseWithMethodSource(String input, String verifyValue) {

        //when
        String actual = input.toUpperCase();

        //then
        Assertions.assertEquals(verifyValue, actual);
    }

    /* 설명. 어노테이션을 만들어서 메소드명을 하나하나 작성하지 않아도 되게 할 수 있다. */
    @Documented
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @MethodSource("providerStringSource")
    private @interface MethodSourceStringSource {}

    /* 목차. 6. ArgumentsProvider를 이용한 메소드 소스 사용 */
    @DisplayName("두 수를 더한 결과를 정상적으로 반환하는지 테스트")
    @ParameterizedTest(name = "[{index}] {0} + {1} = {2} (이)가 맞는지 확인")
    @ArgumentsSource(SumTwoNumbersArgumentsProvider.class)
    void testSumTwoNumbers(int num1, int num2, int verifyValue) {

        //when
        int actual = Calculator.sumTwoNumbers(num1, num2);

        //then
        Assertions.assertEquals(verifyValue, actual);
    }
}
