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

public class AnasayfaHesapKartController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label bankaKartlari;

    @FXML
    private VBox anaSayfaIcon;

    @FXML
    private VBox hesapKartIcon;

    @FXML
    private VBox islemlerIcon;

    @FXML
    private VBox varliklarimIcon;

    @FXML
    private Label krediKartları;

    @FXML
    private Label kredilerim;

    @FXML
    private Label sanalKartlar;

    @FXML
    private Label vadeliHesap;

    @FXML
    private Label vadesizHesap;

    @FXML
    void handleBankaKartlariClicked(MouseEvent event) {

    }

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
    void handleKrediKartlarıClicked(MouseEvent event) {

    }

    @FXML
    void handleKredilerimClicked(MouseEvent event) {

    }

    @FXML
    void handleSanalKartlarClicked(MouseEvent event) {

    }

    @FXML
    void handleVadeliHesapClicked(MouseEvent event) {

    }

    @FXML
    void handleVadesizHesapClicked(MouseEvent event) {

    }



    @FXML
    void initialize() {
        assert anaSayfaIcon != null : "fx:id=\"anaSayfaIcon\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";
        assert bankaKartlari != null : "fx:id=\"bankaKartlari\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";
        assert hesapKartIcon != null : "fx:id=\"hesapKartIcon\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";
        assert islemlerIcon != null : "fx:id=\"islemlerIcon\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";
        assert krediKartları != null : "fx:id=\"krediKartları\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";
        assert kredilerim != null : "fx:id=\"kredilerim\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";
        assert sanalKartlar != null : "fx:id=\"sanalKartlar\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";
        assert vadeliHesap != null : "fx:id=\"vadeliHesap\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";
        assert vadesizHesap != null : "fx:id=\"vadesizHesap\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";
        assert varliklarimIcon != null : "fx:id=\"varliklarimIcon\" was not injected: check your FXML file 'anasayfa-hesapkart.fxml'.";

    }

}
