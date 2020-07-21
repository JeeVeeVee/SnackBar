package besteller;

import Database.ConnectionProvider;
import Database.Snack;
import Database.SnackBar;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Besteller extends Application {

    private SnackBar snackBar;

    public Besteller(SnackBar snackBar){
        this.snackBar = snackBar;
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("besteller.fxml"));
        ConnectionProvider connectionProvider = new ConnectionProvider();
        BestelControlla bestelControlla = new BestelControlla(connectionProvider.getConnection());
        loader.setController(bestelControlla);
        Parent root = loader.load();
        stage.setTitle("MyTabb");
        stage.setScene(new Scene(root, 615, 250));
        stage.show();
    }
}
