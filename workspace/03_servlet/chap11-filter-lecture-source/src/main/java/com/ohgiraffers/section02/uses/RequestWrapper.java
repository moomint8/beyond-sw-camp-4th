package com.ohgiraffers.section02.uses;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@WebServlet
public class RequestWrapper extends HttpServletRequestWrapper {
    public RequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String key) {
        String value = "";

        /* 설명. 'password'라는 키 값으로 getParameter 사용 시에 그 반환 값은 암호화해서 반환 */
        if("password".equals(key)) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            value = passwordEncoder.encode(super.getParameter("password"));
        } else {
            /* 설명. 그 외의 키 값은 기존대로 동작 */
            value = super.getParameter(key);
        }

        return value;
    }
}
