<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1 align="center">Exception Handler</h1>

    <!--
        Exception 핸들링 해보기
        1. web.xml을 통해 에러 상태 코드 발생 시 어떤 서블릿으로 요청할지 url 경로 설정해보기
        2. 모든 에러에 대해 페이지를 동적으로 처리할 페이지를 req의 attribute에 담긴 값을
           활용하여 동적 페이지로 응답해보기
    -->
    <ul>
        <li><a href="show404error">404 에러 확인</a></li>
        <li><a href="show500error">500 에러 확인</a></li>
    </ul>
</body>
</html>