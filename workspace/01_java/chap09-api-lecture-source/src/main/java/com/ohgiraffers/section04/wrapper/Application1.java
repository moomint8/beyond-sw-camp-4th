package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */
        int intValue = 20;

        /* 설명. 기본자료형을 Wrapper클래스 자료형으로 변환할 수 있다.(박싱, boxing) */
        Integer boxingInt = (Integer) 20;
        Integer boxingInt2 = Integer.valueOf(intValue);

        /* 설명. Wrapper 클래스 자료형을 기본자료형으로 변환할 수 있다.(언박싱, unboxing) */
        int unboxingValue = boxingInt.intValue();

        /* 설명. 기본자료형과 Wrapper 클래스는 자동으로 박싱 및 언박싱이 일어난다.(auto-boxing, auto-unboxing) */
        Integer autoBoxingInt = intValue;
        int autoUnboxingValue = autoBoxingInt;

        anythingMethod(10);     // Object obj = (Object)(Integer)10;
                                    //            up-casting

        /* 설명. Wrapper 클래스 값 비교 */
        /* 설명. Wrapper 클래스들도 리터럴(literal) 값으로 오토박싱하면 결국 동일한 객체 하나만 관리된다. */
        Integer integerTest = (Integer) 30;
        Integer integerTest2 = (Integer) 30;
        System.out.println(" == 비교 : " + (integerTest == integerTest2));
//        System.out.println(" equals() 비교 : " + integerTest.equals(integerTest2));
        System.out.println("integerTest 주소 : = " + System.identityHashCode(integerTest));;
        System.out.println("integerTest2 주소 : = " + System.identityHashCode(integerTest2));;
    }

    /* 설명. 매개변수가 Object인 메소드(어떤 자료형의 전달인자이든 받아낼 수 있는 메소드) */
    public static void anythingMethod(Object obj) { // 10 -> Integer (오토박싱) -> Object (다형성)
        System.out.println("obj = " + obj); // Object의 toString()이 아닌 Integer의 toString()이 실행 됨(동적 바인딩)
    }
}
