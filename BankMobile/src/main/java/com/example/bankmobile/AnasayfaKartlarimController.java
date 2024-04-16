package com.example.bankmobile;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AnasayfaKartlarimController {

    @FXML
    private VBox anaSayfaIcon;

    @FXML
    private VBox hesapKartIcon;

    @FXML
    private VBox islemlerIcon;

    @FXML
    private VBox varliklarimIcon;

    @FXML
    private Button borcOdeButon;

    @FXML
    private Button ekstreButon;

    @FXML
    private Label hesaplarimlabel;

    @FXML
    private VBox kartBilgileriBox;

    @FXML
    private Label kartlarimSonHareketlerTumunuGor;

    @FXML
    private Label kartlarimlabel;

    @FXML
    private Button nakitAvansButon;

    @FXML
    private Label sonIslem1Kart;

    @FXML
    private Label sonIslem2Kart;

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
    void handleBorcOdeClicked(MouseEvent event) {

    }

    @FXML
    void handleEkstreClicked(MouseEvent event) {

    }

    @FXML
    void handleHesaplarimClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-hesaplarim.fxml"));
            Pane kartlarimPane = loader.load();
            Scene kartlarimScene = new Scene(kartlarimPane);

            Stage stage = (Stage) hesaplarimlabel.getScene().getWindow();
            stage.setScene(kartlarimScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleKartBilgileriClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("kart-detay.fxml"));
            Pane kartlarimPane = loader.load();
            Scene kartlarimScene = new Scene(kartlarimPane);

            Stage stage = (Stage) kartBilgileriBox.getScene().getWindow();
            stage.setScene(kartlarimScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleKartlarimClicked(MouseEvent event) {

    }

    @FXML
    void handleNakitAvansClicked(MouseEvent event) {

    }

    @FXML
    void handleTumGorClicked(MouseEvent event) {

    }

}
