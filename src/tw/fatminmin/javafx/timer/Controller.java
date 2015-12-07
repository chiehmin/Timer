package tw.fatminmin.javafx.timer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label text;

    @FXML
    protected void btnResetClick(ActionEvent event) {
        CountDownTimer.getTimer().reset();
    }

    public void btnStartClick(ActionEvent event) {
        CountDownTimer.getTimer().start();
    }

    public void btnPauseClick(ActionEvent event) {
        CountDownTimer.getTimer().pause();
    }
}
