/* 01. RegExp(정규 표현식 리터럴) */
let regexp = /j/i;  // 패턴: j, 플래그 옵션: i => 대소문자 구별 없이

let target = 'JavaScript';

regexp = new RegExp('j', 'i');
regexp = new RegExp(/j/, 'i');
regexp = new RegExp(/j/i);

/* test 메소드: 정규 표현식 regexp의 패턴을 검색하여 매칭 결과를 boolean값으로 반환 */
console.log(regexp.test(target));