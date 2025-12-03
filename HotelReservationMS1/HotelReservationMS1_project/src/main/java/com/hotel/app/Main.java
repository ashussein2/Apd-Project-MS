package com.hotel.app;

import com.hotel.app.AppConfig;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/hotel/view/launcher_view.fxml"));
        loader.setControllerFactory(param -> AppConfig.getInjector().getInstance(param));

        Scene scene = new Scene(loader.load());
        stage.setTitle("Hotel Reservation System");
        stage.setScene(scene);
        stage.setMinWidth(900);
        stage.setMinHeight(600);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
