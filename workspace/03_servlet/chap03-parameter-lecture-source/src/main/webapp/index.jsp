<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1 align="center">Request Parameter</h1>
<h3>GET 방식의 요청</h3>
<h4>form 태그를 이용한 get 방식 요청</h4>
<form action="querystring" method="get">
    <label>이름: </label><input type="text" name="name">
    <br>
    <label>나이: </label><input type="number" name="age">
    <br>
    <label>생일: </label><input type="date" name="birthday">
    <br>
    <label>성별: </label>
    <input type="radio" name="gender" id="male" value="M">
    <label for="male">남자</label>
    <input type="radio" name="gender" id="female" value="F">
    <label for="female">여자</label>
    <br>
    <label>국적: </label>
    <select name="national">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
    </select>
    <br>
    <label>취미: </label>
    <input type="checkbox" name="hobbies" id="movie" value="movie"><label for="movie">영화</label>
    <input type="checkbox" name="hobbies" id="music" value="music"><label for="music">음악</label>
    <input type="checkbox" name="hobbies" id="sleep" value="sleep"><label for="sleep">취침</label>
    <br>

    <button>GET 요청</button>
</form>

<h4>a 태그의 href 속성에 직접 파라미터를 쿼리스트링 형태로 작성하여 get 방식 요청하기</h4>
<a href="querystring?name=피카츄&age=10&birthday=2022-11-22&gender=M&national=jp&hobbies=movie&hobbies=music">a태그를 활용한 쿼리스트링 값 전달</a>

<h3>POST 방식의 요청</h3>
<h4>form 태그를 이용한 post 방식 요청</h4>
<form action="formdata" method="post">
    <label>이름: </label><input type="text" name="name">
    <br>
    <label>나이: </label><input type="number" name="age">
    <br>
    <label>생일: </label><input type="date" name="birthday">
    <br>
    <label>성별: </label>
    <input type="radio" name="gender" id="male" value="M">
    <label for="male">남자</label>
    <input type="radio" name="gender" id="female" value="F">
    <label for="female">여자</label>
    <br>
    <label>국적: </label>
    <select name="national">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
    </select>
    <br>
    <label>취미: </label>
    <input type="checkbox" name="hobbies" id="movie" value="movie"><label for="movie">영화</label>
    <input type="checkbox" name="hobbies" id="music" value="music"><label for="music">음악</label>
    <input type="checkbox" name="hobbies" id="sleep" value="sleep"><label for="sleep">취침</label>
    <br>

    <button>POST 요청</button>
</form>
</body>
</html>







