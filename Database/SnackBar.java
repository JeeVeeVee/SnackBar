package Database;

import java.util.ArrayList;

public class SnackBar {
    String naam;
    ArrayList<Snack> snacks;

    public SnackBar(String string) {
        naam = string;
    }

    public String getNaam() {
        return naam;
    }
}
