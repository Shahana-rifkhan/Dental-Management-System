/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.toothcare.controller;
import com.toothcare.model.Doctor;

import java.util.List;

/**
 *
 * @author mhmha
 */
public interface DashboardDAO {
    int getTotalDoctors();
    int getTotalAppointments();
}
