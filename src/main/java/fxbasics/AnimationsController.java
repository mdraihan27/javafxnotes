package fxbasics;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Arc;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class AnimationsController implements Initializable {
    @FXML
    Arc arc1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //translate
//        TranslateTransition translate = new TranslateTransition();
//        translate.setNode(arc1);
//        translate.setDuration(Duration.millis(2000));
//        translate.setByX(250);
//        translate.setByY(-250);
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setAutoReverse(true);
//        translate.play();

      //  rotate
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(arc1);
        rotate.setDuration(Duration.millis(100));
        rotate.setByAngle(360);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setAxis(Rotate.X_AXIS);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.play();

        //fade

//        FadeTransition fade = new FadeTransition();
//        fade.setNode(arc1);
//        fade.setDuration(Duration.millis(1000));
//        fade.setInterpolator(Interpolator.LINEAR);
//        fade.setCycleCount(RotateTransition.INDEFINITE);
//        fade.setFromValue(1);
//        fade.setToValue(0);
//        fade.play();

        //scale

//        ScaleTransition scale = new ScaleTransition();
//        scale.setNode(arc1);
//        scale.setDuration(Duration.millis(100));
//        scale.setInterpolator(Interpolator.LINEAR);
//        scale.setAutoReverse(true);
//        scale.setByX(2.0);
//        scale.setByY(2.0);
//        scale.setCycleCount(RotateTransition.INDEFINITE);
//        scale.play();


    }
}
