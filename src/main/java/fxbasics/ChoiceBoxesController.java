package fxbasics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class ChoiceBoxesController implements Initializable {

    @FXML
    Label label1;
    @FXML
    ChoiceBox<String> choiceBox1;

    private String[] food = {"pizza", "sushi", "ramen"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox1.getItems().addAll(food);
        choiceBox1.setOnAction(this::getFood);
    }

    public void getFood(ActionEvent event) {
        String foodName = choiceBox1.getValue();
        label1.setText(foodName);
    }
}
