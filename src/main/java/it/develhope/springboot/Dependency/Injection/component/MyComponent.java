package it.develhope.springboot.Dependency.Injection.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public String myComponentName;

    public MyComponent(String myComponentName) {
        this.myComponentName = myComponentName;
        System.out.println("MyComponent constructor() has been called");;
    }

    public String getMyComponentName(String myComponentImmutableName){
        return myComponentImmutableName + "MyComponent.getMyComponentName() has been called";
    }
}
