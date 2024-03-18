/* 01. dynamically-typed-language */

var test;
console.log(typeof test);

test = 1;
console.log(typeof test);

test = 'JavaScript';
console.log(typeof test);

test = true;
console.log(typeof test);

test = null;
console.log(test);

test = Symbol();
console.log(typeof test);

test = {};
console.log(typeof test);

test = [];
console.log(typeof test);

test = function() {};
console.log(typeof test);


