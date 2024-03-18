/* 01. short-circuit-evaluation(논리 연산자) */

/* 표현식을 평가하는 도중 평가 결과가 확정된 경우 나머지 평가 과정을 생략하는 것 */

/* 1. OR의 경우 */
console.log('apple' || 'banana');   // apple, true || true인 셈이다.
console.log('' || 'banana');        // banana
console.log('apple' || false);      // apple

/* 2. AND의 경우 */
console.log('apple' && 'banana');   // banana
console.log(false && 'banana');     // false
console.log('apple' && false);      // false

var num = 2;

/*
if(num % 2 == 0) {
    console.log('짝수입니다.');
} else {
    console.log('홀수입니다.');
}
*/

/* 단축 평가를 활용하여 같은 결과를 얻을 수 있다. */
num % 2 == 0 && console.log('짝수입니다.');     // &&는 왼쪽이 맞으면 오른쪽이 실행
num % 2 == 0 || console.log('홀수입니다.');     // || 왼쪽이 틀리면 오른쪽이 실행