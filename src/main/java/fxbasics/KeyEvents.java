package fxbasics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class KeyEvents extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("KeyEvents.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if(event.getCode() == KeyCode.UP) {
                System.out.println("MOVING UP");
            }else if(event.getCode() == KeyCode.DOWN) {
                System.out.println("MOVING DOWN");
            }else if(event.getCode() == KeyCode.LEFT) {
                System.out.println("MOVING LEFT");
            }else if(event.getCode() == KeyCode.RIGHT) {
                System.out.println("MOVING RIGHT");
            }
        });
    }
}
