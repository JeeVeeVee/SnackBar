package kiesDeelnemers;

import databaseAcces.Leider;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;

public class CheckCell extends TableCell<Deelnemer, Boolean> implements Listener{

    private boolean neemtDeel;
    private Deelnemer deelnemer;
    private KiesDeelnemersModel model;

    public CheckCell(KiesDeelnemersModel model){
        CheckButton button = new CheckButton(model, new Deelnemer(new Leider("Jules", "Vervaeke", 0.1)));
        super.getChildren().add(button);
        super.setGraphic(button);
        this.model = model;
    }

    public Deelnemer getDeelnemer() {
        if (super.getTableRow().getItem() != null){
            return super.getTableRow().getItem();
        } else {
            return new Deelnemer(new Leider("Jules", "Vervaeke", 0.1));
        }
    }

    @Override
    public void listen() {

    }
}
