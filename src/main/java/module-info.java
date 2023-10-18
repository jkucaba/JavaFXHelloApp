module com.jakubku.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.firstapp to javafx.fxml;
    exports com.jakubku.firstapp;
}