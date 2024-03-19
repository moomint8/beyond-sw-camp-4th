/* 02. let */

/* 1. 변수 중복 선언 금지 */
let msg = '안녕';

// let msg = '잘가';

/* 2. 함수 레벨 스코프 -> 블럭 레벨 스코프 */
let i = 0;
for(let i = 0; i < 10; i++) {

}

console.log(i);

/* 3. 변수 호이스팅을 방지하는 효과 */
console.log(x);
let x = 1;