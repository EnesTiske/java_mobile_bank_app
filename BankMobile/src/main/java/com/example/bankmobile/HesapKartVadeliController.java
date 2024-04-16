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

public class HesapKartVadeliController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label bakiye11;

    @FXML
    private Label bakiye12;

    @FXML
    private Label bakiye21;

    @FXML
    private Label bakiye22;

    @FXML
    private Button geriButon;

    @FXML
    private Label hesapNo;

    @FXML
    private Label hesapNo2;

    @FXML
    private Label subeAdi;

    @FXML
    private Label subeAdi2;

    @FXML
    void handleOncekiSayfa(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-hesapakrt.fxml"));
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
        assert bakiye11 != null : "fx:id=\"bakiye11\" was not injected: check your FXML file 'hesapkart-vadeli.fxml'.";
        assert bakiye12 != null : "fx:id=\"bakiye12\" was not injected: check your FXML file 'hesapkart-vadeli.fxml'.";
        assert bakiye21 != null : "fx:id=\"bakiye21\" was not injected: check your FXML file 'hesapkart-vadeli.fxml'.";
        assert bakiye22 != null : "fx:id=\"bakiye22\" was not injected: check your FXML file 'hesapkart-vadeli.fxml'.";
        assert geriButon != null : "fx:id=\"geriButon\" was not injected: check your FXML file 'hesapkart-vadeli.fxml'.";
        assert hesapNo != null : "fx:id=\"hesapNo\" was not injected: check your FXML file 'hesapkart-vadeli.fxml'.";
        assert hesapNo2 != null : "fx:id=\"hesapNo2\" was not injected: check your FXML file 'hesapkart-vadeli.fxml'.";
        assert subeAdi != null : "fx:id=\"subeAdi\" was not injected: check your FXML file 'hesapkart-vadeli.fxml'.";
        assert subeAdi2 != null : "fx:id=\"subeAdi2\" was not injected: check your FXML file 'hesapkart-vadeli.fxml'.";

    }

}
