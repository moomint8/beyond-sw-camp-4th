package com.ohgiraffers.section02.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 분리에 대해 이해하고 적용할 수 있다. */
        /* 필기.
         *  문자열을 특정 구분자로하여 분리한 문자열을 반환하는 기능을 한다.
         *  split() : 정규표현식을 이용하여 비정형화된 문자열을 분리한다.
         *            (String을 파싱하여 String[]로 만들어줌)
         *  StringTokenizer : 문자열의 모든 문자들을 구분자를 활용하여 문자열을 분리한다.
         */

        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신/경기도/";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        System.out.println(Arrays.toString(empArr1));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));
        System.out.println();

        /* 설명. StringTokenizer를 통해 문자열에서 구분자를 통해 토큰 단위로 구분하여 활용하기 */
        String colors = "red, yellow, green, purple? blue";
        StringTokenizer colorStringTokenizer = new StringTokenizer(colors, ",? ");
        while (colorStringTokenizer.hasMoreElements()) {
            System.out.println(colorStringTokenizer.nextToken());
        }
    }
}
