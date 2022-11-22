package com.example.demoproyectofinalsamuel.Model;

import java.util.Objects;

public class Clients extends Person{
    private String mail;



    public Clients(String id,String name, String age, String phoneNumber, String mail) {
        super(id,name, age, phoneNumber);
        this.mail=mail;

    }



    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }




}
