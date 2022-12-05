package com.example.demoproyectofinalsamuel.service;

import com.example.demoproyectofinalsamuel.Model.Clients;
import com.example.demoproyectofinalsamuel.Model.Sale;

public interface SaleService {

    boolean makeSale(String name, String client, String productOne, String productTwo, String productThree, String productFour, String productFive, String productSix, String productSeven, String productEight, String productNine, String productTen, String productElevent, String productTwelve, int  amount, int  total);
    boolean removeSale(Sale sale1);
    boolean discount();
}