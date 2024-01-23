package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. Properties에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  Properties란?
         *   HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
         *   주로 설정 파일 관련된 파일과의 입출력에 사용된다.(store, load, 등)
         */
        Properties prop = new Properties();     // Key,Value 를 다 String 으로만 사용해서 제네릭(<>) 사용 안함.
                                                // 파일을 읽어오는데 특화되어있다.

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "swcamp");
        prop.setProperty("password", "swcamp");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver2");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver3");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 저장한 파일에서부터 읽어온 데이터를 담을 Properties 객체 */
        Properties prop2 = new Properties();

        System.out.println("파일로부터 읽어오기 전 : " + prop2);

        try {
//            prop2.load(new FileInputStream("driver.dat"));
//            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("읽어온 후 : " + prop2);
        System.out.println("driver : " + prop2.getProperty("driver"));
        System.out.println("driver : " + prop2.getProperty("url"));
        System.out.println("driver : " + prop2.getProperty("user"));
        System.out.println("driver : " + prop2.getProperty("password"));
    }
}
