package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 매개변수에 활용할 수 있음을 이해할 수 있다. */
        Application3 app3 = new Application3();

//        Animal animal1 = new Rabbit();
//        Animal animal2 = new Tiger();
//
//        app3.feed(animal1);
//        app3.feed(animal2);

        app3.feed(new Rabbit());
        app3.feed(new Tiger());
    }

    private void feed(Animal animal) {
        animal.eat();
    }
}
