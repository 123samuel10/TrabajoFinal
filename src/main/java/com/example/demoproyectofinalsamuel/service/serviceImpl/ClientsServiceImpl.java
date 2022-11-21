package com.example.demoproyectofinalsamuel.service.serviceImpl;

import com.example.demoproyectofinalsamuel.Model.Clients;
import com.example.demoproyectofinalsamuel.service.ClientsService;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ClientsServiceImpl implements ClientsService {
    List<Clients> clients=new ArrayList<>();


    @Override
    public boolean add(String id, String name, String age, String phoneNumber, String mail, String product, int amount) {
        clients.add(new Clients(id,name,age,phoneNumber,mail,product,amount));
        System.out.println(clients.get(0).getName());


        return true;
    }

    @Override
    public boolean remove(Clients client) {
        clients.remove(client);
        return true;
    }

    @Override
    public ObservableList<Clients> Search(String client) {
      Search(clients,client);
        return null;
    }


    public List<Clients> getClients() {
        return clients;
    }

    static List<Clients>Search(List<Clients>clientsR,String client){
        clientsR.forEach(clients -> {
            if (clients.getName() == client) {
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("DATOS ENCONTRADOS");
                alert.setContentText("PRODUCTO: "+clients.getProduct()+" "+" CANTIDAD: "+clients.getAmount()+" "+"CORREO: "+" "+ "EDAD: "+clients.getMail()+clients.getAge());
                alert.showAndWait();
            }
        });

        return clientsR;
    }
}
