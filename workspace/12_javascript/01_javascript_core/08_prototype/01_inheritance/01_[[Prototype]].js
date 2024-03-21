/* 01. [[Prototype]](프로토 타입 객체) */
/* 모든 객체는 프로토타입 객체에 접근할 수 있다. */

const user = {
    activate: true,
    login: function() {
        console.log('로그인 되었습니다.');
    }
};

console.log(user.__proto__.constructor === Object);
console.log(user.__proto__ === Object.prototype)


const user2 = {
    activate: false,
    login: function() {
        console.log('로그인 실패되었습니다.');
    }
}
console.log(user2.__proto__);

const student = {
    passion: true
};
console.log(student.__proto__);

student.__proto__ = user2;  // 부모 객체를 자신의 [[Prototype]]에 담으면 상속의 개념이 된다.

student.login();

/* 프로토타입 체인 */
const greedyStudent = {
    class: 1502,
    __proto__: student
}

console.log(greedyStudent.activate);        // user2에서 상속
console.log(greedyStudent.passion);         // student에서 상속

student.__proto__ = greedyStudent;
console.log(student.class);
