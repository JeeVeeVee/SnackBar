package kiesSnackBar;

import createNewSnackbar.NewSnackBarCreator;
import databaseAcces.DatabaseCommunicator;
import databaseAcces.SnackBar;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import kiesDeelnemers.KiesDeelnemers;

import java.sql.Connection;
import java.util.ArrayList;

public class KiesSnackBarSchermController {
    public Button zoekButton;
    public Button nieuweBarButton;
    public Button bestelButton;
    public TextField zoekterm;
    public ChoiceBox<String> allBars;
    public AnchorPane anker;

    private DatabaseCommunicator communicator;

    public KiesSnackBarSchermController(Connection connection){
        this.communicator = new DatabaseCommunicator(connection);
        allBars = new ChoiceBox<>();
        allBars.setLayoutX(363.0);
        allBars.setLayoutY(28.0);
        allBars.setPrefHeight(26.0);
        allBars.setPrefWidth(223.0);
    }

    public void initialize(){
        ObservableList<String> model = FXCollections.observableArrayList();
        ArrayList<SnackBar> barz = communicator.getAllBars();
        for(SnackBar bar : barz){
            model.add(bar.getNaam());
            System.out.println(bar.getNaam());
        }
        allBars.setItems(model);
        anker.getChildren().add(allBars);

        nieuweBarButton.setOnAction(e -> {
            NewSnackBarCreator snackBarCreator = new NewSnackBarCreator();
            try {
                snackBarCreator.start((Stage) nieuweBarButton.getScene().getWindow());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        bestelButton.setOnAction(e -> {
            KiesDeelnemers kiesDeelnemers = new KiesDeelnemers();
            try {
                kiesDeelnemers.start((Stage) bestelButton.getScene().getWindow());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

}
