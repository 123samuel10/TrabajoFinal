package com.example.demoproyectofinalsamuel.service.serviceImpl;

import com.example.demoproyectofinalsamuel.Model.Sale;
import com.example.demoproyectofinalsamuel.controllers.ModelFactoryController;
import com.example.demoproyectofinalsamuel.service.ModelFactoryControllerService;
import com.example.demoproyectofinalsamuel.service.SaleService;

import java.util.ArrayList;
import java.util.List;

public class SaleServiceImpl implements SaleService {

    List<Sale> sale=new ArrayList<>();


    @Override
    public boolean makeSale(ModelFactoryController mfc,String name,String client,String product,int amount,int price,int total) {

        for (int i=0;i<mfc.getLaboratory().getClientsService().getClients().size();i++){
            if (mfc.getClients()!=null && mfc.getClients().get(i).getName().equals(name)){
                sale.add(new Sale(client,product,amount,price,total));
            }
        }

//        for (int i=0;i<mfc.getLaboratory().getClientsService().getClients().size();i++){
//            if (mfc.getClients().get(i).equals(name)){
//
//            }
//        }
        return true;
    }

    public List<Sale> getSale() {
        return sale;
    }
}
