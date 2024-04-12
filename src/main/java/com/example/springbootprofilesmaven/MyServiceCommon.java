package com.example.springbootprofilesmaven;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("common")
@Service
public class MyServiceCommon implements MyService {
    @Override
    public String getId() {
        return "common";
    }
}
