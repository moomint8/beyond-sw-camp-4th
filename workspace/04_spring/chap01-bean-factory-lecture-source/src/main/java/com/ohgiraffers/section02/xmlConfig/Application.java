package com.ohgiraffers.section02.xmlConfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new GenericXmlApplicationContext("section02/xmlConfig/spring-context.xml");

        MemberDTO member = (MemberDTO) context.getBean("member");
        System.out.println("member = " + member);
    }
}
