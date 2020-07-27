package startup;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import kiesSnackBar.Kiezer;

public class StartUpController {
    public ImageView imageLeft;
    public ImageView imageRight;
    public Button bestelButton;


    public void initiate(){
        bestelButton.setOnAction(e -> {
            Kiezer kiezer = new Kiezer();
            try {
                kiezer.start((Stage) bestelButton.getScene().getWindow());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}
