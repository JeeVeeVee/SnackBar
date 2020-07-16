package kiesSnackBar;

import Database.ConnectionProvider;
import Database.DatabaseCommunicator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;

public class Kiezer extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("kiesSnackBarScherm.fxml"));
        ConnectionProvider connectionProvider = new ConnectionProvider();
        KiesSnackBarSchermController controlla = new KiesSnackBarSchermController(connectionProvider.getConnection());
        loader.setController(controlla);
        Parent root = loader.load();
        stage.setTitle("SNACKBAR");
        stage.setScene(new Scene(root, 600, 200));
        stage.show();
    }
}
