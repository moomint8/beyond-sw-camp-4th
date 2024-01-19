package com.ohgiraffers.section03.overriding;

public class SuperClass {

    /* 수업목표. 오버라이딩(Overriding)에 대해 이해할 수 있다. */
    /* 필기.
     *  오버라이딩 성립요건
     *   1. 메소드의 이름이 동일해야 한다.
     *   2. 메소드의 반환형(리턴 타입)이 동일해야 한다.(이후 조금 수정사항이 있음)
     *   3. 매개변수의 타입, 갯수, 순서가 동일해야 한다.(변수명 상관 X)
     *   4. 부모 클래스의 private 메소드는 자식클래스가 접근이 불가능하기 때문에 오버라이딩이 불가능하다.
     *   5. final 키워드가 사용된 메소드는 오버라이딩이 불가능하다.
     *   6. 접근제어자는 부모 메소드와 같거나 더 넓은 범위여야 한다.
     *   7. 예외처리는 같은 예외이거나 더 구체적(하위)인 범위의 예외를 처리해야 한다. <- 예외처리 챕터에서 다룰 예정
     */

    public void method(int num) {}

    public Object method2(int num) { return null; }

    private void privateMethod() {}

    public final void finalMethod() {}

    protected void protectedMethod() {}
}
