package fxbasics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;

public class SwitchScenes extends Application {

    Parent root;
    Stage stage;
    Scene scene;

    public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scene11.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scene22.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void start(Stage stage1) throws Exception {
        Parent root1 = FXMLLoader.load(getClass().getResource("scene11.fxml"));
        Scene scene1 = new Scene(root1);
        stage1.setScene(scene1);
        stage1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
