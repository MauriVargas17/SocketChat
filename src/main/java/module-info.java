module com.example.quepasaserver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quepasaserver to javafx.fxml;
    exports com.example.quepasaserver;
}