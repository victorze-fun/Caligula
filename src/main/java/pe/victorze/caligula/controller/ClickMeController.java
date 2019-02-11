package pe.victorze.caligula.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ClickMeController {

    @FXML
    private Button btn;

    @FXML
    void btn_Click(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(null);
        alert.setHeaderText(null);
        alert.setContentText("Thank :)");

        alert.showAndWait();
    }
}
