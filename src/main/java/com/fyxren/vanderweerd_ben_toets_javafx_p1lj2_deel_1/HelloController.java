package com.fyxren.vanderweerd_ben_toets_javafx_p1lj2_deel_1;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class HelloController {

    @FXML
    private Circle circle;

    @FXML
    private Rectangle square;

    public HelloController() {
    }

    @FXML
    void showCircle() {
        square.setVisible(false);
        circle.setVisible(true);
    }

    @FXML
    void showSquare() {
        circle.setVisible(false);
        square.setVisible(true);
    }
}