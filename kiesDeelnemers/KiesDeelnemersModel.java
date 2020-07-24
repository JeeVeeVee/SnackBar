package kiesDeelnemers;

import databaseAcces.Leider;

import java.util.ArrayList;

public class KiesDeelnemersModel {
    public ArrayList<Deelnemer> deelnemers;
    public ArrayList<Listener> listeners;

    public void alertListeners(){
        for (Listener listener : listeners){
            listener.listen();
        }
    }

    public ArrayList<Leider> getLeiders(){
        ArrayList<Leider> output = new ArrayList<>();
        deelnemers.forEach(deelnemer -> {
            output.add(deelnemer.getLeider());
        });
        return output;
    }

    public ArrayList<Leider> getDeelnemendeLeiders(){
        ArrayList<Leider> output = new ArrayList<>();
        deelnemers.forEach(deelnemer -> {
            if (deelnemer.neemtDeel()) {
                output.add(deelnemer.getLeider());
            }
        });
        return output;
    }
}
