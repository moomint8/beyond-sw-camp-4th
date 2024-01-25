package com.ohgiraffers.section03.grammer;

public enum UserRole2 {
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String description;

    /* 필기.
     *  위와 같이 필드를 정의하는 경우 반드시 매개변수 있는 생성자가 필요하다.
     *  (실제로 매개변수 있는 생성자를 호출하기 때문)
     *  enum 상수 필드의 괄호(()) 안에 넣은 값이 해당 생성자쪽으로 전달되며 Enum 인스턴스가 생성되며
     *  생성된 인스턴스는 싱글톤 객체이다.
     */
    UserRole2(String description) {
        System.out.println("description = " + description);
        this.description = description;
    }

    /* 설명. 요소들이 가지는 기본 이름과 정수값 외의 값을 부여(필드 추가)하고 외부에서 사용하려 할 시 필드의 getter을 추가할 수 있다. */
    public String getDescription() {
        return this.description;
    }
}
