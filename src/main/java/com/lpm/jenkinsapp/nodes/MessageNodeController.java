package com.lpm.jenkinsapp.nodes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageNodeController {
    @GetMapping("/test")
    public @ResponseBody String messageInit() {
        return "Initial Test With Jenkins.";
    }

    @GetMapping("/anothermessage")
    public @ResponseBody String anotherMessage() {
        return "Initial Test With Jenkins with Another Message.";
    }
}