package it.develhope.springboot.Dependency.Injection.controller;

import it.develhope.springboot.Dependency.Injection.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/getName")
    public String getName(){
        return myService.getName();
    }
}
