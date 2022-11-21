package com.example.demoproyectofinalsamuel.service.serviceImpl;

import com.example.demoproyectofinalsamuel.Model.Employees;
import com.example.demoproyectofinalsamuel.service.EmployeesService;
import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployeesServiceImpl implements EmployeesService {
    List<Employees>employees=new ArrayList<>();

    @Override
    public boolean add(String id, String name, String age, String phoneNumber, String experience,String mail) {
        employees.add(new Employees(id,name,age,phoneNumber,experience,mail));
        System.out.println(employees.get(0).getName());
        return true;
    }

    @Override
    public boolean delete(Employees employes) {
        employees.remove(employes);
        return true;
    }

    @Override
    public boolean Search(String name) {
        Search(employees,name);

        return false;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    static List<Employees>Search(List<Employees>searh,String name){
        searh.forEach(employees1 -> {
            if (employees1.getName().equals(name) ) {
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("DATOS ENCONTRADOS");
                alert.setContentText("EDAD: "+employees1.getAge()+" "+" CORREO: "+employees1.getMail()+ "TELEFONO: "+employees1.getPhoneNumber()+" "+"EXPERIENCIA"+employees1.getYearsExperience());
                alert.showAndWait();
            }
        });
        return searh;
    }
}
