package com.example.demoproyectofinalsamuel.service.serviceImpl;

public class Laboratory {

    private ClientsServiceImpl clientsService;
    private EmployeesServiceImpl employeesService;
    private SaleServiceImpl saleService;

    public Laboratory(){
        this.clientsService=new ClientsServiceImpl();
        this.employeesService=new EmployeesServiceImpl();
        this.saleService=new SaleServiceImpl();
    }

    public SaleServiceImpl getSaleService() {
        return saleService;
    }

    public EmployeesServiceImpl getEmployeesService() {
        return employeesService;
    }

    public ClientsServiceImpl getClientsService() {
        return clientsService;
    }
}
