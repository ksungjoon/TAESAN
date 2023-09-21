package com.ts.taesan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TaesanApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaesanApplication.class, args);
    }

}
