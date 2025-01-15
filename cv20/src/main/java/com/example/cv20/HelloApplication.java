package com.example.cv20;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static int screen_width = 600;
    static int screen_height = 600;
    GraphicsContext gc;

    double[] upperHalfX = new double[]{100, 200, 150};
    double[] upperHalfY = new double[]{100, 100, 200};
    double[] bottomHalfX = new double[]{100, 200, 150};
    double[] bottomHalfY = new double[]{300, 300, 200};

    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Canvas c = new Canvas(screen_width, screen_height);
        gc = c.getGraphicsContext2D();
        root.getChildren().add(c);
        Scene scene = new Scene(root, screen_width, screen_height);

        stage.setTitle("DEMO!");
        stage.setScene(scene);
        stage.show();

        AnimationTimer animationTimer = new AnimationTimer() {
            long lastTick = 0;

            @Override
            public void handle(long now) {

                if (now - lastTick > 100000000l) {
                    lastTick = now;
                    tick();
                }
            }
        };
        animationTimer.start();


    }

    private void tick() {
        gc.fillPolygon(upperHalfX, upperHalfY, 3);
        gc.fillPolygon(bottomHalfX, bottomHalfY, 3);
        gc.setFill(Color.RED);
    }

    public static void main(String[] args) {
        launch();
    }
}