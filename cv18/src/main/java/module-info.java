module com.example.otazka18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.otazka18 to javafx.fxml;
    exports com.example.otazka18;
}