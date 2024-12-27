package fxbasics;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ImageViews extends Application {
    //ImageView is a Node used for painting images loaded with images
    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("/img.png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("/img2.png"));

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ImageViews.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void displayImage(){
        myImageView.setImage(myImage2);
    }
}
