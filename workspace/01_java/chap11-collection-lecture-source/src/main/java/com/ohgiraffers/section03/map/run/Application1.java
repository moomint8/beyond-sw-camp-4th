package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        Map<Object, Object> hashMap = new HashMap<>();
        hashMap.put("one", new Date());
        hashMap.put(12, "red apple");
        hashMap.put(33, 123);

        System.out.println("Key가 \"one\"인 value 값 : " + hashMap.get("one"));
        System.out.println("Map의 toString() : " + hashMap);

        /* 설명. 키 값은 중복되면 이후 put 되는 키와 밸류가 덮어씌운다.(주의할 것) */
        hashMap.put(12, "purple banana");
        System.out.println(hashMap.get(12));

        /* 설명. 밸류는 중복되어도 상관이 없다. */
        hashMap.put(77, "purple banana");
        System.out.println(hashMap);

        System.out.println("Map이 지닌 entry의 수 : " + hashMap.size());

        System.out.println("77번 키와 관련된 entry 삭제 : " + hashMap.remove(77));
        System.out.println("삭제 후 entry의 수 : " + hashMap.size());

        /* 필기. Map을 반복하여 각 entry들(키와 밸류)을 활용해 보자. */
        Map<String, String> hashMap2 = new HashMap<>();

        hashMap2.put("one", "java17");
        hashMap2.put("two", "mariaDB 10");
        hashMap2.put("three", "servlet/jsp");
        hashMap2.put("four", "springboot 3.0");
        hashMap2.put("five", "vue.js");

        /* 목차. 1. keySet()을 활용한 iterator 활용하기 */
        Set<String> keys = hashMap2.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println("key값 : " + key + ", value값 : " + hashMap2.get(key));
        }

        System.out.println("--------------------------------------");

        /* 목차. 2. entrySet()을 활용한 iterator 활용하기 */
        Set<Map.Entry<String, String>> set = hashMap2.entrySet();
        Iterator<Map.Entry<String, String>> iterEntry = set.iterator();
        while (iterEntry.hasNext()) {
            Map.Entry<String, String> entry = iterEntry.next();

            System.out.println("key값 : " + entry.getKey() + ", value값 : " + entry.getValue());
        }
    }
}
