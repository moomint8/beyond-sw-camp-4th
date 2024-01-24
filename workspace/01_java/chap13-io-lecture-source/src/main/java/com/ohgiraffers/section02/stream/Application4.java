package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. FileWriter에 대해 이해하고 활용할 수 있다. */
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");
            fw.write('한');
            fw.write('글');
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
