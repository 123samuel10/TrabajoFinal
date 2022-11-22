package com.example.demoproyectofinalsamuel.controllers;

import com.example.demoproyectofinalsamuel.HelloApplication;
import com.example.demoproyectofinalsamuel.Model.Sale;
import com.example.demoproyectofinalsamuel.service.serviceImpl.ClientsServiceImpl;
import com.example.demoproyectofinalsamuel.service.serviceImpl.EmployeesServiceImpl;
import com.example.demoproyectofinalsamuel.service.serviceImpl.SaleServiceImpl;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SaleController implements Initializable {
    ModelFactoryController mfc=new ModelFactoryController();
    @FXML
    private TableView<Sale> tabla1;
    @FXML
    private TableColumn<Sale, Integer> mostrarCantidad;

    @FXML
    private TableColumn<Sale,String> mostrarCliente;

    @FXML
    private TableColumn<Sale, Integer> mostrarPrecio;

    @FXML
    private TableColumn<Sale,String > mostrarProducto;

    @FXML
    private TableColumn<Sale, Integer> mostrarTotal;
    @FXML
    void page1(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Home.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
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


    public void initData(ModelFactoryController mfc) {this.mfc=mfc;}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tabla1.setItems(FXCollections.observableArrayList(mfc.getSale()));
        mostrarCliente.setCellValueFactory(new PropertyValueFactory("name"));
        mostrarProducto.setCellValueFactory(new PropertyValueFactory("product"));
        mostrarCantidad.setCellValueFactory(new PropertyValueFactory("amount"));
        mostrarPrecio.setCellValueFactory(new PropertyValueFactory("price"));
        mostrarTotal.setCellValueFactory(new PropertyValueFactory("total"));
    }

    @FXML
    private TextField igualName;
    @FXML
    private Text productBanana;
    @FXML
    private Text precioBanana;
    @FXML
    private TextField cantidadBanana;

    @FXML
    void btnAdd(ActionEvent event) {
        String nameM = igualName.getText();
        int amount= Integer.parseInt(cantidadBanana.getText());

        try {
            if ("" != cantidadBanana.getText()) {
                mfc.makeSale(mfc, igualName.getText(), nameM,productBanana.getText(), amount, 100,2);
                tabla1.setItems(FXCollections.observableArrayList(mfc.getSale()));
                tabla1.refresh();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("MENSAJE DE INFORMACION");
                alert.setTitle("Dialogo de advertencia");
                alert.setContentText("Es necesario llenar los campos");
                alert.showAndWait();
            }
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("NO SE HA PODIDO REALIZAR LA VENTA");
            alert.showAndWait();
        }

    }



    @FXML
    void btnRemove(ActionEvent event) {

    }


}
