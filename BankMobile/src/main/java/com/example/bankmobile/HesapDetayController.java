package com.example.bankmobile;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HesapDetayController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button geriButon;

    @FXML
    private Label bakiye;

    @FXML
    private Label bakiye1;

    @FXML
    private Label harcamaAdi;

    @FXML
    private Label harcamaAdi1;

    @FXML
    private Label harcamaAdi2;

    @FXML
    private Label harcamaTutar;

    @FXML
    private Label harcamaTutar1;

    @FXML
    private Label harcamaTutar2;

    @FXML
    private Label hesapAcılısTarihi;

    @FXML
    private Label hesapNo;

    @FXML
    private Label ibanBilgisi;

    @FXML
    private Label islemTarihi;

    @FXML
    private Label islemTarihi1;

    @FXML
    private Label islemTarihi2;

    @FXML
    private Label subeAdi;

    @FXML
    void handleOncekiSayfa(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-hesaplarim.fxml"));
            Pane anasayfaPane = loader.load();
            Scene anasayfaScene = new Scene(anasayfaPane);
            Stage stage = (Stage) geriButon.getScene().getWindow();
            stage.setScene(anasayfaScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void initialize() {
        assert bakiye != null : "fx:id=\"bakiye\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert bakiye1 != null : "fx:id=\"bakiye1\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert harcamaAdi != null : "fx:id=\"harcamaAdi\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert harcamaAdi1 != null : "fx:id=\"harcamaAdi1\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert harcamaAdi2 != null : "fx:id=\"harcamaAdi2\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert harcamaTutar != null : "fx:id=\"harcamaTutar\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert harcamaTutar1 != null : "fx:id=\"harcamaTutar1\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert harcamaTutar2 != null : "fx:id=\"harcamaTutar2\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert hesapAcılısTarihi != null : "fx:id=\"hesapAcılısTarihi\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert hesapNo != null : "fx:id=\"hesapNo\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert ibanBilgisi != null : "fx:id=\"ibanBilgisi\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert islemTarihi != null : "fx:id=\"islemTarihi\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert islemTarihi1 != null : "fx:id=\"islemTarihi1\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert islemTarihi2 != null : "fx:id=\"islemTarihi2\" was not injected: check your FXML file 'hesap-detay.fxml'.";
        assert subeAdi != null : "fx:id=\"subeAdi\" was not injected: check your FXML file 'hesap-detay.fxml'.";

    }



}
