package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 입출력 스트림에 대해 이해하고 파일을 대상으로 하는 FileInputStream을 사용할 수 있다. */
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

//            System.out.println((char) fin.read());

            /* 필기.
             *  FileInputStream에서 제공하는 read() 메소드를 활용하여 데이터를 1바이트씩 읽을 수 있다.
             *  read() 메소드가 반환하는 값은 int인데 더 이상 데이터가 존재하지 않으면(EOF : End Of File) -1을
             *  반환하게 된다. 이 원리를 활용하여 파일의 끝까지 1바이트씩 읽고 처리할 수 있다.
             *  (반환한 값이 int이기 때문에 문자로 활용하기 위해서는 char로 형변환을 진행한다.)
             */
            int input = 0;
//            while ((input = fin.read()) != -1) {
//                System.out.println((char) input);
//            }

            /* 설명. 파일로부터 읽어온 값을 ArrayList에 누적 */
            List<Character> arr = new ArrayList<>();
            while ((input = fin.read()) != -1) {
                arr.add((char) input);
            }

            for (char ch : arr) {
                System.out.print(ch);
            }

        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 존재하지 않습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
