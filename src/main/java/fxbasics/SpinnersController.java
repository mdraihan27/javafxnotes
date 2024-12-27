package fxbasics;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class SpinnersController implements Initializable {
    @FXML
    Spinner<Integer> spinner1;
    @FXML
    Label label1;

    int currentValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000);
        valueFactory.setValue(0);
        spinner1.setValueFactory(valueFactory);

        currentValue = spinner1.getValue();
        label1.setText(String.valueOf(currentValue));

        spinner1.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                currentValue = spinner1.getValue();
                label1.setText(String.valueOf(currentValue));

            }
        });



    }
}
