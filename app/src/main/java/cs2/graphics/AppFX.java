package cs2.graphics;

import javafx.application.Application;

public class AppFX extends Application {
  @Override
  public void start(javafx.stage.Stage primaryStage) {
    javafx.scene.control.Label label = new javafx.scene.control.Label("Hello World, JavaFX !");
    javafx.scene.Scene scene = new javafx.scene.Scene(label, 400, 200);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
