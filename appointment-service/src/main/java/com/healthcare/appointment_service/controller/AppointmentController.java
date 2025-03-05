package com.healthcare.appointment_service.controller;

import com.healthcare.appointment_service.model.Appointment;
import com.healthcare.appointment_service.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public Optional<Appointment> getAppointmentById(@PathVariable String id) {
        return appointmentService.getAppointmentById(id);
    }

    @GetMapping("/doctor/{doctorId}")
    public List<Appointment> getAppointmentsByDoctorId(@PathVariable String doctorId) {
        return appointmentService.getAppointmentsByDoctorId(doctorId);
    }

    @GetMapping("/patient/{patientId}")
    public List<Appointment> getAppointmentsByPatientId(@PathVariable String patientId) {
        return appointmentService.getAppointmentsByPatientId(patientId);
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.saveAppointment(appointment);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable String id) {
        appointmentService.deleteAppointment(id);
    }
}