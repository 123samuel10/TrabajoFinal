package com.example.demoproyectofinalsamuel.service;

import com.example.demoproyectofinalsamuel.Model.Clients;
import com.example.demoproyectofinalsamuel.Model.Employees;
import com.example.demoproyectofinalsamuel.Model.Sale;
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
    //empleado
    boolean addE(String id, String name, String age, String phoneNumber, String experience,String mail);
    boolean removeE(Employees employes);
    boolean SearchE(String name);
    //sale
    boolean makeSale(String name,String client,String productOne,String productTwo,String productThree,String productFour,String productFive,String productSix,String productSeven,String productEight,String productNine,String productTen,String productElevent,String productTwelve,int  amount,int  total);
    boolean removeSale(Sale sale1);
     List<Clients> getClients();
     List<Employees>getEmployees();
     List<Sale>getSale();

}
