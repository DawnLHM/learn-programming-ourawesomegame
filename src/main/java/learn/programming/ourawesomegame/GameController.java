package learn.programming.ourawesomegame;

import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class GameController {

    @FXML private AnchorPane game_play;
    @FXML private Canvas game_canvas;

    @FXML private AnchorPane game_controls;

    @FXML private Label welcomeText;
    @FXML private Label anotherWelcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Sleepy!");
    }
    @FXML private Button runningButton1;
    @FXML private Button runningButton2;
    @FXML private Button runningButton3;
    @FXML private Button runningButton4;

    @FXML
    protected void startTheButtonsGoing() {
        System.out.println("I did something");
        float changeX = 200 + (float) (Math.random() * 500);
        float changeY = 200 + (float) (Math.random() * 500);

        TranslateTransition tt1 = getTransition(runningButton1, changeX, changeY, Interpolator.LINEAR);
        TranslateTransition tt2 = getTransition(runningButton2, changeX, changeY, Interpolator.EASE_BOTH);
        TranslateTransition tt3 = getTransition(runningButton3, changeX, changeY, Interpolator.LINEAR);
        TranslateTransition tt4 = getTransition(runningButton4, changeX, changeY, Interpolator.EASE_BOTH);

        //Playing the animations
        tt1.play();
        tt2.play();
        tt3.play();
        tt4.play();
    }

    private TranslateTransition getTransition(final Button button,
                                              final float changeX,
                                              final float changeY,
                                              final Interpolator interpolator
    ) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(500), button);
        tt.setRate(1);
        tt.setInterpolator(interpolator);
        tt.toXProperty().set(changeX);
        tt.toYProperty().set(changeY);
        tt.setCycleCount(1);
        return tt;
    }

    @FXML
    protected void runAwayFromTheMouse() {
        float changeX = (float) (Math.random() * 300);
        float changeY = (float) (Math.random() * 300);

        TranslateTransition tt = new TranslateTransition(Duration.millis(500), runningButton1);
        tt.setRate(1);
        tt.setInterpolator(Interpolator.EASE_IN);
        tt.toXProperty().set(changeX);
        tt.toYProperty().set(changeY);
        tt.setCycleCount(1);

        //Playing the animation
        tt.play();

    }
}