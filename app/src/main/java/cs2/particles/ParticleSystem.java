package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class ParticleSystem {
  private Vec2 origin;
  private ArrayList<Particle> parts;

  public ParticleSystem() {
    parts = new ArrayList<Particle>();
  }
  public ParticleSystem(Vec2 initOrigin) {
    parts = new ArrayList<Particle>();
    origin = initOrigin;
  }

  public void addParticle(Particle p) {
    parts.add(p);
  }
  public void addParticle() {
    //parts.add(new ImageParticle(origin.clone(), Vec2.random(), ParticleSystemApp.img));
    parts.add(new RainbowParticle(origin.clone(), Vec2.random()));
    /* 
    if(Math.random() < 0.5) {
      parts.add(new RoundParticle(origin.clone(), Vec2.random()));
    } else {
      parts.add(new SquareParticle(origin.clone(), Vec2.random()));
    }*/
  }

  public void run(GraphicsContext g) {
    System.out.println(parts.size());
    for(int i=0; i<parts.size(); i++) {
      parts.get(i).update();
      parts.get(i).display(g);
    }
  }
  public void addForce(Vec2 force) {
    for(int i=0; i<parts.size(); i++) {
      parts.get(i).addForce(force);
    }
  }

}
