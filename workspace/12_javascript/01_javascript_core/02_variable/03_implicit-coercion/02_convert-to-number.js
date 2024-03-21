/* 02. convert-to-number(숫자 타입으로 변환) */

console.log('==== 숫자 타입으로 변환 ====');

/* 
  더하기를 제외한 산술 연산자는 피연산자들이 숫자여야 성립하므로 피연산자들을 숫자 타입으로 
  암묵적으로 변환한다.
*/
console.log(10 - '5');
console.log(10 * '5');
console.log(10 / '5');
console.log(10 % 'JavaScript');
console.log(10 > '5');

console.log(+'');
console.log(+'1');
console.log(+'JavaScript');
console.log(+true);
console.log(+false);
console.log(+null);
console.log(+undefined);
// console.log(+Symbol());          // 에러남
console.log(+{});
console.log(+[]);
console.log(+function(){});

/* 빈 문자열, 빈 배열, null, false는 0으로 true는 1로 반환 */