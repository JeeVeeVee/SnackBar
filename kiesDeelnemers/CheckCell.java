package kiesDeelnemers;

import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;

public class CheckCell extends TableCell<Deelnemer, Boolean> implements Listener{

    private boolean neemtDeel;
    private Deelnemer deelnemer;
    private KiesDeelnemersModel model;

    public CheckCell(KiesDeelnemersModel model){
        CheckButton button = new CheckButton(model, getDeelnemer());
        super.getChildren().add(button);
        super.setGraphic(button);
        this.model = model;
    }

    public Deelnemer getDeelnemer(){
        return super.getTableRow().getItem();
    }

    @Override
    public void listen() {

    }
}
