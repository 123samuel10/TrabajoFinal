package com.example.demoproyectofinalsamuel.controllers;
import com.example.demoproyectofinalsamuel.HelloApplication;
import com.example.demoproyectofinalsamuel.Model.Clock;
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
import javafx.scene.layout.Pane;
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
    @FXML
    private Text reloj1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new Clock(reloj1);
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
    int total=0;

    int totalAmount=0;

    @FXML
    void btnAdd(ActionEvent event) {

        //total de la factura
        int ternario=this.productBanana.getText().equals("Banana")?Integer.parseInt(cantidadBanana.getText())*600:0;
        int ternarioDos=this.productoPera.getText().equals("Pera")?Integer.parseInt(cantidadPera.getText())*1000:0;
        int ternarioTres=this.productoManzana.getText().equals("Manzana")?Integer.parseInt(cantidadManzana.getText())*1200:0;
        int ternarioCuatro=this.productoUva.getText().equals("Uvas")?Integer.parseInt(cantidadUvas.getText())*1200:0;
        int ternarioCinco=this.productoMango.getText().equals("Mango")?Integer.parseInt(cantidadMango.getText())*3000:0;
        int ternarioSix=this.productoFresa.getText().equals("Fresa")?Integer.parseInt(cantidadFresa.getText())*1200:0;
        int ternarioSeven=this.productoNaranja.getText().equals("Naranja")?Integer.parseInt(cantidadNaranja.getText())*3000:0;
        int ternarioEight=this.productoPiña.getText().equals("Piña")?Integer.parseInt(cantidadPiña.getText())*3000:0;
        int ternarioNine=this.productoLechuga.getText().equals("Lechuga")?Integer.parseInt(cantidadLechuga.getText())*800:0;
        int ternarioTen=this.productoLimon.getText().equals("Limon")?Integer.parseInt(cantidadLimon.getText())*500:0;
        int ternarioEleven=this.productoSandia.getText().equals("Sandia")?Integer.parseInt(cantidadSandia.getText())*5000:0;
        int ternarioTwelve=this.productoCoco.getText().equals("Coco")?Integer.parseInt(cantidadCoco.getText())*3400:0;
       total=ternario+ternarioDos+ternarioTres+ternarioCuatro+ternarioCinco+ternarioSix+ternarioSeven+ternarioEight+ternarioNine+ternarioTen+ternarioEleven+ternarioTwelve;
        //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
       int amountBanana=Integer.parseInt(cantidadBanana.getText());int amountPera=Integer.parseInt(cantidadPera.getText());int amountManzana=Integer.parseInt(cantidadManzana.getText());int amountUva=Integer.parseInt(cantidadUvas.getText());int amountMango=Integer.parseInt(cantidadMango.getText());int amountFresa=Integer.parseInt(cantidadFresa.getText());int amountNaranja=Integer.parseInt(cantidadNaranja.getText());int amountPiña=Integer.parseInt(cantidadPiña.getText());int amountLechuga=Integer.parseInt(cantidadLechuga.getText());int amountLimon=Integer.parseInt(cantidadLimon.getText());int amountSandia=Integer.parseInt(cantidadSandia.getText());int amountCoco=Integer.parseInt(cantidadCoco.getText());
       totalAmount=amountBanana+amountPera+amountManzana+amountMango+amountFresa+amountNaranja+amountUva+amountPiña+amountLechuga+amountLimon+amountSandia+amountCoco;
        String nameM = igualName.getText();
        try {
            if ("" != cantidadBanana.getText()) {
                mfc.makeSale(igualName.getText(),nameM,productBanana.getText(),productoPera.getText(),productoManzana.getText(),productoUva.getText(),productoMango.getText(),productoFresa.getText(),productoNaranja.getText(),productoPiña.getText(),productoLechuga.getText(),productoLimon.getText(),productoSandia.getText(),productoCoco.getText(),totalAmount,total);
                mfc.discount();
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
        Sale sale = this.tabla1.getSelectionModel().getSelectedItem();//selecionar
        if (sale == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Primero debes seleccinar un estudiante, Para poder eliminar");
            alert.showAndWait();
    }else {
            mfc.removeSale(sale);
            tabla1.setItems(FXCollections.observableArrayList(mfc.getSale()));
            tabla1.refresh();
        }
}
    @FXML
    private Pane reloj;







}
