package com.healthcare.appointment_service.service;

import com.healthcare.appointment_service.model.Appointment;
import com.healthcare.appointment_service.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Optional<Appointment> getAppointmentById(String id) {
        return appointmentRepository.findById(id);
    }

    public List<Appointment> getAppointmentsByDoctorId(String doctorId) {
        return appointmentRepository.findByDoctorId(doctorId);
    }

    public List<Appointment> getAppointmentsByPatientId(String patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }

    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public void deleteAppointment(String id) {
        appointmentRepository.deleteById(id);
    }
}