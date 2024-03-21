/* 02. various-usage(다양한 사용법) */

let shirts = {
    productName: '베이직 셔츠'
};

/* 기본 값 설정을 객체 구조 분해 할당으로 한번에 처리 */
let {productName: productName2 = '어떤 상품', color: color2 = '어떤 색상', price: price2 = 0} = shirts;

console.log('productName2: ', productName2);
console.log('color2: ', color2);
console.log('price2: ', price2);

/* 프로퍼티가 많은 객체에서 원하는 정보만 추출하는 경우 객체 구조 분해 할당을 자주 쓴다. */
let pants = {
    productName: '배기팬츠',
    color: '검정색',
    price: 25000
};

/* rest parameter(...)로 나머지 요소를 한 번에 가져올 수도 있다.(새로운 객체가 나머지 프로퍼티를 지님) */
let {productName, ...r} = pants;

console.log(`productName: ${productName}`);
console.log(`rest: ${r}`);
console.log(r);
console.log(`color: ${r.color}`);
console.log(`price: ${r.price}`);