package fxbasics;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorPickers extends Application {
    @FXML
    AnchorPane pane1;
    @FXML
    ColorPicker colorPicker1;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ColorPickers.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void changeBG(){
        Color myColor = colorPicker1.getValue();
        pane1.setBackground(new Background(new BackgroundFill(myColor, null, null)));
    }
}
