package com.ohgiraffers.section01.contextListener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {

    public ContextListener() {

        /* 설명. context가 생성될 때 변화를 감지하는 Listener 인스턴스가 함께 생성된다. */
        System.out.println("context listener 인스턴스 생성됨");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {

        /* 설명. context에 attribute가 추가될 때 동작한다. */
        System.out.println("context attribute 추가됨");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {

        /* 설명. context에 attribute가 삭제될 때 동작한다. */
        System.out.println("context attribute 삭제됨");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {

        /* 설명. context에 attribute가 변경될 때 동작한다. */
        System.out.println("context attribute 변경됨");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        /* 설명. context가 생성될 때 생성자 호출 이후 동작하는 메소드이다. */
        System.out.println("context init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        /* 설명. context가 소멸될 때 동작하는 메소드이다. */
        System.out.println("context destroyed");
    }
}
