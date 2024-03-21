/* 04. example */

/* 1. 특정 단어로 시작하는지 검사하는 경우 */
const url = 'https://www.google.com';
const url2 = 'http://www.google.com';

/* http:// 또는 https://로 시작하는지 검사 */
console.log(/^https?:\/\//.test(url));
console.log(/^https?:\/\//.test(url2));

/* 2. 특정 단어로 끝나는지 검사하는 경우 */
const fileName = 'js_test.js';
const fileName2 = 'js_test.com';

/* 문자열이 js로 끝나는지 검사 */
console.log(/js$/.test(fileName));      // true
console.log(/js$/.test(fileName2));     // false

/* 3. 숫자로만 이루어진 문자열인 검사 */
const target = '12345';
const target2 = '@12345@';
console.log(/^\d+$/.test(target));       // true
console.log(/^\d+$/.test(target2));       // false

/* 4. 아이디로 사용 가능하지 검사 */
const id = 'hello123';
const id2 = '가hello123';
const id3 = 'hello12345657890';
/* 알파벳, 숫자로 된 6~12자의 문자로 시작하고 끝남 */
console.log(/^[A-Za-z0-9]{6,12}$/.test(id));        // true
console.log(/^[A-Za-z0-9]{6,12}$/.test(id2));       // false
console.log(/^[A-Za-z0-9]{6,12}$/.test(id3));       // false

/* 5. 핸드폰 번호 형식에 맞는지 검사 */
const phone = '010-1234-5678';
const phone2 = '02-1234-5678';
console.log(/^[0-9]{3}-\d{3,4}-\d{4}$/.test(phone));    // true
console.log(/^[0-9]{3}-\d{3,4}-\d{4}$/.test(phone2));   // false

/* 6. 특수 문자 포함 여부 검사 */
const exceptT = 'hello#world';
console.log(/[^A-Za-z0-9]+/.test(exceptT));             // true, 알파벳 및 숫자가 아닌 문자가 들어있다는 뜻

/* 이보다 정교한 패턴들은 추후 찾아가며 이해하고 적용해 보자. */

/* 그룹 관련 추가예제 */
let target3 = 'https://www.google.com';

/* 그룹을 두개 만들고 배열에 하나씩 요소로 담고 싶을 때 */
// let regex = /(https:)([\/a-z\.]+)/;        

/* 첫번째 그룹은 배열의 요소로 뽑고 싶지는 않을 때(단순 ()의 의미는 ()안에 ?:를 붙인다.) */
let regex = /(?:https:)?([\/a-z\.]+)/;      // https:가 있어도 되고 없어도 되지만 배열로는 나오지 않는다.

console.log(target3.match(regex));

/* 7. 한글 범위 여부 검사 */
/* 한글범위: [가-힣] */
/* 한글로만 된 2~4글자(이름) */
let name = '홍길동전';
console.log(/^[가-힣]{2,4}$/.test(name));

/* 8. 경계 검색  */
/* \b: 해당 패턴이 경계(\w가 아닌 것과 \w인 것)일 때(시작 또는 마지막) */
/* \B: 해당 패턴이 경계가 아닐 때 */
let boundary = 'abc aba abd';
console.log(boundary.match(/\ba/g)); // 단어의 시작이 a일 때 a값
console.log(boundary.match(/a\b/g)); // 단어의 마지막이 a일 때 a값

/* 9. 스페이스 검색 */
/* \s: 공백만 */
/* \S: 공백이 아닌 것만 */
let space = 'abc def ghi';
console.log(space.match(/\s/g));
console.log(space.match(/\S/g));