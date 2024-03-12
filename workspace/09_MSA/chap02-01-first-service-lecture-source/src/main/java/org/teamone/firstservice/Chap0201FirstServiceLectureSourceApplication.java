package org.teamone.firstservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Chap0201FirstServiceLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0201FirstServiceLectureSourceApplication.class, args);
    }

}
