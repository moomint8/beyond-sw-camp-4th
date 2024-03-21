/* 01. Symbol-feature(심볼 특징) */
let student = {
    name: "홍길동"
};

let id = Symbol("id");  // "id" 심볼 생성
student[id] = 1;

console.log(student);

/* 객체가 가진 프로퍼티 확인(Symbol로 만든 숨김 프로퍼티는 배제된다.) */
console.log(Object.keys(student));
console.log(Object.getOwnPropertyNames(student));

for(let key in student) {
    console.log(key);
}

/*
  기존에 작성 된 코드에 영향을 주지 않고 새로운 프로퍼티를 추가하기 위해,
  즉 하위 호환성을 보장하기 위해 도입되었다고 할 수 있다.
*/