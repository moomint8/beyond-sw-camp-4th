package com.ohgiraffers.section03.annotationConfig.subSection01.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    /* 필기.
     *  section03에서는 ComponentScan과 관련하여 java클래스와 xml 방식으로 사용하는 방법을 확인할 것이다.
     *  이 중에서도 java클래스와 @ComponentScan 방식을 자주 사용하고 있다.
     *  bean으로 관리되는 객체는 기본적으로 싱글톤이기에 각 하나의 객체만 생성된다.
     */
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }
    }
}
