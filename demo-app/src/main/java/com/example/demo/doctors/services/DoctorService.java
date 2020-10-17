package com.example.demo.doctors.services;

import com.example.demo.doctors.entities.Doctor;
import com.example.demo.doctors.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(final DoctorRepository doctorRepository){
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getDoctors(){
        return this.doctorRepository.findAll();
    }

    public Doctor saveDoctor(Doctor doctor){
        return this.doctorRepository.save(doctor);
    }
}
