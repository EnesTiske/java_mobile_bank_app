package com.example.bankmobile;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class GirisSayfaController {


    @FXML
    private Button girisbuton;

    @FXML
    private PasswordField girisparola;

    @FXML
    private Pane girissayfa;

    @FXML
    private TextField giristc;

    @FXML
    private Label sifreal;

    public GirisSayfaController() {
    }


    @FXML
    void initialize() {
        assert girisbuton != null : "fx:id=\"girisbuton\" was not injected: check your FXML file 'giris-sayfasi.fxml'.";
        assert girisparola != null : "fx:id=\"girisparola\" was not injected: check your FXML file 'giris-sayfasi.fxml'.";
        assert girissayfa != null : "fx:id=\"girissayfa\" was not injected: check your FXML file 'giris-sayfasi.fxml'.";
        assert giristc != null : "fx:id=\"giristc\" was not injected: check your FXML file 'giris-sayfasi.fxml'.";

    }
    @FXML
    void handleSifremiUnuttumClicked(MouseEvent event) {

    }
    @FXML
    public void handleGirisButonAction() {
        String tc = giristc.getText();
        String parola = girisparola.getText();

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("anasayfa-hesaplarim.fxml"));
            Pane anasayfaPane = loader.load();
            Scene anasayfaScene = new Scene(anasayfaPane);
            Stage stage = (Stage) girisbuton.getScene().getWindow();
            stage.setScene(anasayfaScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
