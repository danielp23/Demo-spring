package com.example.demo.doctors.repositories;

import com.example.demo.doctors.entities.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
