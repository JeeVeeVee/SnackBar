package createNewSnackbar;

import databaseAcces.ConnectionProvider;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kiesSnackBar.KiesSnackBarSchermController;

public class NewSnackBarCreator extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("newSnackBarScherm.fxml"));
        Parent root = loader.load();
        stage.setTitle("SNACKBAR");
        stage.setScene(new Scene(root, 600, 200));
        stage.show();
    }
}
