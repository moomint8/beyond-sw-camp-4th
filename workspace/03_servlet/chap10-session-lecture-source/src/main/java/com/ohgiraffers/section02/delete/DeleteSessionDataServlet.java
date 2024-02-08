package com.ohgiraffers.section02.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        System.out.println("attribute 만료 전 firstName" + session.getAttribute("firstName"));
        System.out.println("attribute 만료 전 lastName" + session.getAttribute("lastName"));

        /* 설명.
         *  session.invalidate()는 HttpSession 객체의 Attribute 값들을 무효화
         *  session을 삭제하는 것이 아니라 값들을 무효화함.
         *  따라서 Attribute들을 가져올 수 없게 되고 500 error 발생
         *  session 자체가 삭제된 것은 아니므로 만료시간 전까지 set 을 통해 값을 다시 담는 것은 가능
         */
        session.invalidate();
        System.out.println("attribute 만료 후 firstName" + session.getAttribute("firstName"));
        System.out.println("attribute 만료 후 lastName" + session.getAttribute("lastName"));
    }
}
