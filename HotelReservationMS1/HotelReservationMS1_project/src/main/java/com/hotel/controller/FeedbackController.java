package com.hotel.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FeedbackController {

    @FXML private Slider ratingSlider;
    @FXML private TextArea commentsArea;
    @FXML private Label messageLabel;

    @FXML
    private void onSubmit(ActionEvent e) {
        int rating = (int) ratingSlider.getValue();
        String comments = commentsArea.getText().trim();

        // Milestone 1: just show a confirmation
        messageLabel.setText("Thanks for your feedback! (Rating: " + rating + ")");
    }

    @FXML
    private void onClose(ActionEvent e) {
        Stage stage = (Stage) messageLabel.getScene().getWindow();
        stage.close();
    }
}
