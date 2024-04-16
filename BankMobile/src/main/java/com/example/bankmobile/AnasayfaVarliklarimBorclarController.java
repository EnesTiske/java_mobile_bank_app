package com.example.bankmobile;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AnasayfaVarliklarimBorclarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox anaSayfaIcon;

    @FXML
    private Label borclarLabel;

    @FXML
    private VBox hesapKartIcon;

    @FXML
    private VBox islemlerIcon;

    @FXML
    private Label krediKartiBorcu;

    @FXML
    private Label netBorc;

    @FXML
    private Label toplamBorc;

    @FXML
    private Label varliklarLabel;

    @FXML
    private VBox varliklarimIcon;

    @FXML
    void handleAnaSayfaIconClicked(MouseEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-hesaplarim.fxml"));
            Pane anasayfaPane = loader.load();
            Scene anasayfaScene = new Scene(anasayfaPane);
            Stage stage = (Stage) anaSayfaIcon.getScene().getWindow();
            stage.setScene(anasayfaScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleHesapKartIconClicked(MouseEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-hesapkart.fxml"));
            Pane anasayfaPane = loader.load();
            Scene anasayfaScene = new Scene(anasayfaPane);
            Stage stage = (Stage) hesapKartIcon.getScene().getWindow();
            stage.setScene(anasayfaScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleIslemlerIconClicked(MouseEvent event) {
/*        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-.fxml"));
            Pane anasayfaPane = loader.load();
            Scene anasayfaScene = new Scene(anasayfaPane);
            Stage stage = (Stage) islemlerIcon.getScene().getWindow();
            stage.setScene(anasayfaScene);

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    @FXML
    void handleVarliklarimIconClicked(MouseEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-varliklarim-varliklar.fxml"));
            Pane anasayfaPane = loader.load();
            Scene anasayfaScene = new Scene(anasayfaPane);
            Stage stage = (Stage) varliklarimIcon.getScene().getWindow();
            stage.setScene(anasayfaScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleBorclarClicked(MouseEvent event) {

    }


    @FXML
    void handleVarliklarClicked(MouseEvent event) {

    }


    @FXML
    void initialize() {
        assert anaSayfaIcon != null : "fx:id=\"anaSayfaIcon\" was not injected: check your FXML file 'anasayfa-varliklarim-borclar.fxml'.";
        assert borclarLabel != null : "fx:id=\"borclarLabel\" was not injected: check your FXML file 'anasayfa-varliklarim-borclar.fxml'.";
        assert hesapKartIcon != null : "fx:id=\"hesapKartIcon\" was not injected: check your FXML file 'anasayfa-varliklarim-borclar.fxml'.";
        assert islemlerIcon != null : "fx:id=\"islemlerIcon\" was not injected: check your FXML file 'anasayfa-varliklarim-borclar.fxml'.";
        assert krediKartiBorcu != null : "fx:id=\"krediKartiBorcu\" was not injected: check your FXML file 'anasayfa-varliklarim-borclar.fxml'.";
        assert netBorc != null : "fx:id=\"netBorc\" was not injected: check your FXML file 'anasayfa-varliklarim-borclar.fxml'.";
        assert toplamBorc != null : "fx:id=\"toplamBorc\" was not injected: check your FXML file 'anasayfa-varliklarim-borclar.fxml'.";
        assert varliklarLabel != null : "fx:id=\"varliklarLabel\" was not injected: check your FXML file 'anasayfa-varliklarim-borclar.fxml'.";
        assert varliklarimIcon != null : "fx:id=\"varliklarimIcon\" was not injected: check your FXML file 'anasayfa-varliklarim-borclar.fxml'.";

    }

}
