package kiesDeelnemers;

import databaseAcces.Leider;

import java.util.ArrayList;

public class KiesDeelnemersModel {
    public ArrayList<Deelnemer> deelnemers;
    public ArrayList<Listener> listeners;

    public KiesDeelnemersModel(ArrayList<Deelnemer> deelnemers){
        this.deelnemers = deelnemers;
        listeners = new ArrayList<>();
    }

    public void alertListeners(){
        for (Listener listener : listeners){
            listener.listen();
        }
    }

    public void registerListener(Listener listener){
        listeners.add(listener);
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

    public void setOnDeelnemen(Leider leider){
        for (Deelnemer deelnemer : this.deelnemers){
            if (deelnemer.getLeider() == leider){
                deelnemer.toggleNeemtDeel();
            }
        }
        alertListeners();
    }
}
