package cs2.particles;

import javafx.scene.canvas.GraphicsContext;

public class Background {

  private ColorPattern colPatrn;

  public Background(ColorPattern cp) {
    colPatrn = cp;
  }

  public void display(GraphicsContext g) {
    g.setFill(colPatrn.getColor());
    g.fillRect(0,0, 1000,1000);
  }
}
