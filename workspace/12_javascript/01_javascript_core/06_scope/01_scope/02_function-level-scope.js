/* 02. function-level-scope(함수 레벨 스코프) */
/*
  C, 자바 등 대부분의 프로그래밍 언어는 모든 코드블록(if, for, while, try/catch 등)이 지역 스코프를 만드는
  블록 레벨 스코프(block level scope)를 가진다.
  하지만 var 키워드로 선언 된 변수는 함수의 코드블록(함수 몸체)만을 지역 스코프로 인정하는
  함수 레벨 스코프(function level scope)를 가진다.
  이후 이 부분을 통일하기 위해 ES6에서 도입된 let, const 키워드를 다루게 된다.
*/

/* 전역변수 */
var i = 0;

/* 
  for문 코드 블럭({}) 내부에서 i라는 변수는 지역변수의 개념이 아니다
  (함수 블럭({})이 아니면 var는 하나의 스코프로 보지 않는다.) 
*/
for(var i = 0; i < 10; i++) {

}

/* 의도와 달리 for문 내부의 값 변화가 외부에도 반영된다. */
console.log(i);