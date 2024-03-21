/* 01. parameter-and-argument(매개변수와 인수) */

/* 함수 선언문 */
function hello(name) {
    console.log('넘어온 값: ', name);

    /* 모든 인수(전달인자)는 암묵적으로 arguments 객체의 프로퍼티로 보관된다.(일종의 가변인자 개념) */
    console.log('arguments: ', arguments);
    console.log('두번째 인자: ', arguments['1']);  

    return `${name}님 안녕하세요!`;
}

var result = hello('홍길동');
console.log(result);

result = hello();
console.log(result);

result = hello('이순신', '유관순');
console.log(result);