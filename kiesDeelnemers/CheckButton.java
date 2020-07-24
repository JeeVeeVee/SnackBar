package kiesDeelnemers;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CheckButton extends Button implements Listener {

    private KiesDeelnemersModel model;
    private ImageView checkView;

    public CheckButton(KiesDeelnemersModel model, Deelnemer deelnemer){
        this.model = model;
        checkView = new ImageView();
        super.getChildren().add(checkView);
        super.setGraphic(checkView);
        super.setOnAction(e -> {
            CheckCell parent = (CheckCell) super.getParent();
            System.out.println(parent.getDeelnemer().getLeider().toString());
        });
    }

    public CheckButton(){

    }

    @Override
    public void listen() {

    }
}
