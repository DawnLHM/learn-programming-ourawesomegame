package learn.programming.ourawesomegame;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
<<<<<<< HEAD
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
=======
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
>>>>>>> main

public class GameController {

    @FXML private AnchorPane game_play;
    @FXML private Canvas game_canvas;

    @FXML private AnchorPane game_controls;

    @FXML private Label welcomeText;
<<<<<<< HEAD
=======
    @FXML private Label anotherWelcomeText;
>>>>>>> main

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Sleepy!");
    }
    @FXML
    private Button runningButton;

    @FXML
    protected void onHelloButtonClick2() {
        runningButton.setLayoutX(30);
        runningButton.setLayoutY(30);
        boolean keepGoing=false;

    }

    @FXML
    protected void runAwayFromTheMouse() {
        runningButton.setStyle("-fx-background-color: green;");
        float changeX = (float) (Math.random() * 300);
        float changeY = (float) (Math.random() * 300);

        TranslateTransition tt = new TranslateTransition(Duration.millis(500), runningButton);
        tt.setRate(1);
        tt.toXProperty().set(changeX);
        tt.toYProperty().set(changeY);
        tt.setCycleCount(1);

        //Playing the animation
        tt.play();

    }
}