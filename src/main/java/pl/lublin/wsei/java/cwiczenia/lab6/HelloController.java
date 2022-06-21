package pl.lublin.wsei.java.cwiczenia.lab6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class HelloController {
    @FXML
    private Label welcomeText;

    public ListView listNoblista;
    ObservableList<String>  nazwa = FXCollections.observableArrayList();
    GusInfoGraphicList nobList;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}