module SnackBar {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;
    requires java.desktop;

    exports Main to javafx.graphics, javafx.fxml;

}