package com.example.demoproyectofinalsamuel.controllers;
import com.example.demoproyectofinalsamuel.Model.Clients;
import com.example.demoproyectofinalsamuel.HelloApplication;
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
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class ClientsController implements Initializable {
    ModelFactoryController mfc = new ModelFactoryController();
    //textfield
    @FXML
    private TextField escribirProducto;
    @FXML
    private TextField escribirCantidad;
    @FXML
    private TextField escribirCorreo;
    @FXML
    private TextField escribirEdad;
    @FXML
    private TextField escribirNombre;
    @FXML
    private TextField escribirTelefono;
    @FXML
    private TableColumn<Clients, String> mostrarCorreo;
    @FXML
    private TableColumn<Clients, String> mostrarEdad;
    @FXML
    private TableColumn<Clients, String> mostrarId;
    @FXML
    private TableColumn<Clients, String> mostrarNombre;
    @FXML
    private TableColumn<Clients, String> mostrarProducto;
    @FXML
    private TableColumn<Clients, String> mostrarTelefono;
    @FXML
    private TableColumn<Clients, Integer> mostrarCantidad;
    @FXML
    private TableView<Clients> tabla;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tabla.setItems(FXCollections.observableArrayList(mfc.getClients()));
        mostrarId.setCellValueFactory(new PropertyValueFactory("id"));
        mostrarNombre.setCellValueFactory(new PropertyValueFactory("name"));
        mostrarEdad.setCellValueFactory(new PropertyValueFactory("age"));
        mostrarTelefono.setCellValueFactory(new PropertyValueFactory("phoneNumber"));
        mostrarCorreo.setCellValueFactory(new PropertyValueFactory("mail"));

    }
    public void initData(ModelFactoryController mfc) {
        this.mfc = mfc;
    }
    @FXML
    void page1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Home.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void page2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Employees.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        EmployeesController controller = fxmlLoader.getController();
        controller.initData(this.mfc);
        fxmlLoader.setController(controller);
        stage.setScene(scene);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void page3(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Clients.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        ClientsController controller = fxmlLoader.getController();
        controller.initData(this.mfc);
        fxmlLoader.setController(controller);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void page4(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sale.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        SaleController controller = fxmlLoader.getController();
        controller.initData(this.mfc);
        fxmlLoader.setController(controller);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void btnAdd(ActionEvent event) {
        try {
            String id = String.valueOf(Math.round(Math.random() * 100));
            if ("" != escribirNombre.getText()) {
                mfc.add(id, escribirNombre.getText(), escribirEdad.getText(), escribirTelefono.getText(), escribirCorreo.getText());
                tabla.setItems(FXCollections.observableArrayList(mfc.getClients()));
                tabla.refresh();
                cleanUp();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("MENSAJE DE INFORMACION");
                alert.setTitle("Dialogo de advertencia");
                alert.setContentText("Es necesario llenar los campos");
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("NO SE HA CREADO EL CLIENTE");
            alert.showAndWait();
        }
    }
    @FXML
    void btnRemove(ActionEvent event) {
        Clients client = this.tabla.getSelectionModel().getSelectedItem();//selecionar
        if (client == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Primero debes seleccinar un estudiante, Para poder eliminar");
            alert.showAndWait();
        } else {
            mfc.remove(client);
            tabla.setItems(FXCollections.observableArrayList(mfc.getClients()));
            tabla.refresh();
        }
    }
    @FXML
    private TextField buscarTextfield;
    @FXML
    void btnSearch(ActionEvent event) {
        String filter = buscarTextfield.getText();

        try {
            if (buscarTextfield.getText()!=""){
                mfc.Search(filter);
            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("MENSAJE DE INFORMACION");
                alert.setTitle("Dialogo de advertencia");
                alert.setContentText("Es necesario llenar los campos");
                alert.showAndWait();
            }
        }catch (NumberFormatException e){
        }
    }
    @FXML
    void select(ActionEvent event) {
        Clients clients=this.tabla.getSelectionModel().getSelectedItem();//selccionar
        if (clients!=null){
            this.escribirNombre.setText(clients.getName());
            this.escribirEdad.setText(clients.getAge());
            this.escribirTelefono.setText(clients.getPhoneNumber());
            this.escribirCorreo.setText(clients.getMail());
        }
    }
    @FXML
    void Modify(ActionEvent event) {
        Clients clients=this.tabla.getSelectionModel().getSelectedItem();
        if (clients==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Primero debes seleccinar un estudiante, Para poder modificar");
            alert.showAndWait();
        }else {
           String id= String.valueOf(Math.round(Math.random()*100)); String name=this.escribirNombre.getText();String age=this.escribirEdad.getText();String phone=this.escribirTelefono.getText();String correo=this.escribirCorreo.getText();
            Clients aux=new Clients(id,name,age,phone,correo);
            if (!this.mfc.getClients().contains(aux)){clients.setId(aux.getId());clients.setAge(aux.getAge());clients.setName(aux.getName());clients.setPhoneNumber(aux.getPhoneNumber());
                this.tabla.refresh();
                cleanUp();
        }
        }
    }
    private void cleanUp() {
        escribirNombre.setText("");
        escribirEdad.setText("");
        escribirCorreo.setText("");
        escribirTelefono.setText("");
    }
}