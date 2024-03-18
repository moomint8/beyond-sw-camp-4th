/* 03. convert-to-boolean */

console.log('==== 논리 타입으로 변환 ====');

/*
  자바스크립트 엔진은 불리언 타입이 아닌 값을 Truthy 값(참으로 평가 되는 값)
  또는 Falsy 값(거짓으로 평가되는 값)으로 구분한다.
  Truthy -> true, Falsy -> false로 암묵적 타입 변환을 한다.
*/

if(true) console.log('if(true)');                   // true
if(false) console.log('if(false)');                 // false
if(undefined) console.log('if(undefined)');         // falsy
if(null) console.log('if(null)');                   // falsy
if(0) console.log('if(0)');                         // falsy
if(NaN) console.log('if(NaN)');                     // falsy
if('') console.log("if('')");                       // falsy
if('JavaScript') console.log("if('JavaScript')");   // truthy

