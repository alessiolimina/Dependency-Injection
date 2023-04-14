package it.develhope.springboot.Dependency.Injection.service;

import it.develhope.springboot.Dependency.Injection.component.MyComponent;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent myComponent;

    public MyService(MyComponent myComponent){
        this.myComponent = myComponent;
    }

    public String getName(){
        return myComponent.getMyComponentName();
    }
}
