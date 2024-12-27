package fxbasics;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.net.URL;
import java.util.ResourceBundle;

public class TreeViewsController implements Initializable {
    @FXML
    TreeView<String> treeView1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> root = new TreeItem<String>("This PC");
        treeView1.setRoot(root);

        TreeItem<String> fChild1 = new TreeItem<String>("New Volume C");
        TreeItem<String> fChild2 = new TreeItem<String>("New Volume D");
        TreeItem<String> fChild3 = new TreeItem<String>("New Volume E");

        root.getChildren().addAll(fChild1, fChild2, fChild3);

        TreeItem<String> sChild1 = new TreeItem<String>("Pictures1");
        TreeItem<String> sChild2 = new TreeItem<String>("Pictures2");
        TreeItem<String> sChild3 = new TreeItem<String>("Pictures3");

        fChild1.getChildren().addAll(sChild1, sChild2, sChild3);

        TreeItem<String> sChild4 = new TreeItem<String>("Pictures4");
        TreeItem<String> sChild5 = new TreeItem<String>("Pictures5");
        TreeItem<String> sChild6 = new TreeItem<String>("Pictures6");

        fChild2.getChildren().addAll(sChild4, sChild5, sChild6);

        TreeItem<String> sChild7 = new TreeItem<String>("Pictures7");
        TreeItem<String> sChild8 = new TreeItem<String>("Pictures8");
        TreeItem<String> sChild9 = new TreeItem<String>("Pictures9");

        fChild3.getChildren().addAll(sChild7, sChild8, sChild9);


    }

    public void getItem(){
        TreeItem<String> item = treeView1.getSelectionModel().getSelectedItem();
        if(item != null)
            System.out.println(item);
    }
}
