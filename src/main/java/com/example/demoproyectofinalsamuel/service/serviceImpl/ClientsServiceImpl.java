package com.example.demoproyectofinalsamuel.service.serviceImpl;

import com.example.demoproyectofinalsamuel.Model.Clients;
import com.example.demoproyectofinalsamuel.persistence.Persistence;
import com.example.demoproyectofinalsamuel.service.ClientsService;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ClientsServiceImpl implements ClientsService {
    List<Clients> clients=new ArrayList<>();


    @Override
    public boolean add(String id, String name, String age, String phoneNumber, String mail) {
        clients.add(new Clients(id,name,age,phoneNumber,mail));
        saveClientsPersistence();
        return true;
    }

    @Override
    public boolean remove(Clients client) {
        clients.remove(client);
        saveClientsPersistence();
        return true;
    }

    @Override
    public ObservableList<Clients> Search(String client) {
        Search(clients,client);
        return null;
    }


    public ObservableList<Clients> Search(List<Clients>clientsR,String client) {
        clientsR.forEach(clients -> {
            if (clients.getName().equals(client)) {
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("DATOS ENCONTRADOS");
                alert.setContentText("CORREO: "+clients.getMail()+" "+ "EDAD: "+clients.getMail()+" "+"TELEFONO: "+clients.getPhoneNumber());
                alert.showAndWait();
            }
        });

        return (ObservableList<Clients>) clientsR;

    }


    public List<Clients> getClients() {
        return clients;
    }




    public void startArrayListClient(){

        try {
            clients = Persistence.loadClients();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void saveClientsPersistence(){
        try {
            Persistence.saveClients(clients);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
