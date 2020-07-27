package kiesDeelnemers;

import databaseAcces.Leider;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class CheckButton extends Button implements Listener {

    private KiesDeelnemersModel model;
    private ImageView checkView;

    public CheckButton(KiesDeelnemersModel model){
        this.model = model;
        model.registerListener(this);
        checkView = new ImageView();
        super.getChildren().add(checkView);
        super.setGraphic(checkView);
        super.setOnAction(e -> {

            for (Leider leider : model.getLeiders()){
                if (leider == getDeelnemer().getLeider()){
                    System.out.println(leider);
                    model.setOnDeelnemen(leider);
                }
            }
        });
    }

    public Deelnemer getDeelnemer(){
        CheckCell parent = (CheckCell) super.getParent();
        return parent.getDeelnemer();
    }

    @Override
    public void listen() {
        for(Leider leider : model.getDeelnemendeLeiders()){
            if (getDeelnemer().getLeider().compareTo(leider) == 0){
                super.setText("in");
            }
        }
    }
}
