package ConnectControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ConnectControllersScene2 {
    @FXML
    Label label1;

    void displayName(String username){
        label1.setText("Welcome back "+username);
    }
}
