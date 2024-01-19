package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    /* 설명. 0. 부모 메소드와 이름, 반환형, 매개변수, 접근제어자 모두 동일하게 하면 오버라이딩이 성립한다. */
//    @Override
//    public void method(int num) {}

    /* 설명. 1. 메소드 이름 변경(에러 발생) */
//    @Override
//    public void method1(int num) {}

    /* 설명. 2. 메소드 리턴 타입 변경(에러발생) */
//    @Override
//    public String method(int num) { return null; }

    /* 설명. 3. 메소드의 매개변수 차이나게 변경(에러 발생) */
//    @Override
//    public void method(int num, int num2) {}

    /* 설명. 4. 경우에 따라서는 반환형을 달리 할 수도 있다.(부모 메소드 반환형의 자식 타입은 가능) */
    @Override
//    public String method2(int num) { return null; }
    public Integer method2(int num) {
        return null;
    }

    /* 설명. 5. private 메소드는 오버리이딩 불가 */
//    @Override
//    private void privateMethod() {}

    /* 설명. 6. final 메소드는 오버리이딩 불가 */
//    @Override
//    public final void finalMethod() {}

    /* 설명. 7. 부모 타입과 같은 접근제어자이거나 더 넓은 범위의 접근제어자로 오버라이딩은 가능 */
    @Override
    public void protectedMethod() {}
}
