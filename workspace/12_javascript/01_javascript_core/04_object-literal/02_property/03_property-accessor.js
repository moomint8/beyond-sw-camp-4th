/* 03. property-accessor(프로퍼티 접근) */
var dog = {
    name: '뽀삐',
    eat: function(food) {
        console.log(`${this.name}(은)는 ${food}를 맛있게 먹어요.`);     // 메소드에서의 'this'는 메소드를 호출한 객체
    }
};

/* 1. 마침표 표기법(dot notation) */
console.log(dog.name);
dog.eat('감자');

/* 2. 대괄호 표기법(square braket notation) */
console.log(dog['name']);
dog['eat']('고구마');

/* 대괄호 표기법만 가능한 경우 */
var obj = {
    'dash-key': 'dash-value',
    0: 1
}

/* 프로퍼티 키가 식별자 네이밍 규칙을 준수하지 않은 이름일 경우 반드시 대괄호 표기법을 사용한다.(홑따옴표 필수!) */
// console.log(obj.dash-key);
// console.log(obj.'dash-key');
// console.log(obj[dash-key]);
console.log(obj['dash-key']);

/* 프로퍼티 키가 숫자로 이루어진 경우 홑따옴표를 생략한 대괄호 표기법도 가능하지만 가능하면 홑따옴표를 붙이자! */
// console.log(obj.0);
// console.log(obj.'0');
console.log(obj[0]);
console.log(obj['0']);