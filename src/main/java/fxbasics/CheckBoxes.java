package fxbasics;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CheckBoxes extends Application {
    @FXML
    CheckBox checkBox1;
    @FXML
    Label label1;
    @FXML
    ImageView imageView1;

    Image myimage1 = new Image(getClass().getResourceAsStream("/img.png"));
    Image myimage2 = new Image(getClass().getResourceAsStream("/img2.png"));
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CheckBoxes.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchImage(){
        if(checkBox1.isSelected()){
            imageView1.setImage(myimage2);
            label1.setText("Image2");
        }else{
            imageView1.setImage(myimage1);
            label1.setText("Image1");
        }
    }
}
