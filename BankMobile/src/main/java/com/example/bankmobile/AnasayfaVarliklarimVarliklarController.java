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

public class AnasayfaVarliklarimVarliklarController {

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
    private Label toplamVarlik;

    @FXML
    private Label vadeliVarlik1;

    @FXML
    private Label vadesizVarlik;

    @FXML
    private Label vadesizVarlik3;

    @FXML
    private Label varliklarLabel;

    @FXML
    private VBox varliklarimIcon;


    @FXML
    void handleAnaSayfaIconClicked(MouseEvent event) {

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
    void handleNetVarlikClicked(MouseEvent event) {

    }

    @FXML
    void handleToplamVarlikClicked(MouseEvent event) {

    }

    @FXML
    void handleVadeliVarlikClicked(MouseEvent event) {

    }

    @FXML
    void handleVadesizVarlikClicked(MouseEvent event) {

    }

    @FXML
    void handleVarliklarClicked(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert anaSayfaIcon != null : "fx:id=\"anaSayfaIcon\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";
        assert borclarLabel != null : "fx:id=\"borclarLabel\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";
        assert hesapKartIcon != null : "fx:id=\"hesapKartIcon\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";
        assert islemlerIcon != null : "fx:id=\"islemlerIcon\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";
        assert toplamVarlik != null : "fx:id=\"toplamVarlik\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";
        assert vadeliVarlik1 != null : "fx:id=\"vadeliVarlik1\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";
        assert vadesizVarlik != null : "fx:id=\"vadesizVarlik\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";
        assert vadesizVarlik3 != null : "fx:id=\"vadesizVarlik3\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";
        assert varliklarLabel != null : "fx:id=\"varliklarLabel\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";
        assert varliklarimIcon != null : "fx:id=\"varliklarimIcon\" was not injected: check your FXML file 'anasayfa-varliklarim-varliklar.fxml'.";

    }

}
