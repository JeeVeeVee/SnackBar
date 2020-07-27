package kiesDeelnemers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class KiesDeelnemers extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("kiesDeelnemers.fxml"));
        /*
        ConnectionProvider connectionProvider = new ConnectionProvider();
        BestelControlla bestelControlla = new BestelControlla(connectionProvider.getConnection());
        loader.setController(bestelControlla);
         */
        Parent root = loader.load();
        stage.setTitle("SNACKBAR");
        stage.setScene(new Scene(root, 615, 650));
        stage.show();
    }
}
