package com.example.demoproyectofinalsamuel.controllers;

import com.example.demoproyectofinalsamuel.HelloApplication;
import com.example.demoproyectofinalsamuel.service.serviceImpl.ClientsServiceImpl;
import com.example.demoproyectofinalsamuel.service.serviceImpl.EmployeesServiceImpl;
import com.example.demoproyectofinalsamuel.service.serviceImpl.SaleServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SaleController {
    @FXML
    void page1(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Home.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
    @FXML
    private TextField igual;
    @FXML
    void page2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Employees.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
    @FXML
    void page3(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Clients.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
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

    ModelFactoryController mfc=new ModelFactoryController();
    public void initData(ModelFactoryController mfc) {this.mfc=mfc;}

    @FXML
    private TextField igualName;

    @FXML
    void btnAdd(ActionEvent event) {
        mfc.probar(mfc,igualName.getText());
    }

    @FXML
    void btnRemove(ActionEvent event) {

    }


}
