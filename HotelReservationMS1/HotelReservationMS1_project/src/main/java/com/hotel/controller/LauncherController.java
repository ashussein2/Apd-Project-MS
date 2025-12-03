package com.hotel.controller;

import com.hotel.app.AppConfig;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class LauncherController {

    @FXML
    private void onOpenKiosk(ActionEvent event) {
        openWindow(event, "/com/hotel/view/kiosk_view.fxml", "Kiosk - Self Service");
    }

    @FXML
    private void onOpenAdmin(ActionEvent event) {
        openWindow(event, "/com/hotel/view/admin_view.fxml", "Admin Login");
    }

    @FXML
    private void onOpenFeedback(ActionEvent event) {
        openWindow(event, "/com/hotel/view/feedback_view.fxml", "Guest Feedback");
    }

    private void openWindow(ActionEvent event, String fxmlPath, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            loader.setControllerFactory(AppConfig.getInjector()::getInstance);

            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(loader.load()));
            stage.show();

            // close launcher
            Node src = (Node) event.getSource();
            ((Stage) src.getScene().getWindow()).close();
        } catch (Exception ex) {
            ex.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Could not open window");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
    }
}
