package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  Stack이란?
         *   후입선출(LIFO : Last In First Out) 또는 선입후출(FILO : First In Last Out) 구조의 자료구조이다.
         *   push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리할 수 있다.
         *   Vector를 상속한 클래스이다.
         */
        Stack<Integer> integerStack = new Stack<>();

        /* 설명. Stack 인스턴스 생성 */
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        /* 필기.
         *  peek() : 해당 스택의 최상단(top)에 있는 요소 반환
         *  search() : 해당 요소와 일치하는 요소의 위치를 최상단에서부터 몇 번째인지 반환(1부터 시작)
         *  pop() : 해당 스택의 최상단에 있는 요소 반환 후 제거
         */
        System.out.println("peak() : " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("search() : " + integerStack.search(2));

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
    }
}
