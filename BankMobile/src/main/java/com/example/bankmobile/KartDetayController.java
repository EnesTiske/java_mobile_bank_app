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

public class KartDetayController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button geriButon;

    @FXML
    private Label kalanBorc;

    @FXML
    private Label kartAdi;

    @FXML
    private Label kartEkstreKesimTarihi;

    @FXML
    private Label kartNo;

    @FXML
    private Label kartSahibiIsim;

    @FXML
    private Label kartSonOdemeTarihi;

    @FXML
    private Label kartToplamHarcama;

    @FXML
    private Label kartToplamLimit;

    @FXML
    private Label kullanabilirLimit;

    @FXML
    void handleOncekiSayfa(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-kartlarim.fxml"));
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
        assert geriButon != null : "fx:id=\"geriButon\" was not injected: check your FXML file 'kart-detay.fxml'.";
        assert kalanBorc != null : "fx:id=\"kalanBorc\" was not injected: check your FXML file 'kart-detay.fxml'.";
        assert kartAdi != null : "fx:id=\"kartAdi\" was not injected: check your FXML file 'kart-detay.fxml'.";
        assert kartEkstreKesimTarihi != null : "fx:id=\"kartEkstreKesimTarihi\" was not injected: check your FXML file 'kart-detay.fxml'.";
        assert kartNo != null : "fx:id=\"kartNo\" was not injected: check your FXML file 'kart-detay.fxml'.";
        assert kartSahibiIsim != null : "fx:id=\"kartSahibiIsim\" was not injected: check your FXML file 'kart-detay.fxml'.";
        assert kartSonOdemeTarihi != null : "fx:id=\"kartSonOdemeTarihi\" was not injected: check your FXML file 'kart-detay.fxml'.";
        assert kartToplamHarcama != null : "fx:id=\"kartToplamHarcama\" was not injected: check your FXML file 'kart-detay.fxml'.";
        assert kartToplamLimit != null : "fx:id=\"kartToplamLimit\" was not injected: check your FXML file 'kart-detay.fxml'.";
        assert kullanabilirLimit != null : "fx:id=\"kullanabilirLimit\" was not injected: check your FXML file 'kart-detay.fxml'.";

    }

}
