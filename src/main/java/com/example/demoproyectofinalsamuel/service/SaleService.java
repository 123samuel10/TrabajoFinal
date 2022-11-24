package com.example.demoproyectofinalsamuel.service;

import com.example.demoproyectofinalsamuel.controllers.ClientsController;
import com.example.demoproyectofinalsamuel.controllers.ModelFactoryController;
import com.example.demoproyectofinalsamuel.service.serviceImpl.ClientsServiceImpl;

public interface SaleService {

    boolean makeSale(String name,String client,String product,int amount,int price,int total);

}
