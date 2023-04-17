package it.develhope.springboot.Dependency.Injection.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public String myComponentName;

    public MyComponent() {
        this.myComponentName = "Alessio";
        System.out.println("MyComponent constructor() has been called");;
    }

    public String getMyComponentName(){
        return "myComponentImmutableName is " + myComponentName + "MyComponent.getMyComponentName() has been called";
    }
}
