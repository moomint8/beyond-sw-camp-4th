package org.teamone.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
//@RequestMapping("/second-service")
@RequestMapping("/")
public class SecondServiceController {

    @GetMapping("health_check")
    public String healthCheck() {
        return "I'm Ok..maybe?";
    }


    @GetMapping("message")
    public String message(@RequestHeader("second-request") String header) {
        log.info("넘어온 헤더 값: {}", header);
        return "Second Service Message";
    }
}
