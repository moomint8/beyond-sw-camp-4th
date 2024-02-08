<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1 align="center">forward</h1>

    <form action="forward" method="post">
        <table align="center">
            <tr>
                <td>아이디:</td>
                <td><input type="text" name="userId"></td>
                <td rowspan="2">
                    <button type="submit" style="height:50px">로그인</button>
                </td>
            </tr>
            <tr>
                <td>비밀번호:</td>
                <td><input type="password" name="password"></td>
            </tr>
        </table>
    </form>
</body>
</html>