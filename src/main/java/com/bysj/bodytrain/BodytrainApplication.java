package com.bysj.bodytrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = {"com.bysj.bodytrain.Utils"})
@SpringBootApplication
public class BodytrainApplication {

    public static void main(String[] args) {
        SpringApplication.run(BodytrainApplication.class, args);
    }

}
