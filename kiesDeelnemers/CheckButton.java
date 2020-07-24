package kiesDeelnemers;

import javafx.scene.control.Button;

public class CheckButton extends Button implements Listener {

    private KiesDeelnemersModel model;

    public CheckButton(KiesDeelnemersModel model, Deelnemer deelnemer){
        this.model = model;
    }

    public CheckButton(){

    }

    @Override
    public void listen() {

    }
}
