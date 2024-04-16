package com.example.bankmobile;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("giris-sayfasi.fxml"));
        stage.setTitle("Giriş Sayfasına Hoşgeldiniz!");
        stage.setScene(new Scene(root));
        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }
}