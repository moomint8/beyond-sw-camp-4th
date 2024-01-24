package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. File 클래스의 사용 용법을 이해할 수 있다. */
        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {

            /* 설명. 생성될 때 인지한 파일의 경로 및 파일명을 바탕으로 파일을 생성 후 성공 여부를 반환한다. */
            boolean isSuccess = file.createNewFile();
            System.out.println("파일 생성 여부 : " + isSuccess);
        } catch (IOException e) {
            e.getStackTrace();
        }

        /* 설명. 몇 가지 File에서 제공하는 메소드 확인 */
        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

        boolean isDeleted = file.delete();
        System.out.println("파일 삭제 여부 : " + isDeleted);
    }
}
