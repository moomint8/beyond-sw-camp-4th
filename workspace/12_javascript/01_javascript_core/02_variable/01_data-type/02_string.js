/* 02. 문자열 타입 */

var str = '안녕하세요';
console.log(typeof str);

/* 일반 문자열 내에서는 줄바꿈이 허용되지 않는다. */
// var str2 = '안녕하세요.
// 반갑습니다.';

/* 백틱(`)을 사용하면 줄바꿈이 허용되고 모든 공백이 있는 그대로 적용된다. */
var str2 = `안녕하세요.
반갑습니다.`;
console.log('mutiline: ', str2);

/* 문자열 이어붙이기 */
var lastName = '홍';
var firstName = '길동';
console.log('제 이름은 ' + lastName + firstName + '입니다.');

/* 
  표현식 삽입(${})과 백틱을 함께 사용하면 문자열 연산보다 가독성도 좋고 간편하게 
  문자열을 조합할 수 있다.
*/
console.log(`제 이름은 ${lastName}${firstName}${1 + 2}입니다.`);
// console.log('제 이름은 ${lastName}${firstName}${1 + 2}입니다.'); // 홑따옴표(')는 적용 안됨



