module com.example.cv19 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv19 to javafx.fxml;
    exports com.example.cv19;
}