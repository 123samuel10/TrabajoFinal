package com.example.demoproyectofinalsamuel.service;

import com.example.demoproyectofinalsamuel.Model.Clients;
import javafx.collections.ObservableList;

public interface ClientsService {

    boolean add(String id, String name, String age, String phoneNumber, String mail, String product, int amount);
    boolean remove(Clients client);
    ObservableList<Clients> Search(String  client);



}
