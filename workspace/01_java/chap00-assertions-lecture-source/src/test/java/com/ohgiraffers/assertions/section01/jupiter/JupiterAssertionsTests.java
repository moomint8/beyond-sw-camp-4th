package com.ohgiraffers.assertions.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JupiterAssertionsTests {

    /* 수업목표. Junit5 에서 제공하는 Assertions 에서 제공하는 메소드에 대해 이해하고 활용할 수 있다. */

    /* 목차. 1. assertEquals */
    /* 필기. assertEquals(expected, result) 메소드는 실제 값과 기대 값의 일치 여부를 통일성으로 판단한다. */
    @Test
    @DisplayName("두 숫자 덧셈 테스트")
    public void testAsserEquals() {

        /* 설명. 1. given */
        int firstNum = 10;
        int secondNum = 20;
        int expected = 30;

        /* 설명. 2. when */
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(firstNum, secondNum);

        /* 설명. 3. then */
//        Assertions.assertEquals(expected, result, 1);   // 끝에 1은 오차범위
        Assertions.assertEquals(expected, result, "이건 정확해야 합니다!");   // 에러 메시지
    }

    /* 목차. 2. assertNotEquals */
    /* 필기. assertNotEquals(expected, result) 메소드는 실제 값과 기대 값의 불일치 여부를 동일성으로 판단한다. */
    @Test
    @DisplayName("인스턴스 동일성 비교 테스트")
    void testAssertNotEqualsWithInstances() {
        // given
        Object obj1 = new Object();

        // when
        Object obj2 = new Object();

        // then
        Assertions.assertNotEquals(obj1, obj2);

        /* 설명. equals()와 hashCode()가 오버라이딩 되어 있다면 동등비교로 판단한다. */
    }

    /* 목차. 3. assertNull */
    @Test
    @DisplayName("null인지 테스트")
    void testAssertNull() {

        // given
        String string;

        // when
        string = null;

        // then
        Assertions.assertNull(string);
    }

    /* 목차. 4. assertNotNull */
    @Test
    @DisplayName("Not null인지 테스트")
    void testAssertNotNull() {

        // given
        String string;

        // when
        string = "";

        // then
        Assertions.assertNotNull(string);
    }

    /* 목차. 5. assertAll */
    @Test
    @DisplayName("동시에 여러 가지 값에 대한 검증을 수행하는 경우 테스트")
    void testAssertAll() {

        // given
        String firstName = "길동";
        String lastName = "홍";

        // when
        Person person = new Person(firstName, lastName);

        // then
        Assertions.assertAll(
                "그룹화된 테스트의 이름(테스트 실패 시 출력)",
                () -> Assertions.assertEquals(firstName, person.getFirstName(), () -> "firstName이 잘못됨"),
                () -> Assertions.assertEquals(lastName, person.getLastName(), () -> "lastName이 잘못됨")
        );
    }

    /* 목차. 6. assertThrows */
    @Test
    @DisplayName("void 메소드의 경우 exception이 발생하는지 테스트")
    void testAssertThrows() {

        int firstNum = 10;
        int secondNum = 0;
        String expectedErrorMessage = "0으로 나눌 수 없습니다.";

        PositiveNumberValidate validate = new PositiveNumberValidate();
        Exception exception = Assertions.assertThrows(
                Exception.class,
                () -> validate.checkDividableNumbers(firstNum, secondNum)
        );

        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(IllegalArgumentException.class, exception,
                        () -> "예외 타입이 일치하지 않음"),
                () -> Assertions.assertEquals(expectedErrorMessage, exception.getMessage(),
                        () -> "예외 메시지가 일치하지 않음")
        );
    }

    /* 목차. 7. 자주쓰는 나머지 단정문 */
    /* 설명. assertTrue(), assertFalse() */
}
