package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private long visitCount = 0;

    // http://localhost:8080/hello.html
    // thymeleaf 로 인한 설정
    // templates url 접근 // static 다이렉트 접근
    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

    // redirect 302
    // 경로 자동 변경
    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }


    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }

}
