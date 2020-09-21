package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/ping")
    public String ping() {
        return "ping";
    }

    @GetMapping(path = "/pong")
    public String pong() {
        return "pong";
    }

    @GetMapping(path = "/pingpong")
    public String pingpong() {
        return "pingpong";
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello and good morning";
    }

}


