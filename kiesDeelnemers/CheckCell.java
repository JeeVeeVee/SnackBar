package kiesDeelnemers;

import databaseAcces.Leider;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;

public class CheckCell extends TableCell<Deelnemer, Boolean> {

    private boolean neemtDeel;
    private Deelnemer deelnemer;



    public CheckCell(){
        CheckBox checkBox = new CheckBox();
        super.getChildren().add(checkBox);
        super.setGraphic(checkBox);
        //deelnemer = super.getTableRow().getItem();
    }
}
