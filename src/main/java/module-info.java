module com.example.framework {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.framework to javafx.fxml;
    exports com.example.framework;
}