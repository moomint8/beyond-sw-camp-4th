package com.ohgiraffers.section01.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* 필기. 테스트 클래스들은 클래스명 끝에 "Tests"를 붙여 작명한다. */
public class TestAnnotationTests {

    /* 수업목표. Junit5의 기본 어노테이션을 사용할 수 있다. */
    /* 필기.
     *  단위 테스트 : layered architecture에서 각 계층마다 단위 메소드를 테스트하는 것을 말한다.
     *  통합 테스트 : layer 단위가 아닌 전체 기능 동작에 대해 테스트 하는 것을 말한다.
     *  테스트 케이스 : 테스트 대상이 되는 기능에 대해 시나리오 별로 어떤 것을 테스트하는지에 대해 정의한 것을 말한다.
     */

    /* 설명.
     *  @Test는 기본적인 테스트 메소드를 만들기 위해 사용하는 어노테이션이다.
     *  @Test 메소드는 단독으로 실행이 가능하다.(main 메소드가 아니어도)
     */
    @Test
    @DisplayName("첫 번째 테스트")
    public void testMethod1() {
    }

    /* 설명. 과거에는 공백문자를 언더스코어로 표기한 한글 메소드 형태로 테스트 메소드를 작성하기도 했다. */
    @Test
    @DisplayName("DisplayName이 우선순위가 더 높음")
    public void 매개변수로_1과_3을_넘겼을_때_합계를_int형으로_잘_반환하는지_확인() {

    }
}
