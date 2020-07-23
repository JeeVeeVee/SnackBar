package kiesDeelnemers;

import databaseAcces.Leider;

public class Deelnemer {
    private Leider leider;
    private boolean neemtDeel;

    public Deelnemer(Leider leider){
        this.leider = leider;
    }

    public Leider getLeider() {
        return leider;
    }

    public boolean neemtDeel() {
        return neemtDeel;
    }
}
