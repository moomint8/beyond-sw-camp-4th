/* 02. differences-from-regular-array(일반적인 배열과의 차이점) */

const arr = [
    '홍길동',
    20,
    true,
    null,
    undefined,
    NaN,
    Infinity,
    [],
    {},
    function() {}
];

console.log(arr);

/*
  writable - true면 값을 수정할 수 있다. 아니면 읽기만 가능
  enumerable - true면 반복문을 사용해 나열할 수 있다. 그렇지 않다면 반복문 활용 시 포함 안됨
  configurable - true면 프로퍼티 삭제가 가능하다. 그렇지 않다면 삭제가 불가능 하다.
*/
console.log(Object.getOwnPropertyDescriptors([1, 2, 3]));
