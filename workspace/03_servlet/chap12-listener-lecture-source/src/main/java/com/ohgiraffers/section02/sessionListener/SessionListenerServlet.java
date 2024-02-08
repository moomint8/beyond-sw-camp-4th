package com.ohgiraffers.section02.sessionListener;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session")
public class SessionListenerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 설명. 사용자가 입력한 값을 꺼내 DB에서 일치하는 회원을 찾고(로그인 성공) 해당 회원 정보를 session에 담는 느낌의 예제 */
        HttpSession session = req.getSession();

        session.setAttribute("userName", "kimohjin");
        session.setAttribute("age", 23);
        session.setAttribute("gender", "M");

        session.setAttribute("userName", "kim");
        session.setAttribute("user", new UserDTO("kimohjin", 23));

        session.removeAttribute("user");

        session.invalidate();
    }
}
