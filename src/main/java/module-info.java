module com.example.colorsdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.colorsdemo to javafx.fxml;
    exports com.example.colorsdemo;
}