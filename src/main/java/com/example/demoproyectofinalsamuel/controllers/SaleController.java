package com.example.demoproyectofinalsamuel.controllers;
import com.example.demoproyectofinalsamuel.HelloApplication;
import com.example.demoproyectofinalsamuel.Model.Sale;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SaleController implements Initializable {
    ModelFactoryController mfc=ModelFactoryController.getInstance();
    @FXML
    private TableView<Sale> tabla1;
    @FXML
    private TableColumn<Sale, Integer> mostrarCantidad;

    @FXML
    private TableColumn<Sale,String> mostrarCliente;


    @FXML
    private TableColumn<Sale,String> mostrarProducto10;

    @FXML
    private TableColumn<Sale,String> mostrarProducto11;

    @FXML
    private TableColumn<Sale,String> mostrarProducto12;

    @FXML
    private TableColumn<Sale,String> mostrarProducto2;

    @FXML
    private TableColumn<Sale,String> mostrarProducto3;

    @FXML
    private TableColumn<Sale,String> mostrarProducto4;

    @FXML
    private TableColumn<Sale,String> mostrarProducto5;

    @FXML
    private TableColumn<Sale,String> mostrarProducto6;

    @FXML
    private TableColumn<Sale,String> mostrarProducto7;

    @FXML
    private TableColumn<Sale,String> mostrarProducto8;

    @FXML
    private TableColumn<Sale,String> mostrarProducto9;

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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tabla1.setItems(FXCollections.observableArrayList(mfc.getSale()));
        mostrarCliente.setCellValueFactory(new PropertyValueFactory("name"));
        mostrarProducto.setCellValueFactory(new PropertyValueFactory("productOne"));
        mostrarProducto2.setCellValueFactory(new PropertyValueFactory("productTwo"));
        mostrarProducto3.setCellValueFactory(new PropertyValueFactory("productThree"));
        mostrarProducto4.setCellValueFactory(new PropertyValueFactory("productFour"));
        mostrarProducto5.setCellValueFactory(new PropertyValueFactory("productFive"));
        mostrarProducto6.setCellValueFactory(new PropertyValueFactory("productSix"));
        mostrarProducto7.setCellValueFactory(new PropertyValueFactory("productSeven"));
        mostrarProducto8.setCellValueFactory(new PropertyValueFactory("productEight"));
        mostrarProducto9.setCellValueFactory(new PropertyValueFactory("productNine"));
        mostrarProducto10.setCellValueFactory(new PropertyValueFactory("productTen"));
        mostrarProducto11.setCellValueFactory(new PropertyValueFactory("productElevent"));
        mostrarProducto12.setCellValueFactory(new PropertyValueFactory("productTwelve"));
        mostrarCantidad.setCellValueFactory(new PropertyValueFactory("amount"));
        mostrarTotal.setCellValueFactory(new PropertyValueFactory("total"));
        mostrarCliente.setCellValueFactory(new PropertyValueFactory("client"));
    }
    @FXML
    private TextField igualName;
    //precios:
    @FXML
    private Text precioBanana;

    @FXML
    private Text precioCoco;

    @FXML
    private Text precioFresa;

    @FXML
    private Text precioLechuga;

    @FXML
    private Text precioLimon;

    @FXML
    private Text precioMango;

    @FXML
    private Text precioManzana;

    @FXML
    private Text precioNaranja;

    @FXML
    private Text precioPera;

    @FXML
    private Text precioPiña;

    @FXML
    private Text precioSandia;

    @FXML
    private Text precioUva;


    //productos:
    @FXML
    private Text productoCoco;

    @FXML
    private Text productoFresa;

    @FXML
    private Text productoLechuga;

    @FXML
    private Text productoLimon;

    @FXML
    private Text productoMango;

    @FXML
    private Text productoManzana;

    @FXML
    private Text productoNaranja;

    @FXML
    private Text productoPera;

    @FXML
    private Text productoPiña;

    @FXML
    private Text productoSandia;

    @FXML
    private Text productoUva;
    @FXML
    private Text productBanana;
    //cantidad:
    @FXML
    private TextField cantidadBanana;

    @FXML
    private TextField cantidadCoco;

    @FXML
    private TextField cantidadFresa;

    @FXML
    private TextField cantidadLechuga;

    @FXML
    private TextField cantidadLimon;

    @FXML
    private TextField cantidadMango;

    @FXML
    private TextField cantidadManzana;

    @FXML
    private TextField cantidadNaranja;

    @FXML
    private TextField cantidadPera;

    @FXML
    private TextField cantidadPiña;

    @FXML
    private TextField cantidadSandia;

    @FXML
    private TextField cantidadUvas;
    @FXML
    void btnAdd(ActionEvent event) {

        String nameM = igualName.getText();
        int amount= Integer.parseInt(cantidadBanana.getText());

        try {
            if ("" != cantidadBanana.getText()) {
                mfc.makeSale(igualName.getText(),nameM,productBanana.getText(),productoPera.getText(),productoManzana.getText(),productoUva.getText(),productoMango.getText(),productoFresa.getText(),productoNaranja.getText(),productoPiña.getText(),productoLechuga.getText(),productoLimon.getText(),productoSandia.getText(),productoCoco.getText(),amount,100,2);
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
