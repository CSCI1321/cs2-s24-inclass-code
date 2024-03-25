package cs2.particles;

import javafx.scene.paint.Color;

public class GradientColor implements ColorPattern {

  private Color start;
  private Color stop;
  private double frac;

  public GradientColor(Color strt, Color stp) {
    start = strt; stop = stp;
    frac = 0;
  }
  
  public Color getColor() {
    frac += 0.03;
    frac = frac % 1;
    return start.interpolate(stop, frac);
  }
  
}
