package fxbasics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class ProgressBars extends Application {
    @FXML
    ProgressBar progressBar1;
    @FXML
    Label label1;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProgressBars.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void increase(ActionEvent event) {
        double prog=progressBar1.getProgress();
        if(prog<=0.99999999){
            progressBar1.setProgress(prog+0.1);
            label1.setText(Math.round(progressBar1.getProgress()*100)+"%");

        }
    }
}
