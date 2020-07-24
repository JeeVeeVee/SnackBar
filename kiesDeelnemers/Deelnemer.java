package kiesDeelnemers;

import databaseAcces.Leider;

public class Deelnemer implements Comparable<Deelnemer>{
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

    public void toggleNeemtDeel(){
        this.neemtDeel = ! neemtDeel;
    }

    @Override
    public int compareTo(Deelnemer o) {
        Leider oLeider = o.getLeider();
        return this.getLeider().compareTo(oLeider);
    }
}
