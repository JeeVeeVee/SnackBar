package databaseAcces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseCommunicator {
    protected Connection connection;

    public DatabaseCommunicator(Connection connection) {
        this.connection = connection;
    }


    /*
    deze functie haalt alle snacks van de database van 1 bepaalde snackbar en geeft ze terug in een arraylist.
    */
    public ArrayList<Snack> getSnacksFromSnackBar(SnackBar snackBar) {
        ArrayList<Snack> output = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM snack WHERE snackbar = ?");
            ps.setString(1, snackBar.getNaam());
            ResultSet set = ps.executeQuery();
            while (set.next()) {
                Snack freshSnack = new Snack(set.getString(1),
                        set.getString(2),
                        set.getDouble(3));
                output.add(freshSnack);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }

    /*
    deze functie haalt alle snackbars af van de database
    */
    public ArrayList<SnackBar> getAllBars() {
        ArrayList<SnackBar> output = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM snackbar");
            ResultSet set = ps.executeQuery();
            while (set.next()) {
                SnackBar bar = new SnackBar(set.getString(1));
                output.add(bar);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }

    /*
    * Fetches all leiding from the database
    */
    public ArrayList<Leider> getAllLeiders(){
        ArrayList<Leider> output = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM leiding");
            ResultSet set = ps.executeQuery();
            while (set.next()) {
                Leider verscheLeider = new Leider(set.getString(1), set.getString(2), set.getDouble(3));
                output.add(verscheLeider);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }

    public void addNewSnackBar(SnackBar snackBar){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO snackbar(naam) VALUES ('?')");
            ps.setString(1, snackBar.getNaam());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addNewSnackToSnackBar(Snack newSnack, SnackBar bar) throws Exception {
        if(! this.getAllBars().contains(bar)){
            throw new Exception("deze snackbar bestaat nog niet, voeg deze eerst toe");
        } else{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO snack(naam, snackbar, prijs) VALUES ('?','?', '?' )\"");
            ps.setString(1, newSnack.getNaam());
            ps.setString(2, bar.getNaam());
            ps.setString(3, String.valueOf(newSnack.getPrijs()));

        }
    }
}
