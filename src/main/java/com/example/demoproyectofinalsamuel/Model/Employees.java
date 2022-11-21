package com.example.demoproyectofinalsamuel.Model;

public class Employees extends Person{
    private String yearsExperience;
    private String mail;
    public Employees(String id, String name, String age, String phoneNumber,String yearsExperience,String mail) {
        super(id, name, age, phoneNumber);
        this.yearsExperience=yearsExperience;
        this.mail=mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(String yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
}
