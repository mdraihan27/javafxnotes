package fxbasics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickers extends Application {
    @FXML
    DatePicker datePicker1;
    @FXML
    Label label1;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("DatePickers.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void getDate(ActionEvent event) {
        LocalDate localDate = datePicker1.getValue();
        String myFormat = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        label1.setText(myFormat);
    }
}
