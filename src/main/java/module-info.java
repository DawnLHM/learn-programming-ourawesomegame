module learn.programming.ourawesomegame {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens learn.programming.ourawesomegame to javafx.fxml;
    exports learn.programming.ourawesomegame;
}