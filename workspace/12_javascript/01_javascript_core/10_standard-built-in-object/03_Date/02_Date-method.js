/* 02. Date-method(날짜 함수) */

/* Date.now: 1970년 1월 1일 00:00:00(UTC)를 기점으로 현재 시간까지 경과한 밀리초를 숫자로 반환한다. */
const now = Date.now();
console.log(new Date(now));

/* 연, 월, 일, 시, 분, 초, 밀리초 반환 및 설정 */
const date = new Date();

console.log(Object.getOwnPropertyDescriptors(date));
console.log(date.getFullYear());
console.log(date.getMonth() + 1);           // month는 + 1을 해야 1~12월 체계의 값이 나온다.
console.log(date.getDate());
console.log(date.getDay());                 // 일요일부터 0~6까지로 반환
console.log(date.getHours());
console.log(date.getMinutes());
console.log(date.getSeconds());
console.log(date.getMilliseconds());

date.setFullYear(2020);
date.setMonth(0);
date.setDate(1);
date.setHours(9);
date.setMinutes(10);
date.setSeconds(10);
date.setMilliseconds(10);
console.log(date);