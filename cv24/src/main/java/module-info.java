module com.example.cv24 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv24 to javafx.fxml;
    exports com.example.cv24;
}