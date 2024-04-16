package com.example.bankmobile;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AnasayfaHesaplarimController {

    private int gizlemeSayaci = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
//---

    @FXML
    private VBox anaSayfaIcon;

    @FXML
    private VBox hesapKartIcon;

    @FXML
    private VBox islemlerIcon;

    @FXML
    private VBox varliklarimIcon;


    @FXML
    private Button atmdenParaCek;

    @FXML
    private Label bakiye;

    @FXML
    private Button bakiyeGizleButon;

    @FXML
    private Button faturaOde;

    @FXML
    private HBox hesapBilgileriBox;

    @FXML
    private Label hesaplarimLabel;

    @FXML
    private Label hesaplarimSonHareketlerTumunuGor;

    @FXML
    private Label kartlarimLabel;

    @FXML
    private Button paraTransfer;

    @FXML
    private Label sonIslem1;

    @FXML
    private Label sonIslem2;

    @FXML
    private Label subeAdi;

    @FXML
    private Label subeNo;


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
    void handleHesaplarimClicked(MouseEvent event) {

    }

    @FXML
    void handleKartlarimClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-kartlarim.fxml"));
            Pane kartlarimPane = loader.load();
            Scene kartlarimScene = new Scene(kartlarimPane);

            Stage stage = (Stage) kartlarimLabel.getScene().getWindow();
            stage.setScene(kartlarimScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleBakiyeGizleClicked(MouseEvent event) {
        gizlemeSayaci++;
        if (gizlemeSayaci % 2 == 1) {
            bakiye.setText("     ****** TL");
        } else {
            bakiye.setText("     12345 TL");
        }
    }

    @FXML
    void handleTumGorClicked(MouseEvent event) {

    }

    @FXML
    void handleHesapBilgileriClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hesap-detay.fxml"));
            Pane kartlarimPane = loader.load();
            Scene kartlarimScene = new Scene(kartlarimPane);

            Stage stage = (Stage) hesapBilgileriBox.getScene().getWindow();
            stage.setScene(kartlarimScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {

    }

}
