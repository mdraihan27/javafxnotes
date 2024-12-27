package fxbasics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class RadioButtons extends Application {
    @FXML
    RadioButton radio1;
    @FXML
    RadioButton radio2;
    @FXML
    RadioButton radio3;
    @FXML
    Label label1;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("RadioButtons.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void buttonPress(ActionEvent event) {

            if(radio1.isSelected()) {
                label1.setText("Pizza");
            }else if(radio2.isSelected()) {
                label1.setText("Pasta");
            }else if(radio3.isSelected()) {
                label1.setText(radio3.getText());
            }

    }
}
