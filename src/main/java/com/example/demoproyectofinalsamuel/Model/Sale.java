package com.example.demoproyectofinalsamuel.Model;

import com.example.demoproyectofinalsamuel.service.serviceImpl.ClientsServiceImpl;

public class Sale {
   private String name;
   private String product;
   private int amount;
   private int total;
   private int price;
    public Sale(String name,String product,int amount,int price,int total) {
        this.name=name;
        this.product=product;
        this.amount=amount;
        this.price=price;
        this.total=total;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
