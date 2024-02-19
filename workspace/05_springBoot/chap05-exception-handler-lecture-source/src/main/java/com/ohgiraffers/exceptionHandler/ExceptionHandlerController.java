package com.ohgiraffers.exceptionHandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class ExceptionHandlerController {

    @GetMapping("simple-null")
    public String simpleNullPointerExceptionTest() {

        if (true) {
            throw new NullPointerException();
        }

        return "/";
    }

    @GetMapping("simple-user")
    public String simpleUserExceptionTest() throws MemberRegistException {

        if (true) {
            throw new MemberRegistException("당신 같은 사람은 회원으로 받을 수 없습니다.");
        }

        return "/";
    }

    @GetMapping("annotation-null")
    public String annotationUserExceptionTest() {
        String str = null;
        System.out.println(str.charAt(0));

        return "/";
    }

    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExceptionHandler() {
        System.out.println("이 Controller에서 Null Pointer 발생 시 여기 오는지 확인");

        return "error/nullPointer";
    }

    @GetMapping("annotation-user")
    public String annotationNullPointerExceptionTest() throws MemberRegistException {
        if (true) {
            throw new MemberRegistException("당신은 안된다니깐???");
        }

        return "/";
    }

    @ExceptionHandler(MemberRegistException.class)
    public String userExceptionHandler(Model model, MemberRegistException exception) {
        model.addAttribute("exception", exception);

        return "error/memberRegist";
    }
}
