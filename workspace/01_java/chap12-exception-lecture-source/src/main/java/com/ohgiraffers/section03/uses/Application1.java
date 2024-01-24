package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 예외처리를 많이 사용하는 io 패키지에서 예외처리를 사용하는 구문을 이해할 수 있다. */
        /* 설명.
         *  예외 처리를 가장 많이 사용하게 되는 상황에서 try-catch 구문을 실제 상황과 유사하게 연습해보자.
         *  (문법보다는 호출 흐름에 신경 써 보기)
         */

        System.out.println(new File("test.dat").getAbsoluteFile());

        BufferedReader br = null;       // try 구문 안에서 선언하면 지역스코프에 갇혀있어 finally 에서 못 닫기 때문에 미리 선언

        try {
            br = new BufferedReader(new FileReader("test.dat"));

            String s = "";

//            System.out.println(br.readLine());

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 못 찾겠습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            /* 필기.
             *  예외처리 구문과 상관없이 반드시 수행해야 하는 경우 finally에 작성을 하며
             *  보통 사용한 자원을 반납할 목적으로 사용하게 된다.
             */
            try {

                /* 설명.
                 *  스트림이 생성되지 않았을 때 접근해서 close() 메소드를 호출하게 되면 NullPointerException이
                 *  발생할 수 있다. 따라서 NullPointerException 방지를 위한 if문을 활용하게 된다.
                 */
                if (br != null) {

                    /* 설명.
                     *  입출력에서 사용한 스트림을 닫아주는 메소드이다.
                     *  API에서 확인해보면 IOException을 throws하는 메소드이기 때문에
                     *  finally 블럭 안이라도 또 예외 처리를 중첩으로 해줘야 한다.
                     */
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
