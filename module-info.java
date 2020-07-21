module SnackBar {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;
    requires java.desktop;

    exports startup to javafx.graphics, javafx.fxml;
    exports kiesSnackBar to javafx.graphics, javafx.fxml;
    exports besteller to javafx.graphics, javafx.fxml;
    opens kiesSnackBar;
    opens besteller;
}