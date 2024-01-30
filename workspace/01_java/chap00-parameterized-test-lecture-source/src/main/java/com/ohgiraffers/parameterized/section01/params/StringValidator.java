package com.ohgiraffers.parameterized.section01.params;

public class StringValidator {
    public static boolean isNull(String input) {

        return input == null;
    }

    public static boolean isEmpty(String input) {

        return "".equals(input);
    }

    public static boolean isBlank(String input) {

        return input == null || "".equals(input);
    }
}