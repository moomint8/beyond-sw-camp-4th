package com.ohgiraffers.section01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class A_EntityManagerLifeCycleTests {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpaTest");
    }

    @BeforeEach
    public void initManager() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Test
    public void 엔티티_매니저_팩토리와_앤티티_매니저_생명주기_확인1() {
        System.out.println("entityManagerFactory.hashCode(): " + entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode(): " + entityManager.hashCode());
    }

    @Test
    public void 엔티티_매니저_팩토리와_앤티티_매니저_생명주기_확인2() {
        System.out.println("entityManagerFactory.hashCode(): " + entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode(): " + entityManager.hashCode());
    }

    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }

    @AfterEach
    public void closeManager() {
        entityManager.close();
    }
}
