package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class RoundParticle extends Particle {
  public RoundParticle(Vec2 ip, Vec2 iv) {
    super(ip,iv);
  }

  @Override
  public void display(GraphicsContext g) {
    g.setFill(col);
    g.fillOval(pos.getX(), pos.getY(), sz, sz);
  }
}
