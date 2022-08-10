module com.example.quepasaclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quepasaclient to javafx.fxml;
    exports com.example.quepasaclient;
}