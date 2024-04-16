module com.example.bankmobile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankmobile to javafx.fxml;
    exports com.example.bankmobile;
}