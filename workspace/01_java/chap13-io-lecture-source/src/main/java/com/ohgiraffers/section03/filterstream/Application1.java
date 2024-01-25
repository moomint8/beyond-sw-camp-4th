package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. BufferedWriter와 BufferedReader에 대해 이해해고 사용할 수 있다. */
        /* 필기.
         *  내부적으로 버퍼를 활용해서 입출력 성능을 향상시킨다.
         *  추가적인 메소드가 제공된다.
         */

        /* 설명. BufferedWriter를 활용한 한 줄씩 출력하기 */
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                    new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt", true));

            bw.write("제목 : 세종대왕님\n");
            bw.write("드디어 세종대왕님이 만족하겠네\n");
            bw.write("드디어 세종대왕님이 만족하시겠네\n");

            /* 필기.
             *  버퍼를 이용해서 출력을 하는 경우 버퍼 공간이 가득 차지 않으면 내보내기(출력)가 안되는 경우가 있다.
             *  이럴 경우 버퍼에 담긴 내용을 강제로 내보내기 위해 flush()를 이용한다.
             *  (write를 했는데 파일에 값이 안 적혀 있으면 flush() 할 것)
             *
             * 필기.
             *  stream을 close()하면 내부적으로 flush()를 호출하긴 함.
             */
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* 설명. BufferedReader를 활용해 한 줄(개행 문자 전까지)씩 읽어오기 */
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
            String str = "";
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
