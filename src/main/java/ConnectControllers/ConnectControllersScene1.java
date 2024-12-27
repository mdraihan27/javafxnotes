package ConnectControllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;

public class ConnectControllersScene1 extends Application {

    protected Parent root;
    @FXML
    TextField txtfld;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("ConnectControllersScene1.fxml"));
        Scene scene = new Scene(root1);
        stage.setScene(scene);
        stage.show();
    }

    public void login(ActionEvent event) throws IOException {
        String username = txtfld.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ConnectControllersScene2.fxml"));
        Parent root2 = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root2);
        stage.setScene(scene);
        stage.show();

        ConnectControllersScene2 connectControllersScene2 = loader.getController();
        connectControllersScene2.displayName(username);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
