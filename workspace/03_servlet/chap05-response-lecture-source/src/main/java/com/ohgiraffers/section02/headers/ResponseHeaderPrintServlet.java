package com.ohgiraffers.section02.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

@WebServlet("/header")
public class ResponseHeaderPrintServlet extends HttpServlet {
    public ResponseHeaderPrintServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 설명. 서버의 현재 시간을 동적인 페이지로 만들어 내보내자 */
        /* 설명. response 객체를 생성할 때는 MIME 타입 및 인코딩을 고려할 것 */
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        long currentTime = System.currentTimeMillis();

        out.print("<h1>" + currentTime + "</h1>");
        out.print("<h1>" + new java.util.Date(currentTime) + "</h1>");
        out.flush();
        out.close();

        /* 설명. response 객체의 header 값에 대한 키 값과 밸류 값을 한 번에 확인해보기 */
        Collection<String> responseHeaders = resp.getHeaderNames();
        Iterator<String> iter = responseHeaders.iterator();
        while (iter.hasNext()) {
            String headerName = iter.next();
            System.out.println(headerName + " : " + resp.getHeader(headerName));
        }
    }
}
