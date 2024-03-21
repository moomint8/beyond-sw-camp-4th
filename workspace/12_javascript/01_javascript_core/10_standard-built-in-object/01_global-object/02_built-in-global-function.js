/* 02. built-in-global-function(빌트인 전역 함수) */

/* isFinite: 유한한 값인가? */
console.log(global.isFinite(10));
console.log(global.isFinite(Infinity));

/* isNaN: 숫자가 아니냐? */
console.log(isNaN(NaN));   
console.log(isNaN(10));

/* url에서 한글 안 깨지고 나오게 할 때 쓰게 될 함수 */
/* encodeURIComponent */
/* 알파벳, 0~9숫자, - _ . ! ~ * ' () 문자는 제외하고 인코딩 한다. */
const uriComp = 'name=홍길동&job=student';
const encComp = encodeURIComponent(uriComp);
console.log(encComp);

/* decodeURIComponent */
/* 나중에 백단에서 url값으로 넘어오는 한글이 깨지면 사용하게 될 함수 */
const decComp = decodeURIComponent(encComp);
console.log(decComp);