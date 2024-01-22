package com.ohgiraffers.section04.wrapper;

public class Application3 {
    public static void main(String[] args) {
        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8L).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('a').toString();

        String str = String.valueOf(10);
        String str2 = 123 + "";

    }
}
