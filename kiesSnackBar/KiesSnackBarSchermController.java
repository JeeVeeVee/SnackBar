package kiesSnackBar;

import Database.ConnectionProvider;
import Database.DatabaseCommunicator;
import Database.SnackBar;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.util.ArrayList;

public class KiesSnackBarSchermController {
    public Button zoekButton;
    public Button nieuweBarButton;
    public Button bestelButton;
    public TextField zoekterm;
    public ChoiceBox<String> allBars;

    private DatabaseCommunicator communicator;

    public KiesSnackBarSchermController(Connection connection){
        this.communicator = new DatabaseCommunicator(connection);
    }

    public void initialize(){
        ObservableList<String> list = FXCollections.observableArrayList();
        ArrayList<SnackBar> barz = communicator.getAllBars();
        for(SnackBar bar : barz){
            list.add(bar.getNaam());
            System.out.println(bar.getNaam());
        }
        allBars.setItems(list);
    }

}
