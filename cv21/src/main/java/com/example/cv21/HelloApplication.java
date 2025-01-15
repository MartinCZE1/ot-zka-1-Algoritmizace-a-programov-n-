package com.example.cv21;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    static int screen_width = 600;
    static int screen_height = 600;
    GraphicsContext gc;
    int colorNumber = 1;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        stage.setTitle("Hello!");
        VBox root = new VBox();
        Scene scene = new Scene(root, screen_width, screen_height);
        stage.setScene(scene);
        stage.show();
        Canvas c = new Canvas(screen_width, screen_height);
        gc = c.getGraphicsContext2D();
        root.getChildren().add(c);

        Timeline timeline = new Timeline(new KeyFrame(new Duration(1000), event -> switchLights()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.playFromStart();

        stage.setTitle("DEMO!");
        stage.setScene(scene);
        stage.show();

       /*AnimationTimer animationTimer = new AnimationTimer() {
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

    }*/

    }

    private void switchLights() {
        colorNumber = colorNumber > 3 ? 1 : colorNumber;
        System.out.println("switched");
        gc.setFill(Color.GRAY);
        gc.fillRect(90, 90, 120, 370);
        if (colorNumber == 1) {
            gc.setFill(Color.RED);
        } else {
            gc.setFill(Color.BLACK);
        }
        gc.fillOval(100, 100, 100, 100);
        gc.setFill(Color.BLACK);
        if (colorNumber == 2) {
            gc.setFill(Color.ORANGE);
        } else {
            gc.setFill(Color.BLACK);
        }
        gc.fillOval(100, 220, 100, 100);
        gc.setFill(Color.BLACK);
        if (colorNumber == 3) {
            gc.setFill(Color.GREEN);
        } else {
            gc.setFill(Color.BLACK);
        }

        gc.fillOval(100, 340, 100, 100);
        gc.setFill(Color.BLACK);
        colorNumber++;
    }

    public static void main(String[] args) {
        launch();
    }
}