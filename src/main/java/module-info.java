module learn.programming.ourawesomegame {
    requires javafx.controls;
    requires javafx.fxml;

    opens learn.programming.ourawesomegame to javafx.fxml;
    exports learn.programming.ourawesomegame;
}