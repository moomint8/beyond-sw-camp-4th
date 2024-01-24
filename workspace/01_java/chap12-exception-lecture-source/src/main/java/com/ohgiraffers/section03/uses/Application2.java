package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. try-with-resource 구문의 문법을 이해하고 활용할 수 있다.(feat.finally 안쓰기) */
        try (BufferedReader br = new BufferedReader(new FileReader("test.dat"))) {
            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
