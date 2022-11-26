package com.example.demoproyectofinalsamuel.service;

import com.example.demoproyectofinalsamuel.controllers.ClientsController;
import com.example.demoproyectofinalsamuel.controllers.ModelFactoryController;
import com.example.demoproyectofinalsamuel.service.serviceImpl.ClientsServiceImpl;

public interface SaleService {

    boolean makeSale(String name, String client, String productOne, String productTwo, String productThree, String productFour, String productFive, String productSix, String productSeven, String productEight, String productNine, String productTen, String productElevent, String productTwelve, int amount, int price, int total);


}