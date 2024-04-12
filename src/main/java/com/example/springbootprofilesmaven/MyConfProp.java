package com.example.springbootprofilesmaven;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 2/14/2022.</p>
 * <p>Project: springboot-profiles-gradle</p>
 * *
 */
@Component
@ConfigurationProperties("foo.bar")
public class MyConfProp {

    String prop1;
    String prop2;

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
