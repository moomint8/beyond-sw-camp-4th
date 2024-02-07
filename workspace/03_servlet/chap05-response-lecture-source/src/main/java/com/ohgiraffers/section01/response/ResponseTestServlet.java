package com.ohgiraffers.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

    public ResponseTestServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 설명.
         *  1. 요청 받기(http method GET/POST 요청에 따른 parameter로 전달 받은 데이터를 꺼낼 수 있다.
         *  2. 비즈니스 로직 처리(DB접속과 CRUD에 대한 로직 처리 시작 부분 -> 서비스 계층 호출(MVC2 구조 기반))
         *  3. 응답하기(문자열을 통한 동적인 웹(HTML 페이지)페이지를 만들어서 스트림을 통해 내보내기)(SSR 기술)
         */

        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!DOCTYPE html>\n")
                .append("<html>\n")
                .append("<head>")
                .append("</head>")
                .append("<body>")
                .append("<h1>한글 servlet response</h1>")
                .append("</body>")
                .append("</html>\n");

        /* 설명. 톰캣 10버전 이전 */
        /* 필기. 1. MIME 타입과 인코딩 방식을 response 객체를 이용해 따로 설정 */
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding("UTF-8");


        /* 필기. 2. MIME 타입과 인코딩 방식을 setContentType으로 합 번에 설정 */
        resp.setContentType("text/html; charset=UTF-8");

        /* 설명. 톰캣 10버전 이후 */
        /* 필기. 3. MIME 타입만 명시해도 인코딩 방식도 UTF-8로 적요오딤 */
//        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.print(responseBuilder);
        out.flush();
        out.close();
    }
}
