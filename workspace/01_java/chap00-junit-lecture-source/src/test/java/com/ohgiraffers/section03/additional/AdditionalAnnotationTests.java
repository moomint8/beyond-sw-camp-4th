package com.ohgiraffers.section03.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

/* 설명. Order 어노테이션으로 테스트 메소드 실행 순서 정하기 위해서는 클래스 상단에 추가할 것 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {
    private static int repeatedTestCnt = 1;     // 카운트 증가를 위해 static으로 선언

    /* 수업목표. Junit에서 제공하는 메소드 관련 추가 어노테이션을 사용할 수 있다. */

    /* 필기. 해당 테스트를 무시할 때 사용하는 어노테이션이다. */
    @Disabled
    @Test
    public void testIgnore() {
    }

    /* 필기. 주어진 시간 안에 테스트가 끝나지 않으면 테스트가 실패한다. */
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeoutSuccess() throws InterruptedException {
        Thread.sleep(900);      // 1000 으로 하면 확률로 오류가 난다. 호출 시간에 일부 영향을 받는듯
    }

    @Test
    @Disabled
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeoutFail() throws InterruptedException {
        Thread.sleep(1001);
    }

    @Test
    @Order(1)
    public void testFirst() {
        System.out.println("1");
    }

    @Test
    @Order(3)
    public void testThird() {
        System.out.println("3");
    }

    @Test
    @Order(2)
    public void testSecond() {
        System.out.println("2");
    }

    @RepeatedTest(10)
    public void repeatedTest() {
        System.out.println("10번 실행이 되나?");
        System.out.println("실행 횟수 : " + repeatedTestCnt);
        repeatedTestCnt++;
    }
}
