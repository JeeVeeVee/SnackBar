package besteller;

import Database.Leider;
import Database.Snack;
import Database.SnackBar;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

import java.util.ArrayList;

/*
deze klasse wordt gebruikt om de specifieke bestelling van 1 persoon vast te leggen
 */

public class PersoonlijkeBestelling extends AnchorPane {
    private Leider leider;
    private ArrayList<Snack> snacks;

    public Label naam;
    public ChoiceBox<Snack> allSnacks;
    public Button addSnackButton;
    public Label snackLabel;
    public Button getOverviewButton;

    public PersoonlijkeBestelling(){
        //prefHeight="273.0" prefWidth="631.0"
        super();
        super.setPrefHeight(273.0);
        super.setPrefWidth(631.0);
        leider = new Leider("Jules", "Vervaeke", 0.0);
        naam = new Label();
        allSnacks = new ChoiceBox<>();
        addSnackButton = new Button();
        snackLabel = new Label();
        getOverviewButton = new Button();
        this.getChildren().addAll(naam, allSnacks, addSnackButton, snackLabel, getOverviewButton);

        initialize();
    }

    public PersoonlijkeBestelling(Leider leider){
        this.leider = leider;
    }

    public void initialize(){
        naam.setLayoutX(47.0);
        naam.setLayoutY(14.0);
        naam.setPrefHeight(78.0);
        naam.setPrefWidth(584.0);
        naam.setText(leider.getFirst() + " " + leider.getLast());
        naam.setFont(new Font(53.0));

        snackLabel.setText("snacks : ");
        snackLabel.setLayoutX(31.0);
        snackLabel.setLayoutY(148.0);

        allSnacks.setLayoutX(148.0);
        allSnacks.setLayoutY(147.0);
        allSnacks.setPrefSize(336.0, 26.0);

        addSnackButton.setLayoutX(526.0);
        addSnackButton.setLayoutY(147.0);
        addSnackButton.setText("add");

        getOverviewButton.setLayoutX(276.0);
        getOverviewButton.setLayoutY(214.0);
        getOverviewButton.setText("Overview");

    }
}
