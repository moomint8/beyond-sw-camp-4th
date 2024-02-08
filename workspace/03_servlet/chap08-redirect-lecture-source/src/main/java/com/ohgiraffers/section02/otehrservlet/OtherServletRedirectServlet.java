package com.ohgiraffers.section02.otehrservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/otherservlet")
public class OtherServletRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("test", "abc");
//        resp.sendRedirect("redirect");

        /* 설명. 리다이렉트를 해서 다시 다른 서블릿으로 갈 때 파라미터를 추가하면 어느정도 상태를 전달할 수 있다. */
        resp.sendRedirect("redirect?test=abc");
    }
}
