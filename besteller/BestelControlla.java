package besteller;

import Database.ConnectionProvider;
import Database.DatabaseCommunicator;
import Database.Leider;

import java.sql.Connection;
import java.util.ArrayList;

public class BestelControlla {

    private DatabaseCommunicator dbc;

    public BestelControlla(Connection c){
        dbc = new DatabaseCommunicator(c);
    }


    public void initialize(){
        ArrayList<Leider> allLeiders = dbc.getAllLeiders();
        for (Leider l : allLeiders){
            System.out.println(l.toString());
        }
    }
}
