package com.ohgiraffers.section02.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Function에 대해 이해하고 사용할 수 있다. */
        Function<String, Integer> function = str -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue));

        /*목차 2. BiFunction -  매개변수 두개*/
        BiFunction<String, String, Integer> biFunction =
                (str1, str2) -> Integer.valueOf(str1) + Integer.valueOf(str2);
        System.out.println(biFunction.apply(strValue, "11111"));

    }
}
