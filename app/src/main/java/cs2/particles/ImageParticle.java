package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ImageParticle extends Particle {
  Image img;

  public ImageParticle(Vec2 ip, Vec2 iv, Image myImg) {
    super(ip,iv);
    img = myImg;
  }

  public void display(GraphicsContext g) {
    g.setGlobalAlpha(0.2);
    g.drawImage(img, pos.getX(), pos.getY(), 100,200);
    g.setGlobalAlpha(1.0);
  }  
}
