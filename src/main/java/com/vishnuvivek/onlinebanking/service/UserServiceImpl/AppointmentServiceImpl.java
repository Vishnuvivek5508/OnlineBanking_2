package com.vishnuvivek.onlinebanking.service.UserServiceImpl;

import com.vishnuvivek.onlinebanking.entity.Appointment;
import com.vishnuvivek.onlinebanking.repository.AppointmentDao;
import com.vishnuvivek.onlinebanking.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * * Created by Eclipse.
 * Project : online-banking
 * User: vishnu vivek
 * Email: vinuvivek07@gmail.com
 * Date: 20/09/22
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;

    public Appointment createAppointment(Appointment appointment) {
        return appointmentDao.save(appointment);
    }

    public List<Appointment> findAll() {
        return appointmentDao.findAll();
    }

    public Appointment findAppointment(Long id) {
        return appointmentDao.findById(id).get();
    }

    public void confirmAppointment(Long id) {
        Appointment appointment = findAppointment(id);
        appointment.setConfirmed(true);
        appointmentDao.save(appointment);
    }
}