package fxbasics;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Stages extends Application{
    //stage is top level container to hold our fx gui application, basically our window
    //similar to jframe in swing

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
//        Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.BEIGE);

        Image icon = new Image(getClass().getResource("/img.png").toExternalForm());
        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);

        stage.setX(50);
        stage.setY(50);
        //stages initial position will be 50,50 coordinate of screen

        stage.setFullScreen(true);
        //stage is initialized as full screen

        stage.setFullScreenExitHint("YOU CANT ESCAPE, PRESS Q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        //set full screen exit hint and exit key

        stage.setScene(scene);
        stage.show();
    }
}
