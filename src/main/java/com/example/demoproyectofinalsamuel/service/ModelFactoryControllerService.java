package com.example.demoproyectofinalsamuel.service;

import com.example.demoproyectofinalsamuel.Model.Clients;
import com.example.demoproyectofinalsamuel.Model.Employees;
import com.example.demoproyectofinalsamuel.Model.Sale;
import com.example.demoproyectofinalsamuel.controllers.ModelFactoryController;
import javafx.collections.ObservableList;

import java.util.List;

public interface ModelFactoryControllerService {
    //parte cliente
    boolean add(String id, String name, String age, String phoneNumber, String mail);
   // boolean add(String id, String name, String age, String phoneNumber, String mail, String product, int amount);
    String remove(Clients client);
    ObservableList<Clients> Search(String  client);

    //-----------------------------------------------------------------------------------
    //parte empleado
    boolean addE(String id, String name, String age, String phoneNumber, String experience,String mail);
    boolean removeE(Employees employes);
    boolean SearchE(String name);
    boolean makeSale(String name,String client,String product,int amount,int price,int total);
     List<Clients> getClients();
     List<Employees>getEmployees();
     List<Sale>getSale();








}
