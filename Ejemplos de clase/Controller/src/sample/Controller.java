package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    Label lbl1;

    public void cambiar(ActionEvent actionEvent) {
        System.out.println("Lo apreto...");
        lbl1.setText("Lo apreto...");
    }
}
