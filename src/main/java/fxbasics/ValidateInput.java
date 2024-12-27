package fxbasics;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ValidateInput extends Application {

    @FXML
    TextField input;
    @FXML
    Button button;
    @FXML
    Label message;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ValidateInput.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onClickOfButton() {
        try{
            Integer inp = Integer.parseInt(input.getText());

            if(inp>=18){
                message.setText("You are Now signed up");
            }else{
                message.setText("You have to at least 18 years old");
            }
        } catch (NumberFormatException e) {
            message.setText("You have to enter a number");
        }
       input.clear();
    }


}
