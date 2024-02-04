package com.ohgiraffers.chap05.section01.tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application2 {
    static class Node {

        int left;
        int right;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;

        }
    }
    static List<Node>[] list;
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    static StringBuilder sb = new StringBuilder();


    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        int n = Integer.parseInt(br.readLine());

        list = new ArrayList[n + 1];
        for(int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 1; i < n + 1; i++) {
            String[] alphabet = br.readLine().split(" ");

            int data = alphabet[0].charAt(0) - 'A' + 1;
            int left = alphabet[1].charAt(0) - 'A' + 1;
            int right = alphabet[2].charAt(0) - 'A' + 1;
            list[data].add(new Node(left, right));
        }

        preorder(1);
        sb.append("\n");
        inorder(1);
        sb.append("\n");
        postorder(1);
        return sb.toString();

    }

    static void preorder(int start) {
        for(Node node : list[start]) {
            int l = node.left;
            int r = node.right;

            sb.append((char)(start+'A'-1));
            if((l + 'A' - 1) != '.') preorder(l);
            if(r != '.' - 'A' + 1) preorder(r);
//            if(r != -18) preorder(r);
        }
    }

    static void inorder(int start) {
        for(Node node : list[start]) {
            int l = node.left;
            int r = node.right;

            if(l != -18) inorder(l);
            sb.append((char)(start+'A'-1));
            if(r != -18) inorder(r);
        }
    }

    static void postorder(int start) {
        for(Node node : list[start]) {
            int l = node.left;
            int r = node.right;

            if(l != -18) postorder(l);
            if(r != -18) postorder(r);
            sb.append((char)(start+'A'-1));
        }
    }
}
