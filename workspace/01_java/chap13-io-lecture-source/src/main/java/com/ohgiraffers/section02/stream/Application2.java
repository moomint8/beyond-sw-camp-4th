package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. FileReader를 이해하고 활용할 수 있다. */
        /* 필기.
         *  FileReader는 인코딩 방식에 맞게 한 글자씩 입력 받을 수 있는 스트림이다.
         *  (숫자/특수기호/영어 - 1byte, 한글/그 외 언어 - 3byte (UTF-8 기준))
         */
        FileReader fr = null;

        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

            int readChar = 0;
            while ((readChar = fr.read()) != -1) {
                System.out.println((char) readChar);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
