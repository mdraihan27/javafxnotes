package fxbasics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class SceneBuilder extends Application {
    @FXML
    private Circle myCircle1;
    @FXML
    private Circle myCircle2;
    @FXML
    private Circle myCircle3;
    @FXML
    private Circle myCircle4;
    @FXML
    private Circle myCircle5;
    @FXML
    private Arc myArc;

    private double x;
    private double y;



    public static void main(String[] args) {
        launch(args);

    }

    public void up (ActionEvent ae){
        System.out.println("UP");
        myArc.setCenterY(y-=5);
        eatCircle();

        System.out.println(myArc.getCenterX()+" "+myArc.getCenterY());
        System.out.println(myCircle1.getCenterX()+" "+myCircle1.getCenterY());
        System.out.println(myCircle2.getCenterX()+" "+myCircle2.getCenterY());
        System.out.println(myCircle3.getCenterX()+" "+myCircle3.getCenterY());
        System.out.println(myCircle4.getCenterX()+" "+myCircle4.getCenterY());
        System.out.println(myCircle5.getCenterX()+" "+myCircle5.getCenterY());



    }

    public void down (ActionEvent ae){
        System.out.println("DOWN");
        myArc.setCenterY(y+=5);
        eatCircle();

    }

    public void left (ActionEvent ae){
        System.out.println("LEFT");
        myArc.setCenterX(x-=5);
        eatCircle();

    }


    public void right (ActionEvent ae){
        System.out.println("RIGHT");
        myArc.setCenterX(x+=5);
        eatCircle();

    }

    public void eatCircle(){
        if(Math.abs(myArc.getCenterX()-myCircle1.getCenterX())<=5 &&
                Math.abs(myArc.getCenterY()-myCircle1.getCenterY())<=5){
            myCircle1.setVisible(false);

        }

        if(Math.abs(myArc.getCenterX()-myCircle2.getCenterX())<=5 &&
                Math.abs(myArc.getCenterY()-myCircle2.getCenterY())<=5){
            myCircle2.setVisible(false);
        }

        if(Math.abs(myArc.getCenterX()-myCircle3.getCenterX())<=5 &&
                Math.abs(myArc.getCenterY()-myCircle3.getCenterY())<=5){
            myCircle3.setVisible(false);
        }

        if(Math.abs(myArc.getCenterX()-myCircle4.getCenterX())<=5 &&
                Math.abs(myArc.getCenterY()-myCircle4.getCenterY())<=5){
            myCircle4.setVisible(false);
        }

        if(Math.abs(myArc.getCenterX()-myCircle5.getCenterX())<=5 &&
                Math.abs(myArc.getCenterY()-myCircle5.getCenterY())<=5){
            myCircle5.setVisible(false);
        }
    }


    @Override
    public void start(Stage stage) throws Exception {



        Parent root = FXMLLoader.load(getClass().getResource("/fxbasics/sceneBuilder.fxml"));
//        myArc.setCenterX(100);
//        myArc.setCenterY(100);
//
//        myCircle1.setCenterX(143);
//        myCircle1.setCenterY(143);
//
//        myCircle2.setCenterX(213);
//        myCircle2.setCenterY(153);
//
//        myCircle3.setCenterX(243);
//        myCircle3.setCenterY(43);
//
//        myCircle4.setCenterX(43);
//        myCircle4.setCenterY(214);
//
//        myCircle5.setCenterX(183);
//        myCircle5.setCenterY(333);
//
        stage.setTitle("Hello world");
        stage.setScene(new Scene(root));
        stage.show();

    }



}
