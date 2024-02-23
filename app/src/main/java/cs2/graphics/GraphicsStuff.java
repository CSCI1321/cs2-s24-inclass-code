package cs2.graphics;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GraphicsStuff extends Application {
  public void start(Stage primaryStage) {
    Canvas canva = new Canvas(600,400);
    Scene sc = new Scene(new StackPane(canva));
    primaryStage.setScene(sc);
    primaryStage.show();

    GraphicsContext g = canva.getGraphicsContext2D();
    g.setFill(Color.SPRINGGREEN);
    g.fillRect(50,100, 300,50);
    g.setLineWidth(20);
    g.strokeRect(200,200, 300,200);
    g.setFill(Color.RED);
    g.fillOval(200,200, 300,200);
    g.setStroke(Color.ORCHID);
    g.strokeLine(0,400, 600,0);

  }
}
