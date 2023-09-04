module com.example.multithreaded_server {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.multithreaded_server to javafx.fxml;
    exports com.example.multithreaded_server;
}