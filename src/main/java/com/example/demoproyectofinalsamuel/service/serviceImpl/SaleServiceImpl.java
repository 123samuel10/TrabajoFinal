package com.example.demoproyectofinalsamuel.service.serviceImpl;

import com.example.demoproyectofinalsamuel.Model.Sale;
import com.example.demoproyectofinalsamuel.controllers.ModelFactoryController;
import com.example.demoproyectofinalsamuel.service.ModelFactoryControllerService;
import com.example.demoproyectofinalsamuel.service.SaleService;

import java.util.ArrayList;

public class SaleServiceImpl implements SaleService {

    ArrayList<Sale> sale=new ArrayList<>();




    @Override
    public boolean probar(ModelFactoryController mfc) {
        for (int i=0;i<mfc.getLaboratory().getClientsService().getClients().size();i++){
            if (mfc.getClients()!=null){
                System.out.println(mfc.getLaboratory().getClientsService().getClients().get(i).getName());
            }else {
                System.out.println("nqda");
            }
        }
        return false;
    }
}
