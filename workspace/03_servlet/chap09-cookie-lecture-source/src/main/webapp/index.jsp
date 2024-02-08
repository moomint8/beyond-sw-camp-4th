<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1 align="center">Cookie handling</h1>

<form action="cookie" method="post">
    <table style="margin:auto">
        <tr>
            <td>firstName: </td>
            <td><input type="text" name="firstName"></td>
        </tr>
        <tr>
            <td>lastName: </td>
            <td><input type="text" name="lastName"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="submit">전송</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>