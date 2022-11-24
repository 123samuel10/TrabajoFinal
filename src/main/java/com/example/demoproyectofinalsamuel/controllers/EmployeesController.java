package com.example.demoproyectofinalsamuel.controllers;
import com.example.demoproyectofinalsamuel.HelloApplication;
import com.example.demoproyectofinalsamuel.Model.Employees;
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
public class EmployeesController implements Initializable {
    ModelFactoryController mfc=ModelFactoryController.getInstance();
    @FXML
    private TextField escribirCorreo;
    @FXML
    private TextField escribirEdad;
    @FXML
    private TextField escribirExperiencia;
    @FXML
    private TextField escribirNombre;
    @FXML
    private TextField escribirTelefono;
    @FXML
    private TableView<Employees> tabla1;
    @FXML
    private TableColumn<Employees,String> mostrarCorreo;
    @FXML
    private TableColumn<Employees, String> mostrarEdad;
    @FXML
    private TableColumn<Employees,String> mostrarExpereincia;
    @FXML
    private TableColumn<Employees, String> mostrarId;
    @FXML
    private TableColumn<Employees,String > mostrarNombre;
    @FXML
    private TableColumn<Employees,String> mostrarTelefono;
    @FXML
    void page1(ActionEvent event) throws IOException {
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
        tabla1.setItems(FXCollections.observableArrayList(mfc.getEmployees()));
        mostrarId.setCellValueFactory(new PropertyValueFactory("id"));
        mostrarNombre.setCellValueFactory(new PropertyValueFactory("name"));
        mostrarEdad.setCellValueFactory(new PropertyValueFactory("age"));
        mostrarTelefono.setCellValueFactory(new PropertyValueFactory("phoneNumber"));
        mostrarCorreo.setCellValueFactory(new PropertyValueFactory("mail"));
        mostrarExpereincia.setCellValueFactory(new PropertyValueFactory("yearsExperience"));
    }
    @FXML
    void btnAdd(ActionEvent event) {
        try {
            String id = String.valueOf(Math.round(Math.random() * 100));
            if ("" != escribirNombre.getText()) {
                mfc.addE(id, escribirNombre.getText(), escribirEdad.getText(), escribirTelefono.getText(),escribirExperiencia.getText(),escribirCorreo.getText());
                tabla1.setItems(FXCollections.observableArrayList(mfc.getEmployees()));
                tabla1.refresh();
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
            alert.setContentText("NO SE HA CREADO EL ESTUDIANTE");
            alert.showAndWait();
        }
    }
    @FXML
    void btdDelete(ActionEvent event) {
        Employees employees=this.tabla1.getSelectionModel().getSelectedItem();//seleccionar
        if (employees==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Primero debes seleccinar un estudiante, Para poder eliminar");
            alert.showAndWait();
        }else {
            mfc.removeE(employees);
            tabla1.setItems(FXCollections.observableArrayList(mfc.getEmployees()));
            tabla1.refresh();
        }
    }
    @FXML
    void btnSelect(ActionEvent event) {
        Employees employees=this.tabla1.getSelectionModel().getSelectedItem();//selccionar
        if (employees!=null){
            this.escribirNombre.setText(employees.getName());
            this.escribirEdad.setText(employees.getAge());
            this.escribirTelefono.setText(employees.getPhoneNumber());
            this.escribirCorreo.setText(employees.getMail());
            this.escribirExperiencia.setText(employees.getYearsExperience());
        }
    }
    @FXML
    void btnModify(ActionEvent event) {
        Employees employees=this.tabla1.getSelectionModel().getSelectedItem();
        if (employees==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Primero debes seleccinar un estudiante, Para poder modificar");
            alert.showAndWait();
        }else {
            String id= String.valueOf(Math.round(Math.random()*100)); String name=this.escribirNombre.getText();String age=this.escribirEdad.getText();String phone=this.escribirTelefono.getText();String correo=this.escribirCorreo.getText();String experience=this.escribirExperiencia.getText();
            Employees aux=new Employees(id,name,age,phone,correo,experience);
            if (!this.mfc.getClients().contains(aux)){employees.setMail(aux.getMail());employees.setId(aux.getId());employees.setAge(aux.getAge());employees.setName(aux.getName());employees.setPhoneNumber(aux.getPhoneNumber());employees.setYearsExperience(aux.getYearsExperience());
                this.tabla1.refresh();
                cleanUp();
            }
        }
    }
    @FXML
    private TextField buscarName;
    @FXML
    void btnSearch(ActionEvent event) {
        mfc.SearchE(buscarName.getText());
    }
    void cleanUp(){
        escribirNombre.setText("");
        escribirExperiencia.setText("");
        escribirEdad.setText("");
        escribirCorreo.setText("");
        escribirTelefono.setText("");
    }
}
