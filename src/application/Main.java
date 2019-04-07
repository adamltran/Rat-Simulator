package application;
	
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.javafx.scene.traversal.SceneTraversalEngine;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,500,300);

			
			Image img = new Image("file:resources/mouse_clean_left.png");
			Image img2 = new Image("file:resources/mouse_clean_left2.png");
			System.out.println(img.getHeight());
			ImageView imgView = new ImageView(img);
			ImageView imgView2 = new ImageView(img2);
			imgView.setPreserveRatio(true);
			imgView.setFitHeight(img.getHeight());
			imgView.setFitWidth(img.getWidth());
//			grid.add(imgView, 0, 0);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Animal Simulator");
			primaryStage.show();

				root.getChildren().add(imgView);
				root.getChildren().add(imgView2);
				
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
