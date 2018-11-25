package com.stradtman.controller;

import com.stradtman.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    private final DemoService demoService;
    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }
    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @GetMapping("welcome")
    public String welcome(@RequestParam String user, Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        log.info("model = {}", model);
        return "welcome";
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");
        return demoService.getWelcomeMessage();
    }
}
