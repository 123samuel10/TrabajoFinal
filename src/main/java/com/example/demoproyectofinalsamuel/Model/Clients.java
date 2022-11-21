package com.example.demoproyectofinalsamuel.Model;

import java.util.Objects;

public class Clients extends Person{
    private String mail;
    private String product;
    private int amount;

    public Clients(String id,String name, String age, String phoneNumber, String mail, String  product, int amount) {
        super(id,name, age, phoneNumber);
        this.mail=mail;
        this.product=product;
        this.amount=amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
