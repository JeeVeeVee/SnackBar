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
    exports kiesDeelnemers to javafx.graphics, javafx.fxml;
    exports createNewSnackbar to javafx.graphics, javafx.fxml;
    opens kiesSnackBar;
    opens besteller;
    opens kiesDeelnemers;
    opens databaseAcces;
    opens startup;
    opens createNewSnackbar;
}