package it.develhope.springboot.Dependency.Injection.controller;

import it.develhope.springboot.Dependency.Injection.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    @Autowired
    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
        System.out.println("MyService constructor has been called");
    }

    @GetMapping("/getName")
    public String getName(){
        return myService.getName() + "MyService.getName() has been called";
    }

    @GetMapping("/")
    public String welcomeMessage(){
        return "This is a welcome message";
    }
}
