package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

/* 설명. 파라미터 타입별 호출 테스트 기능 제공용 클래스 */
public class ParameterTest {

    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimitiveTypeArrayParameter(int[] iArr) {
        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값 : " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle rectangle) {

        /* 설명. 전달받은 객체의 사각형의 넓이와 둘레 출력 */
        System.out.println("========= 변경 전 사각형의 넓이와 둘레 =========");
        rectangle.calArea();
        rectangle.calRound();

        /* 설명. 전달받은 객체의 사각형의 너비와 높이를 변경 */
        rectangle.setWidth(20);
        rectangle.setHeight(40);

        /* 설명. 변경 후 사각형의 넓이와 둘레 출력 */
        System.out.println("========= 변경 후 사각형의 넓이와 둘레 =========");
        rectangle.calArea();
        rectangle.calRound();
    }

    public void testVariableLengthArrayParameter(String... str) {   // 좋은 패턴은 아님
        System.out.println(Arrays.toString(str));
    }
}
