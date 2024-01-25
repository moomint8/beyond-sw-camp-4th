package com.ohgiraffers.section02.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. FileOutputStream에 대해 이해하고 활용할 수 있다. */
        FileOutputStream fileOutputStream = null;
        try {
            // 해당 파일 없으면 생성됨.
            fileOutputStream = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");
//            fileOutputStream.write('v');
            byte[] bArr = new byte[]{'a', 'p', 'p', 'l', 'e'};
            fileOutputStream.write(bArr);
            fileOutputStream.write(bArr, 1, 4);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

