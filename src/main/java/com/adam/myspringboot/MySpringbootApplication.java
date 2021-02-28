package com.adam.myspringboot;

import com.adam.myspringboot.tink.TinkConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.security.GeneralSecurityException;

@SpringBootApplication
public class MySpringbootApplication {

    public static void main(String[] args) {
        TinkConfiguration tinkConfiguration = new TinkConfiguration();
        try {
            tinkConfiguration.init();
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        }
        SpringApplication.run(MySpringbootApplication.class, args);

    }

}
