package Assignment11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

public class Sales extends Application {
  private TextField tfprice= new TextField();
  private Button btOK = new Button("OK");
  private Button btcancel = new Button("Cancel"); 
  ComboBox combo_box = new ComboBox();
  Scene scene, scene1;
  Stage secondaryStage;
  
  
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  for(int i = 1 ; i < 101 ; i ++) {
		  combo_box.getItems().addAll((String.format("%d",i)));
  }
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Price (RM):"), 0, 0);
    gridPane.add(tfprice, 1, 0);
    gridPane.add(new Label("Qty :"), 0, 1);
    gridPane.add(combo_box, 1 , 1);

    gridPane.add(btOK, 0, 3);
    gridPane.add(btcancel, 1, 3);
    gridPane.setAlignment(Pos.CENTER);
     
    GridPane.setHalignment(btOK, HPos.LEFT);
    GridPane.setHalignment(btcancel, HPos.LEFT);
    
    btOK.setOnAction(e -> calculate(secondaryStage));
    btcancel.setOnAction(e -> System.exit(0));
    // Create a scene and place it in the stage
    Scene scene = new Scene(gridPane, 400, 250);
    primaryStage.setTitle("Sales Amount"); // Set title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
   
  }
  
  private void calculate(Stage secondaryStage) {
    double price = Double.parseDouble(tfprice.getText());
    double quantity = Double.parseDouble((String) combo_box.getValue());
    double salesAmount = 0;
    salesAmount = price * quantity;
    
    combo_box.setPromptText(String.format("RM%.2f",salesAmount));
    
    Stage subStage = new Stage();
    subStage.setTitle("");
    
    GridPane gridPane1 = new GridPane();
    gridPane1.setHgap(5);
    gridPane1.setVgap(5);
    gridPane1.add(new Label(String.format("Total amount is RM%.2f",salesAmount)), 0, 0);
    gridPane1.setAlignment(Pos.CENTER);
            
    FlowPane root = new FlowPane();
    root.setAlignment(Pos.CENTER);
    Scene scene1 = new Scene(gridPane1, 300, 200);
    
    subStage.setScene(scene1);
    subStage.show();
	}
  public static void main(String[] args) {
    launch(args);
  }
}
