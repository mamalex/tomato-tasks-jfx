package ru.mamalex.pomodorotasks;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage stage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("tasks.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        this.stage = stage;
        stage.setTitle("Pomodoro tasks");

        stage.show();
    }
}
