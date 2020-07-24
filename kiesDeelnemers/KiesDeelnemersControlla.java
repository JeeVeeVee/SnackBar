package kiesDeelnemers;

import databaseAcces.ConnectionProvider;
import databaseAcces.DatabaseCommunicator;
import databaseAcces.Leider;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.util.ArrayList;

public class  KiesDeelnemersControlla {
    public TableColumn<Deelnemer, Boolean> check;
    public TableColumn<Deelnemer, String> deelnemer;
    public TableView<Deelnemer> tabel;

    private DatabaseCommunicator databaseCommunicator;
    private ArrayList<Leider> leiders;

    public KiesDeelnemersControlla(){
        ConnectionProvider cp = new ConnectionProvider();
        databaseCommunicator = new DatabaseCommunicator(cp.getConnection());
        leiders = databaseCommunicator.getAllLeiders();
    }

    public void initialize(){
        ObservableList<Deelnemer> model = FXCollections.observableArrayList();
        for (Leider leider : leiders){
            model.add(new Deelnemer(leider));
        }
        tabel.setItems(model);
        deelnemer.setCellValueFactory(deelnemer -> new ReadOnlyStringWrapper(deelnemer.getValue().getLeider().getFullName()));
        check.setCellValueFactory(deelnemer -> new ReadOnlyBooleanWrapper(deelnemer.getValue().neemtDeel()));
        check.setCellFactory(column -> {
            TableCell output = new CheckBoxTableCell<>();
            output.setEditable(true);
            return output;
        });
        check.setEditable(true);
    }
}
