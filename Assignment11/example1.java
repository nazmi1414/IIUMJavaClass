package Assignment11;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
public class example1 extends Application {
 protected Text text = new Text(80, 80, "JavaFX Programming");
 protected BorderPane getPane() {

 HBox paneForButtons = new HBox(20);
 Button btLeft = new Button("Left", new ImageView(new Image("left.jpeg")));
 //Button btRight = new Button("Right");
 Button btRight = new Button("Right", new ImageView(new Image("right.jpeg")));
 paneForButtons.getChildren().addAll(btLeft, btRight);
 paneForButtons.setAlignment(Pos.CENTER);
paneForButtons.setStyle("-fx-border-color: green");
 BorderPane pane = new BorderPane();
 pane.setBottom(paneForButtons);
 Pane paneForText = new Pane();
 paneForText.getChildren().add(text);
pane.setCenter(paneForText);
btLeft.setOnAction(e -> text.setX(text.getX() - 10));
 btRight.setOnAction(e -> text.setX(text.getX() + 10));
 return pane;
 }
 @Override // Override the start method in the Application class
public void start(Stage primaryStage) {
 // Create a scene and place it in the stage
 Scene scene = new Scene(getPane(), 450, 200);
 primaryStage.setTitle("ButtonDemo"); // Set the stage title
 primaryStage.setScene(scene); // Place the scene in the stage
 primaryStage.show(); // Display the stage
 }
public static void main(String[] args) {
 launch(args);
 }
}