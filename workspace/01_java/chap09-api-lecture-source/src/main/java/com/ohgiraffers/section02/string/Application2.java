package com.ohgiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. 문자열 객체를 생성하는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다. */
        /* 필기.
         *  문자열 객체를 만드는 방법
         *   "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.(singleton 개념)
         *   new String("") : 매번 새로운 인스턴스를 생성한다.(주소값이 다름)
         */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        /* 필기.
         *  String 객체는 리터럴로 생성될 때는 heap 영역의 상수풀(constant pool)에 생성된다.
         *  상수풀은 동등한 String 객체를 하나만 저장하는(중복 제거) 공간으로 동일한 String 변수를
         *  효율적으로 사용할 수 있도록 제공된다.(String의 equals()와 hashCode()를 통해 적용)
         */

        /* 설명. 위의 네 가지 경우 모두 동등한 String 객체이므로 equals는 true, hashCode는 같은 값이 나온다. */
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("(str1.hashCode()==str3.hashCode()) = " + (str1.hashCode() == str3.hashCode()));

        /* 필기.
         *  String은 불변객체(immutable class)이다.
         */

        String str = "apple";
        str += ", banana";
        System.out.println("fruit : " + str);
    }
}
