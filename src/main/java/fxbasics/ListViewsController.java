package fxbasics;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListViewsController implements Initializable {
    @FXML
    ListView<String> listView1;
    @FXML
    Label label1;

    ArrayList<String> list1 = new ArrayList<String>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        list1.add("Hello");
        list1.add("World");
        list1.add("Hellos");
        listView1.getItems().setAll(list1);

        listView1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                String currentFood = listView1.getSelectionModel().getSelectedItem();
                label1.setText(currentFood);
            }
        });
    }
}
