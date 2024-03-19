/* 01. arrow-function-basic-syntax(화살표 함수 기본 문법) */

var message;

/* 기존 함수 표현식 */
message = function() {
    return "Hello World!";
};

console.log(message());

/* function 키워드 생략 및 화살표로 표기 */
message = () => {
    return "Arrow Function!";
};

console.log(message());

/* 함수 실행 구문이 하나만 있는 경우 중괄호 생략 가능 */
/* 함수 내부의 명령문이 값으로 평가 될 수 있는 표현식일 경우 암묵적으로 반환한다.(return 생략 가능) */
message = () => "Arrow Function2!";
message = () => 1 + 2;

console.log(message());

message = (val1, val2) => "Arrow" + val1 + val2;
console.log(message('Function', '!'));

/* 화살표 함수의 매개변수가 없거나 2개 이상일 때는 소괄호를 생략할 수 없지만 하나일 때는 소괄호도 생략 가능하다. */
message = val1 => "Arrow" + val1;
console.log(message(" Functions are Good!!"));