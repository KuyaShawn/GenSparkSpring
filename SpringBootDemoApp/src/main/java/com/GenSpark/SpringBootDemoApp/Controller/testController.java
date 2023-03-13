package com.GenSpark.SpringBootDemoApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    // Below is for Testing purposes only
    @GetMapping("/homeTest")
    public String homePage() {
        return "<HTML><h1>Welcome to my first Boot Application!</h1></HTML>";
    }


    @RequestMapping("helloTest")
    public String hello(@RequestParam(value = "name", defaultValue = "There!") String name) {
        return "Hello " + name;
    }

    @GetMapping("/helloTest2")
    public String hello2(@RequestParam(value = "name", defaultValue = "world") String name, @RequestParam(value = "msg", defaultValue = " Good Morning!") String msg) {
        return "Hello " + name + ", " + msg;
    }
}
