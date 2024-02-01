package learn.programming.ourawesomegame;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class GameController {

    @FXML private AnchorPane game_play;
    @FXML private Canvas game_canvas;

    @FXML private AnchorPane game_controls;

    @FXML private Label welcomeText;
    @FXML private Label anotherWelcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}