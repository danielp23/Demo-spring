package com.example.demo.doctors.controller;

import com.example.demo.doctors.entities.Doctor;
import com.example.demo.doctors.services.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("restDoctorController")
@RequestMapping("/api/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(final DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("all")
    public List<Doctor> getDoctors() {
        return this.doctorService.getDoctors();
    }

    @PostMapping
    public Doctor saveDoctors(@RequestBody Doctor doctor) {
        return this.doctorService.saveDoctor(doctor);
    }
}
