package ru.mamalex.pomodorotasks;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TaskListController {
    @FXML
    private Button newTaskButton;

    @FXML
    public void newTaskHandler(ActionEvent event) {
        System.out.println("Yohoho");
    }
}