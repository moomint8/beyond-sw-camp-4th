/* 03. flag-and-pattern */

/*
  flag의 종류
  i(case Insensitive): 대소문자를 구별하지 않고 패턴 적용
  g(Global): 대상 문자열 텍스트 내에서 패턴과 일치하는 모든 문자열을 전역 검색
  m(Multi line): 문자열의 행이 바뀌더라도 패턴 검색을 계속
*/
let target = 'Java JavaScript';

console.log(target.match(/VA/));        // 일치하는 패턴이 없으므로 null
console.log(target.match(/VA/i));       // 일치하는 문자열 하나만 배열로 처리(처음 일치하는 문자열만)
console.log(target.match(/VA/ig));      // 일치하는 문자열 모두 검색(개행 전까지)
console.log('-------------------');

/* pattern의 종류 */
/* 패턴은 특별한 의미를 가지는 메타문자 또는 기호로 표현할 수 있다. */

/* .: 임의의 문자열 */
target = 'abcdefg';
console.log(target.match(/../g));

let arr = target.match(/../g);
console.log(arr[1]);

console.log('-------------------');

/* {m,n}: 최소 m번, 최대 n번 반복 되는 문자열(반복 검색) */
target = 'a aa aaa b bb bbb bbbb ab aab abb';
console.log(target.match(/a{2,3}/g));   // a 최소 2번 ~ 최대 3번 반복
console.log(target.match(/b{2}/g));     // b 두번 반복
console.log(target.match(/b{3,}/g));    // b 최소 세번 이상 반복

/* +: 앞선 패턴이 최소 한번 이상 반복되는 문자열(반복 검색)({1,}와 같다.) */
console.log(target.match(/b+/g));       
console.log('-------------------');

/* ?: 앞선 패턴이 없거나 하나 있는 문자열({0,1}와 같다.) */
target = 'soul seoul seeoul';
console.log(target.match(/se?oul/g));   // e가 있거나 없어도 되며 soul, seoul를 찾아줌
console.log('-------------------');

/* |: or */
target = 'aa bb cc dd 123 456 _@';
console.log(target.match(/a|b/g));      // 'a'또는 'b' 모두

/* 분해되지 않는 단어 레벨로 검색하기 위해 + 함께 사용 */
console.log(target.match(/a+|b+/g));

/* []는 or의 의미를 가진다. */
console.log(target.match(/[ab]/g));     // a|b와 일치

/* 범위를 지정하려면 -(하이픈)을 사용(소문자 범위) */
console.log(target.match(/[a-z]/g));    // /a|b|c|d|e|f|g|.../과 일치

/* 대소문자(알파벳 모두) 범위 */
console.log(target.match(/[a-zA-Z]/g)); 

/* 숫자 범위 */
console.log(target.match(/[0-9]+/g));
console.log('-------------------');

/* \d: 숫자 */
console.log(target.match(/\d+/g));       // [0-9]+와 같다.

/* \D: 숫자가 아닌 문자 */
console.log(target.match(/\D+/g));

/* \w: 알파벳, 숫자, 언더스코어 */
/* \W: \w의 반대 */
console.log(target.match(/\w+/g));        // 알파벳, 숫자, 언더스코어가 있는 문자
console.log(target.match(/\W+/g));        // 그 외의 특수기호

/* [...] 내의 ^: not */
console.log(target.match(/[^0-9]+/g));    // 숫자가 없는 단어, \D랑 같다.
console.log(target.match(/[^a-zA-Z]+/g)); // 영어 대소문자가 아닌 단어

/* ^: 시작 위치, $: 마지막 위치 */
target = 'https://www.google.com/https';
console.log(target.match(/^https/g));     // https로 시작하는지 검사
console.log(target.match(/https$/g));     // https로 끝나는지 검사

/* (): 그룹 */
target = 'test tesk tesa';
console.log(target.match(/test|testk|tesa/g));
console.log(target.match(/tes(t|k|a)/g));

target = 'RegExr was created by gskinner.com, and is proudly hosted by Media Temple.';
console.log(target.match(/[a-zA-Z.]+$/g));
