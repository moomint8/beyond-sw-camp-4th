package com.ohgiraffers.section01.othercite;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/othercite")
public class OtherCiteRedirectServlet extends HttpServlet {
    public OtherCiteRedirectServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get 요청을 받으면 naver 사이트로 redirect");

        /* 설명. 리다이렉트는 우리 서블릿 객체 뿐 아니라 외부 사이트로도 연결이 가능하다. */
        resp.sendRedirect("https://www.naver.com");
    }
}
