package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class SquareParticle extends Particle {
  public SquareParticle(Vec2 ip, Vec2 iv) {
    super(ip,iv);
  }
  public void displaySquare(GraphicsContext g) {
    g.setFill(col);
    g.fillRect(pos.getX(), pos.getY(), sz, sz);
  }
}
