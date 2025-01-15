module com.example.cv20 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv20 to javafx.fxml;
    exports com.example.cv20;
}