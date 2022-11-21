package com.example.demoproyectofinalsamuel.service;

import com.example.demoproyectofinalsamuel.Model.Employees;

public interface EmployeesService {
    boolean add(String id, String name, String age, String phoneNumber, String experience,String mail);
    boolean delete(Employees employes);
    boolean Search(String name);
}
