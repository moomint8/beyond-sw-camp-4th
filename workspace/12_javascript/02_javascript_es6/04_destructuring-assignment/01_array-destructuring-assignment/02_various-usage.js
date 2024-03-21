/* 02. various-usage(다양한 사용법) */

/* 객체의 프로퍼티에도 한번에 구조 분해 할당 후 추가할 수 있다. */
let user = {};
[user.firstName, user.lastName] = "Gwansoon Yu".split(" ");

console.log(user);

/* 일치하지 않는 나머지(rest) 요소를 한번에 가져오기 */
let [sign1, sign2, ...rest] = ['양자리', '황소자리', '쌍둥이자리', '게자리', '사자자리'];

console.log(sign1);
console.log(sign2);
console.log(rest);

/* 변수 교환 용도로도 사용할 수 있다. */
let student = '유관순';
let teacher = '홍길동';

[student, teacher] = [teacher, student];

console.log(`학생: ${student}, 교사: ${teacher}`);

/* 기본 값을 설정하고 사용할 수도 있다. */
let [firstName4 = "아무개", lastName4 = "김"] = ["길동"];

console.log(firstName4);
console.log(lastName4);
