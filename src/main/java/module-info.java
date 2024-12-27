module org.labsupervisorinstructor.initfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens fxbasics to javafx.fxml;
    exports fxbasics;
    exports ConnectControllers;
    opens ConnectControllers to javafx.fxml;
}