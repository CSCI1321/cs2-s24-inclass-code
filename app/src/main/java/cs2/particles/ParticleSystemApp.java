package cs2.particles;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ParticleSystemApp extends Application {
  public void start(Stage primaryStage) {
    Canvas canva = new Canvas(600,600);
    Scene sc = new Scene(new StackPane(canva));
    primaryStage.setScene(sc);
    primaryStage.setTitle("Particles!");
    primaryStage.show();
    GraphicsContext g = canva.getGraphicsContext2D();

    //Particle p = new Particle(new Vec2(200,200), Vec2.random());
    ParticleSystem ps = new ParticleSystem(new Vec2(300,300));

    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, 600,600);

        //p.display(g);
        //p.update();
        //for(int i=0;i<1000;i++) {
        //  ps.addParticle(new Particle(new Vec2(200,200), Vec2.random()));
        //}
        ps.addParticle();
        ps.run(g);
      }
    };
    timer.start();

  }
}
