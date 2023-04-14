package it.develhope.springboot.Dependency.Injection.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public String myComponentName;

    public MyComponent(String myComponentName) {
        this.myComponentName = myComponentName;
    }

    public String getMyComponentName(String myComponentImmutableName){
        return myComponentImmutableName;
    }
}
