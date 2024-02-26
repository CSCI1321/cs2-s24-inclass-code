package cs2.graphics;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class GraphicsStuff extends Application {


  public void start(Stage primaryStage) {
    Canvas canva = new Canvas(600,600);
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

    Color bodyColor = Color.rgb(0,0,100);

    g.setFill(Color.WHITE);
    g.fillRect(0,0, canva.getWidth(),canva.getHeight());
    g.setFill(bodyColor);
    g.fillRect(200,200, 200,200);
    g.fillOval(200,100, 200,200);
    g.fillOval(200,300, 200,200);

    g.setFill(Color.rgb(237, 210, 135));
    g.fillOval(200,150, 100,100);
    g.fillOval(300,150, 100,100);
    g.fillArc(200,100, 200,200, 180,180, ArcType.ROUND);

    double[] xs = {300, 320, 300, 280};
    double[] ys = {200, 220, 240, 220};
    g.setFill(bodyColor);
    g.fillPolygon(xs, ys, 4);

    g.setLineWidth(2);
    for(int x=0; x<canva.getWidth(); x++) {
      g.setStroke(Color.rgb(x * 255 / 600,0,0));
      g.strokeLine(x,0, x,canva.getHeight());
    }

    g.setFill(Color.WHITE);
    g.fillRect(0,0, canva.getWidth(),canva.getHeight());
    g.setStroke(Color.BLACK);
    g.setLineWidth(1);

    drawCircle(g, 300,300,150);

  }

  public void drawCircle(GraphicsContext g, double x, double y, double r) {
    g.strokeOval(x-r,y-r, r*2,r*2);
    if(r > 5) {
      drawCircle(g, x-r, y, r/2);
      drawCircle(g, x+r, y, r/2);
      drawCircle(g, x, y-r, r/2);
      drawCircle(g, x, y+r, r/2);
    }
  }

}
