module com.example.cv21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv21 to javafx.fxml;
    exports com.example.cv21;
}