package com.company.chatterbook;

import com.sun.deploy.si.SingleInstanceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatterbookApplication {

    public static void main(String[] args) {
        SpringBootApplication.run(ChatterbookApplication.class, args);
    }

}
