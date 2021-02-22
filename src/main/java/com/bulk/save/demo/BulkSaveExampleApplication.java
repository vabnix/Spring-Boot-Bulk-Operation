package com.bulk.save.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.bulk.save.demo.repository")
public class BulkSaveExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BulkSaveExampleApplication.class, args);
    }

}
