/* 03. function-parameters(함수의 매개변수에서 구조 분해 할당) */

let exampleProduct = {
    items: ["Coffee", "Donut"],
    producer: "신사임당"
};

function displayProduct({producer = "아무개", items = [], width = 10, height = 20}) {
    console.log(producer);
    console.log(items);
    console.log(width);
    console.log(height);
}

displayProduct(exampleProduct);

/* 함수 호출 시 객체를 던지면 내부적으로 매개변수에 적힌 구조분해 할당이 일어난다. */
// let {producer = "아무개", items = [], width = 10, height = 20} = exampleProduct;