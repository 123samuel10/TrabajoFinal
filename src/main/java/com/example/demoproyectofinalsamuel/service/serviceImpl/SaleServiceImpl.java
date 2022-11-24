package com.example.demoproyectofinalsamuel.service.serviceImpl;

import com.example.demoproyectofinalsamuel.Model.Clients;
import com.example.demoproyectofinalsamuel.Model.Sale;
import com.example.demoproyectofinalsamuel.controllers.ModelFactoryController;
import com.example.demoproyectofinalsamuel.service.SaleService;

import java.util.ArrayList;
import java.util.List;

public class SaleServiceImpl implements SaleService {

    List<Sale> sale=new ArrayList<>();
    private final Laboratory laboratory ;

    public SaleServiceImpl(Laboratory laboratory) {
        this.laboratory = laboratory;
    }



    @Override
    public boolean makeSale(String name,String client,String product,int amount,int price,int total) {
       // List<Clients> clients = laboratory.getClientsService().getClients();

        for (int i=0;i<laboratory.getClientsService().getClients().size();i++){
            if (laboratory.getClientsService().getClients()!=null && laboratory.getClientsService().getClients().get(i).getName().equals(name)){
                sale.add(new Sale(client,product,amount,price,total));
            }
        }
        return true;
    }

    public List<Sale> getSale() {
        return sale;
    }
}
