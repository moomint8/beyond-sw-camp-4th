package com.ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. super.과 super()에 대해 이해할 수 있다. */
        /* 필기.
         *  super. : 자식 클래스 타입의 객체가 생성될 때 먼저 생성된 부모 클래스 타입의 객체의 주소값(참조값)
         *  super() : 부모로부터 물려받지 못한 생성자를 부모 클래스에 있는 생성자를 활용하기 위해 사용
         */

        Product product1 = new Product();
        System.out.println(product1);

        Product product2 = new Product("P01", "플레이데이터", "자바", 1000, new java.util.Date());
        System.out.println(product2);

        Computer computer1 = new Computer();
        System.out.println(computer1);          // 자식 클래스에 toString()을 작성하지 않으면 부모로부터 물려받은
                                                // toString() 결과가 나온다.

        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 16, "안드로이드");
        System.out.println(computer2);

        Computer computer3 = new Computer("S-01234", "구글", "픽셀", 1_000_000, new java.util.Date(),
                "퀄컴 스냅드래곤", 512, 16, "안드로이드");
        System.out.println(computer3);
    }
}
