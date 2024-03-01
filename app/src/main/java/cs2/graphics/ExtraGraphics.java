package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExtraGraphics extends Application {

  public double map(double value, double loin, double hiin, double loout, double hiout) {
    double newval = value - loin;
    newval /= (hiin - loin);
    newval *= (hiout - loout);
    newval += loout;
    return newval;
  }

  public void start(Stage stg) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    GraphicsContext g = canvas.getGraphicsContext2D();
    stg.show();

    for(double y=0; y<canvas.getHeight(); y+=50) {
      for(double x=0; x<canvas.getWidth(); x+=50) {
        //g.setFill(Color.rgb(map(x, 0,600, 0,255),
        //                    map(y, 0,600, 0,255),0));
        g.fillOval(x,y, 50,50);
      }
    }

    Color skyblue = Color.rgb(40, 122, 209);
    Color skyorange = Color.rgb(227, 117, 39);

    for(double y=0; y<600; y++) {
      g.setLineWidth(2);
      g.setStroke(skyblue.interpolate(skyorange, map(y, 0,600, 0,1)));
      g.strokeLine(0,y, 600,y);
    }


    g.setLineWidth(3);
    for(double r=200; r>0; r--) {
      g.setStroke(Color.rgb(250, 96, 12).interpolate(Color.rgb(224, 203, 63), 
                  map(r,200,0, 0,1)));
      //g.strokeOval(200,300, r*2,r*2);
      strokeCircle(g, 200, 300, r);
    }

    for(double y=400; y<600; y++) {
      g.setStroke(Color.rgb(13, 20, 158).interpolate(Color.rgb(111, 133, 222), 
                  map(y,400,600, 0,1)));
      g.strokeLine(0,y, 600,y);
    }
    
  }

  public void strokeCircle(GraphicsContext g, double x, double y, double r) {
    g.strokeOval(x-r,y-r, r*2,r*2);
  }
  
}
