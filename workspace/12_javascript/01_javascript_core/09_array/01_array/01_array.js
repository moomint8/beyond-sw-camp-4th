/* 01. array */
/* 배열은 여러 개의 값을 순차적으로(인덱스를 활용하여) 나열한 자료구조이다. */

/* 1. 배열 리터럴을 통해 배열 생성 */
const arr = ['바나나', '복숭아', '키위'];

console.log(arr);
console.log(arr.length);

/* 2. 배열 빌트인 생성자 함수 */
const arr2 = Array();
console.log(arr2);
console.log(arr2.length);

const arr3 = Array(10);
console.log(arr3);
console.log(arr3.length);

const arr4 = Array(1, 2, 3);
console.log(arr4);

/* 배열의 인덱스와 length 프로퍼티를 활용해 반복문을 돌릴 수 있다. */
for(let i = 0; i < arr4.length; i++) {
    console.log(arr4[i]);
}

/*
  자바스크립트에서 일반 객체와 배열은 큰 차이는 없고 다만 프로퍼티 키가 숫자형이라는 것과
  length라는 추가 프로퍼티를 가진다는 정도이다.
*/
console.log(typeof arr4);

