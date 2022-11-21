package com.example.demoproyectofinalsamuel.controllers;

import com.example.demoproyectofinalsamuel.Model.Clients;
import com.example.demoproyectofinalsamuel.Model.Employees;
import com.example.demoproyectofinalsamuel.service.ModelFactoryControllerService;
import com.example.demoproyectofinalsamuel.service.serviceImpl.Laboratory;
import javafx.collections.ObservableList;

import java.util.List;

public class ModelFactoryController implements ModelFactoryControllerService {
    Laboratory laboratory;
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        laboratory = new Laboratory();
    }


    @Override
    public boolean add(String id, String name, String age, String phoneNumber, String mail, String product, int amount) {
        return laboratory.getClientsService().add(id,name,age,phoneNumber,mail,product,amount);

    }

    @Override
    public String remove(Clients client) {
        return String.valueOf(laboratory.getClientsService().remove(client));
    }

    @Override
    public ObservableList<Clients> Search(String  client) {
        return laboratory.getClientsService().Search(client);
    }

    @Override
    public boolean addE(String id, String name, String age, String phoneNumber, String experience,String mail) {
        return laboratory.getEmployeesService().add(id,name,age,phoneNumber,experience,mail);
    }

    @Override
    public boolean removeE(Employees employes) {
        return laboratory.getEmployeesService().delete(employes);
    }

    @Override
    public boolean SearchE(String name) {
        return laboratory.getEmployeesService().Search(name);
    }


    @Override
    public boolean probar(ModelFactoryController mfc) {
        return laboratory.getSaleService().probar(mfc);
    }

    @Override
    public List<Clients> getClients() {
        return laboratory.getClientsService().getClients();
    }

    @Override
    public List<Employees> getEmployees() {
        return laboratory.getEmployeesService().getEmployees();
    }


    public Laboratory getLaboratory() {
        return laboratory;
    }
}
