package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.paint.Color;

public class RainbowParticle extends RoundParticle {
  private double hue;
  
  public RainbowParticle(Vec2 ip, Vec2 iv) {
    super(ip,iv);
    hue = 0;
  }

  @Override
  public void update() {
    hue += 2;
    if(hue > 360) hue = hue % 360;
    col = Color.hsb(hue, 0.8, 0.8);
    super.update();
  }


}
