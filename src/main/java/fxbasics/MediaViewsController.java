package fxbasics;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MediaViewsController implements Initializable {
    @FXML
    MediaView mediaView;

    File file;
    Media media;
    MediaPlayer mediaPlayer;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file = new File("C:\\Users\\mdhos\\IdeaProjects\\JAVAFX BROCODE practice & notes\\initFX\\src\\main\\resources\\video.mp4");
        try{
            media = new Media(file.toURI().toString());

        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void playMedia(){
        mediaPlayer.play();
    }

    public void pauseMedia(){
        mediaPlayer.pause();
    }

    public void resetMedia(){
        mediaPlayer.seek(Duration.millis(0000));
    }
}
