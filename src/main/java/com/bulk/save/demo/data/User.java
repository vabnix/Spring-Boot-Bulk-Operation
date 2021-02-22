package com.bulk.save.demo.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {
    @Id
    public String id;
    public String firstName;
    public String lastName;
}
