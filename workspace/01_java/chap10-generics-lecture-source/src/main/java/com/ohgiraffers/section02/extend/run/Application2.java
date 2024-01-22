package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 와일드카드에 대해 이해할 수 있다. */

        WildCardFarm wildCardFarm = new WildCardFarm();
        wildCardFarm.anyType(new RabbitFarm<Rabbit>());
        wildCardFarm.anyType(new RabbitFarm<Bunny>());
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>());

//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>());
        wildCardFarm.extendsType(new RabbitFarm<Bunny>());
//        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>());

        wildCardFarm.superType(new RabbitFarm<Rabbit>());
        wildCardFarm.superType(new RabbitFarm<Bunny>());
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>());
    }
}
