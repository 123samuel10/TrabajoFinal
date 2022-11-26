package com.example.demoproyectofinalsamuel.Model;

import com.example.demoproyectofinalsamuel.service.serviceImpl.ClientsServiceImpl;

public class Sale {
   private String name;
   private String product;
   private String productOne;
   private String productTwo;
   private String productThree;
   private String productFour;
   private String productFive;
   private String productSix;
   private String productSeven;
   private String productEight;
   private String productNine;
   private String productTen;
   private String productElevent;
   private String productTwelve;
   private int amount;
   private int total;
   private int price;

   private String  client;
    public Sale(String client,String productOne,String productTwo,String productThree,String productFour,String productFive,String productSix,String productSeven,String productEight,String productNine,String productTen,String productElevent,String productTwelve,int amount,int price,int total) {
        this.client=client;
        this.productOne=productOne;
        this.productTwo=productTwo;
        this.productThree=productThree;
        this.productFour=productFour;
        this.productFive=productFive;
        this.productSix=productSix;
        this.productSeven=productSeven;
        this.productEight=productEight;
        this.productNine=productNine;
        this.productTen=productTen;
        this.productElevent=productElevent;
        this.productTwelve=productTwelve;
        this.amount=amount;
        this.price=price;
        this.total=total;


    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductNine() {
        return productNine;
    }

    public String getProductSeven() {
        return productSeven;
    }

    public void setProductSeven(String productSeven) {
        this.productSeven = productSeven;
    }

    public String getProductOne() {
        return productOne;
    }

    public void setProductOne(String productOne) {
        this.productOne = productOne;
    }

    public void setProductNine(String productNine) {
        this.productNine = productNine;
    }

    public String getProductFour() {
        return productFour;
    }

    public void setProductFour(String productFour) {
        this.productFour = productFour;
    }

    public String getProductFive() {
        return productFive;
    }

    public void setProductFive(String productFive) {
        this.productFive = productFive;
    }

    public String getProductElevent() {
        return productElevent;
    }

    public void setProductElevent(String productElevent) {
        this.productElevent = productElevent;
    }

    public String getProductEight() {
        return productEight;
    }

    public void setProductEight(String productEight) {
        this.productEight = productEight;
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

    public String getProductSix() {
        return productSix;
    }

    public void setProductSix(String productSix) {
        this.productSix = productSix;
    }

    public String getProductTen() {
        return productTen;
    }

    public void setProductTen(String productTen) {
        this.productTen = productTen;
    }

    public String getProductThree() {
        return productThree;
    }

    public void setProductThree(String productThree) {
        this.productThree = productThree;
    }

    public String getProductTwelve() {
        return productTwelve;
    }

    public void setProductTwelve(String productTwelve) {
        this.productTwelve = productTwelve;
    }

    public String getProductTwo() {
        return productTwo;
    }

    public void setProductTwo(String productTwo) {
        this.productTwo = productTwo;
    }

}
