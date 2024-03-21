/* 03. const(상수) */

/* 상수는 선언과 동시에 초기화 해 주어야 한다. */
// const x;
const x = 1;

x = 2;

/* 일반적으로 상수는 대문자 및 스네이크 표기법(_)로 표현한다. */
const DISCOUNT_RATE = 0.15;

let price = 15000;                                      // 정가

let discountPrice = price * (1 - DISCOUNT_RATE);        // 할인율이 적용 된 할인가
console.log(discountPrice);

/*
    ES6 이후라면 var 키워드를 사용하지 않는다.
    재할당이 필요한 경우에 한정해 let 키워드를 사용하며
    변경이 발생하지 않고 읽기 전용으로 사용하는 원시 값 또는 객체는 const 키워드를 사용한다.
    const 키워드는 재할당을 금지하므로 var, let 키워드보다 안전하다.
*/

/* 가능한한 전역 변수보다는 지역변수 사용을 권장(전역 변수는 생명주기가 길고 계속 존재하므로 리소스 낭비 가능성 존재 때문) */