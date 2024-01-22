package com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 제네릭(generic)에 대해 이해할 수 있다. */

//        GenericTest<Integer> gt1 = new GenericTest<Integer>();
        GenericTest<Integer> gt1 = new GenericTest<>();     // 뒤에 나오는 다이아몬드 연산자는 비워도 된다.(Java 7부터)

        gt1.setValue(1);        // auto-boxing에 의한 값 전달 가능
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 = new GenericTest<>();

        gt2.setValue("피카츄");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        /* 필기.
         *  제네릭 클래스는 다양한 자료형으로 변할 수 있어 클래스 하나만으로 활용가치가 높아진다.(구현의 편리성)
         *  매개변수나 반환형도 제네릭 타입으로 지정되어 명확히 해당 타입에 대해 처리할 수 있다.(타입의 안정성)
         */
    }
}
