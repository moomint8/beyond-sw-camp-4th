/* global object(전역 객체) */
/*
  전역 객체는 코드가 실행되기 이전 단계에 자바스크립트 엔진에 의해 어떤 객체보다도 먼저 생성되는
  어떤 객체에도 속하지 않은 최상위 객체를 뜻한다.
  Node.js 환경에서는 global이 전역객체이고, 웹 브라우저 환경(개발자 도구의 콘솔 창)에서는 window가 전역객체이다.
*/


/* 글로벌 객체 */
console.log(this);

/* 글로벌 객체가 가진 프로퍼티 확인 */
console.log(Object.getOwnPropertyDescriptors(global));

/* Infinity */
console.log(global.Infinity);
console.log(10/0);

/* NaN */
console.log(global.NaN);
console.log(Number('abc'));

/* undefined */
console.log(global.undefined);
var nothing;
console.log(nothing);