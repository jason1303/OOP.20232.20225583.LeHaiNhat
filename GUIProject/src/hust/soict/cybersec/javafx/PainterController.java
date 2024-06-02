package hust.soict.cybersec.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
    @FXML
    private RadioButton eraser;


    @FXML
    private RadioButton pen;
    
    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (pen.isSelected()) {
            draw(event);
        } else if (eraser.isSelected()) {
            erase(event);
        }
    }

    private void draw(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }

    private void erase(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.WHITE);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
    
