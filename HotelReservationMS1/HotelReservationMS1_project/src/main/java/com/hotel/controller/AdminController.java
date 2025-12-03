package com.hotel.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void onLogin(ActionEvent e) {
        String user = usernameField.getText().trim();
        String pass = passwordField.getText().trim();

        if (user.isEmpty() || pass.isEmpty()) {
            messageLabel.setText("Please enter both username and password.");
            messageLabel.setStyle("-fx-text-fill: #b91c1c;");
            return;
        }

        // Simple demo credentials for MS1
        if (user.equals("admin") && pass.equals("admin")) {
            messageLabel.setText("Login successful (demo). Admin dashboard will be added in next milestone.");
            messageLabel.setStyle("-fx-text-fill: #15803d;");
        } else {
            messageLabel.setText("Invalid credentials (demo check).");
            messageLabel.setStyle("-fx-text-fill: #b91c1c;");
        }
    }

    @FXML
    private void onCancel(ActionEvent e) {
        Stage stage = (Stage) messageLabel.getScene().getWindow();
        stage.close();
    }
}
