package databaseAcces;

public class Snack {
    private String naam;
    private String snackBar;
    private double prijs;

    public Snack(String naam, String snackBar, double prijs){
        this.naam = naam;
        this.snackBar = snackBar;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getSnackBar() {
        return snackBar;
    }
}
