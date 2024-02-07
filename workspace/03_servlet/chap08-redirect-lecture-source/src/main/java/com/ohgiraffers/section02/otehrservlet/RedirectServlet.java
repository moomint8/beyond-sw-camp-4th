package com.ohgiraffers.section02.otehrservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 설명. 리다이렉트 이후 오는 서블릿은 기존과 다른 새로운 request와 response 객체로 오게 된다. */
        System.out.println("리다이렉트 이후 request의 attribute : " + req.getAttribute("test"));

        /* 설명. 파라미터가 넘어오면 request 객체가 달라져도 값이 전달되어 온다. */
        System.out.println("리다이렉트 이후 request의 parameter : " + req.getParameter("test"));

        /* 설명.
         *  redirect 시에는 request의 attribute 개념으로 다른 서블릿에게 값(상태)을 전달할 수 없다.
         *  왜냐하면 다음 서블릿으로 클라이언트가 새로 요청하면 기존의 request와 response 객체가 아닌
         *  새로운 request와 response 객체가 만들어지며 요청하기 때문이다.
         *
         * 설명.
         *  추가로, cookie나 session 같은 공간을 활용하는 방법을 사용해서 값을 공유할 수도 있다.
         */

        /* 설명.
         *  포워딩 vs 리다이렉트
         *   - request나 response 객체를 유지하여 요청 처리를 하고 싶다면 포워딩을 사용하자.
         *   - 클라이언트(브라우저)가 새로고침을 할 때마다 처음 용청하는 서블릿을 다시 호출하게 하고 싶지 않다면
         *     (insert와 같은 경우) 리다이렉트를 사용하자.
         *
         * 설명.
         *   - 포워딩은 request와 attribute를 활용하여 다음 서블릿으로 값을 넘겨줄 수 있다.
         *   - 리다이렉트는 쿼리스트링 형태로 parameter의 개념을 활용하여 다음 서블릿으로 값을 넘겨 줄 수 있다.
         */
    }
}
