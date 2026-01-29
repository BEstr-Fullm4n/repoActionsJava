package com.bancoppel.gitactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello World 4 GitHub-Actions v1.4 Test-pullReqest 2.1.6";
    }
}
