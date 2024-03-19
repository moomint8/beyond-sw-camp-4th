/* 02. RegExp-method */

const target = 'Java JavaScript';

/* exec: 인수로 전달받은 문자열에 대해 정규 표현식의 패턴을 검색하여 매칭 결과(상세한 정보)를 배열로 반환 */
console.log(/va/.exec(target));         // [ 'va', index: 2, input: 'Java JavaScript', groups: undefined ]
console.log(/hello/.exec(target));      // 매칭 결과가 없을 경우 null

/* test: 인수로 전달받은 문자열에 대해 정규 표현식의 패턴을 검색하여 매칭 결과를 boolean으로 반환 */
console.log(/va/.test(target));         // true

/* match: 대상 문자열과 인수로 전달 받은 정규 표현식과의 매칭 결과를 배열로 반환한다. */
console.log(target.match(/va/));        // [ 'va', index: 2, input: 'Java JavaScript', groups: undefined ]