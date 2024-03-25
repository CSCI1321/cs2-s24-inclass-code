package cs2.particles;

import javafx.scene.paint.Color;

public class RainbowColor implements ColorPattern {
  private double hue = 0;

  public Color getColor() {
    hue += 2;
    return Color.hsb(hue, 0.8, 0.8);
  }
}
