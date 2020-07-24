package databaseAcces;

public class Leider implements Comparable<Leider> {
    private String first;
    private String last;
    private String fullName;
    private double schuld;

    public Leider(String first, String last, double schuld) {
        this.first = first;
        this.last = last;
        fullName = getFirst() + " " + getLast();
        this.schuld = schuld;
    }

    public double getSchuld() {
        return schuld;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getFullName(){
        return fullName;
    }

    @Override
    public String toString() {
        return "Leider{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    @Override
    public int compareTo(Leider o) {
        if(o.getFullName() == this.getFullName()){
            return 0;
        } else {
            return 1;
        }
    }
}
