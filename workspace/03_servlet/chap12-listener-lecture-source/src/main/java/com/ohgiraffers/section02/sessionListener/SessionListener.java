package com.ohgiraffers.section02.sessionListener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.*;

@WebListener
public class SessionListener implements HttpSessionListener
        , HttpSessionAttributeListener, HttpSessionBindingListener {

    /* 설명. Binding 리스너는 SessionListener가 아닌 Session에 담기는 타입의 클래스에 직접 각각 정의해야 한다. */
//    @Override
//    public void valueBound(HttpSessionBindingEvent event) {
//        HttpSessionBindingListener.super.valueBound(event);
//    }
//
//    @Override
//    public void valueUnbound(HttpSessionBindingEvent event) {
//        HttpSessionBindingListener.super.valueUnbound(event);
//    }

    public SessionListener() {
        System.out.println("session listener 인스턴스 생성");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("session attribute added!!");

        System.out.println("session 추가된 attribute : " + event.getName() + ", " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("session attribute removed!!");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("session attribute replaced!!");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session created!!");
        System.out.println("생성 session id : " + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session destroyed!!");
    }
}

