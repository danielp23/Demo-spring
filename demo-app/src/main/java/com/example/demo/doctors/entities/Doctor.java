package com.example.demo.doctors.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("doctor")
@Data
public class Doctor {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String location;
}
