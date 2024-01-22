package com.ohgiraffers.section02.string;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. String 클래스의 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다. */

        /* 필기.
         *  charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
         *             (인덱스 체계 : 0부터 시작)
         */
        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        System.out.println("\n========================\n");

        /* 필기.
         *  compareTo() : 인자로 전달된 문자열과 사전 순으로 비교
         */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "mariaDB";

        System.out.println(str2.compareTo(str3));   // 0
        System.out.println(str3.compareTo(str4));   // 32
        System.out.println(str4.compareTo(str5));   // -35
        System.out.println(str5.compareTo(str2));   // 3

        System.out.println("\n========================\n");

        /* 필기.
         *  concat() : 문자열에 인자로 전달된 문자열을 합쳐서 새로운 문자열 반환
         */
        System.out.println("concat() : " + str2.concat(str5));
        System.out.println("str2 : " + str2);

        System.out.println("\n========================\n");

        /* 필기.
         *  indexOf() : 문자열에서 특정 문자를 탑색하여 처음 일치하는 위치를 정수형으로 반환한다.
         *              (일치하지 않으면 -1 반환)
         */
        String indexOf = "java mariaDB)";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a'));
        System.out.println("indexOf('z') : " + indexOf.indexOf('z'));

        System.out.println("\n========================\n");

        /* 필기.
         *  lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다.
         *                  (일치하지 않으면 -1 반환)
         */
        System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('a'));
        System.out.println("lastIndexOf('z') : " + indexOf.lastIndexOf('z'));

        System.out.println("\n========================\n");

        /* 필기.
         *  trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
         */
        String trimStr = "        java           ";

        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("trim() : #" + trimStr.trim() + "#");

        System.out.println("\n========================\n");

        /* 필기.
         *  toLowerCase() : 모든 문자를 소문자로 변환
         *  toUpperCase() : 모든 문자를 대문자로 변환
         */
        String caseStr = "javamariaDB";

        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());

        System.out.println("caseStr : " + caseStr);

        System.out.println("\n========================\n");

        /* 필기.
         *  substring() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다.
         */
        String javamariaDB = "javamariaDB";

        System.out.println("substring(3,6) : " + javamariaDB.substring(3, 6));
        System.out.println("substring(3) : " + javamariaDB.substring(3));

        System.out.println("javamariaDB : " + javamariaDB);

        System.out.println("\n========================\n");

        /* 필기.
         *  replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다.
         */
        System.out.println("replace() : " + javamariaDB.replace("java", "python"));
        System.out.println("javamariaDB : " + javamariaDB);

        System.out.println("\n========================\n");

        /* 필기.
         *  length() : 문자열의 길이를 정수형으로 반환한다.
         */
        System.out.println("length() : " + javamariaDB.length());
        System.out.println("빈 문자열 길이 : " + "".length());

        System.out.println("\n========================\n");

        /* 필기.
         *  isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환(null과 다르다.)
         */
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "abc".isEmpty());
    }
}
