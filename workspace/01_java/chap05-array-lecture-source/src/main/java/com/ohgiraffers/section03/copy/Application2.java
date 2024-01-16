package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. 깊은 복사에 대해 이해할 수 있다. */
        /* 필기.
         *  깊은 복사를 하는 방법은 4가지가 있다.
         *  1. for문을 이용한 동일한 인덱스 값을 일일이
         *  2. Object의 clone()을 이용한 복사(이게 가장 많이 사용된다.)
         *  3. System의 arraycopy()를 이용한 복사
         *  4. Arrays의 copyOf()를 이용한 복사
         */

        int[] originArr = new int[]{1, 2, 3, 4};
        print(originArr, "원본");

        /* 목차. 1. for문 활용 */
        int[] copyArr1 = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1, "for문을 사용한 사본");

        /* 목차. 2. clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone()를 사용한 사본");

        /* 목차. 3. arraycopy()를 이용한 복사 */
        int[] copyArr3 = new int[originArr.length + 3];
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);  // 원본,시작지점,복사본,붙여넣기시작위치,복사할길이)
        print(copyArr3,"arraycopy()를 사용한 사본");

        /* 목차. 4. copyOf()를 이용한 복사 */
        int[] copyArr4 = Arrays.copyOf(originArr, 2);   // 원본의 처음부터 원하는 길이까지만 복사 가능
        print(copyArr4,"copyOf()를 사용한 사본");
    }

    private static void print(int[] arr, String desc) {      // orginArr -> arr로 얕은 복사가 발생함

        System.out.println("\n======== " + desc + " ========");

        /* 설명. 전달받은 배열의 주소 값 출력 */
        System.out.println("넘어온 배열의 hashcode : " + arr.hashCode());

        /* 설명. 전달받은 배열의 값 출력 */
        System.out.println(Arrays.toString(arr));
    }
}
