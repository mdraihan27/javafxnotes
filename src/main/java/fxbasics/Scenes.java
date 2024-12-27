package fxbasics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Scenes extends Application {
    //A scene is a drawing surface for graphical content and a container for nodes

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene =  new Scene(root,600,600, Color.LIGHTBLUE);
        stage = new Stage();

        //adding text in our scene
        Text text = new Text();
        text.setText("RAIHAN");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill((Color.LIGHTGRAY));

        //adding line and ccahnging its properties
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);

        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        //recctangles

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setFill(Color.ALICEBLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);

        //triangles

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(200.0,200.0, 300.0,300.0, 200.0,300.0);
        triangle.setFill(Color.YELLOW);

        //Circles

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.LIGHTGRAY);

        //add image in scene
        Image image = new Image(getClass().getResource("/img.png").toExternalForm());
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);


        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);


        stage.setScene(scene);
        stage.show();
    }

}
