package fxbasics;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceBoxes extends Application {


    @Override
    public void start(Stage stage) throws Exception {
      try{
          FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxbasics/ChoiceBoxes.fxml"));
          Parent root = loader.load();
          Scene scene = new Scene(root);
          stage.setScene(scene);
          stage.show();
      } catch (IOException e) {
          System.out.println(e);
      }



    }


}

