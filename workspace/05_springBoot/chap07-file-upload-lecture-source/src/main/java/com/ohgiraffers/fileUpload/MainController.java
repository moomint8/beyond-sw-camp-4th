package com.ohgiraffers.fileUpload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String defaultLocation() {
        return "main";
    }

    @GetMapping("/main")
    public void main() {

    }
}
