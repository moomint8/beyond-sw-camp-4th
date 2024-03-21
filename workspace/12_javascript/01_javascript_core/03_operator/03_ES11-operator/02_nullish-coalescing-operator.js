/* 02. nullish-coalescing-operator(null 병합 연산자) */
/*
  ECMA11(ECMAScript2020)에서 도입된 연산자로 좌항의 연산자가 null 또는 undefined인 경우
  우항의 피연산자를 반환하고, 그렇지 않으면 좌항의 피연산자를 반환한다.
  변수에 기본 값을 설정할 때 유용하다.
*/

var test = null ?? '기본 값';
console.log('test: ', test);

var value1 = '' || '기본 값';
var value2 = '' ?? '기본 값';
console.log('value1: ', value1);
console.log('value2: ', value2);