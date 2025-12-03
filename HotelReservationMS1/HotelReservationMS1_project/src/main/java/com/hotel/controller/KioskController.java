package com.hotel.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class KioskController {

    @FXML private TextField adultsField;
    @FXML private TextField childrenField;
    @FXML private DatePicker checkInPicker;
    @FXML private DatePicker checkOutPicker;
    @FXML private Label messageLabel;

    @FXML
    private void onStartBooking(ActionEvent e) {
        if (adultsField.getText().isEmpty()
                || checkInPicker.getValue() == null
                || checkOutPicker.getValue() == null) {
            messageLabel.setText("Please enter adults and select both dates.");
        } else {
            messageLabel.setText("Booking flow demo — logic will be added in next milestone.");
        }
    }

    @FXML
    private void onClose(ActionEvent e) {
        Stage stage = (Stage) messageLabel.getScene().getWindow();
        stage.close();
    }
}
