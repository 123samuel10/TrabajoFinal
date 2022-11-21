module com.example.demoproyectofinalsamuel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoproyectofinalsamuel to javafx.fxml;
    exports com.example.demoproyectofinalsamuel;
    opens com.example.demoproyectofinalsamuel.controllers to javafx.fxml;
    opens com.example.demoproyectofinalsamuel.Model to javafx.base;

}