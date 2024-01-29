package com.ohgiraffers.section02;

import org.junit.jupiter.api.*;

public class LifecycleAnnotationTests {

    /* 수업목표. 테스트 메소드의 실행 전 후에 동작하는 어노테이션을 사용할 수 있다. */
    /* 설명.
     *  모든 테스트 메소드와 라이프사이클 관련 메소드는 abstract이면 안되고, void 반환형으로 작성해야 한다.
     *  또한, 접근제어자는 사용하지 않아도 되지만(default), private이면 안된다.
     */
    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    /* 필기. 테스트가 실행되기 전 단 한 번만 실행된다. */
    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
    }

    /* 필기. 각각의 테스트 메소드가 실행되기 전 실행되며 주로 테스트 전에 필요한 MockUp 데이터를 미리 세팅할 목적으로 사용된다. */
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    /* 필기. 모든 단위 테스트가 완전히 끝난 후 단 한 번만 실행된다. */
    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }

    /* 필기.
     *  각각의 테스트 메소드가 동작한 직후 동작한다.
     *  주로 단위 테스트들이 수정된 이후 사용한 자원을 반납/해제할 목적으로 사용된다.
     */
    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }
}
