package com.example.demoproyectofinalsamuel.controllers;

import com.example.demoproyectofinalsamuel.HelloApplication;
import com.example.demoproyectofinalsamuel.service.serviceImpl.ClientsServiceImpl;
import com.example.demoproyectofinalsamuel.service.serviceImpl.EmployeesServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class HomeController {
    @FXML
    private VBox ap;

    @FXML
    private AnchorPane bp;

    @FXML
    private BorderPane bp2;

    @FXML
    private Button btnIrClientes;

    @FXML
    private Button btnIrEmpleados;

    @FXML
    private Button btnIrHome;

    @FXML
    private Button btnIrVenta;

    @FXML
    private Text iblStatus;

    @FXML
    private Pane pnlStatus;
   ModelFactoryController mfc=new ModelFactoryController();

    void initData(ModelFactoryController mfc) {
        this.mfc=mfc;
    }
    @FXML
    void page1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Home.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene=new Scene(root);
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void page2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Employees.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


    public void page3(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Clients.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void page4(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sale.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }



}
