package Assignment10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SalesCommission extends Application {
  private TextField tfsalesamount= new TextField();
  private TextField tfcomissionrate= new TextField();
  private TextField tfcomissionamount= new TextField();
  private Button btOK = new Button("OK");
  private Button btcancel = new Button("Cancel"); 
  
  Scene scene, scene1;
  Stage secondaryStage;
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create UI
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Sales Amount:"), 0, 0);
    gridPane.add(tfsalesamount, 1, 0);
    gridPane.add(new Label("Comision Rate:"), 0, 1);
    gridPane.add(tfcomissionrate, 1, 1);

    gridPane.add(btOK, 0, 3);
    gridPane.add(btcancel, 1, 3);

    // Set properties for UI
    gridPane.setAlignment(Pos.CENTER);
    tfsalesamount.setAlignment(Pos.BOTTOM_LEFT);
    tfcomissionrate.setAlignment(Pos.BOTTOM_LEFT);
     
    GridPane.setHalignment(btOK, HPos.LEFT);
    GridPane.setHalignment(btcancel, HPos.LEFT);
    // Process events
    
    btOK.setOnAction(e -> calculate(secondaryStage));
 
    // Create a scene and place it in the stage
    Scene scene = new Scene(gridPane, 400, 250);
    primaryStage.setTitle("SalesComission"); // Set title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
   
  }
  
  private void calculate(Stage secondaryStage) {
    double sales =Double.parseDouble(tfsalesamount.getText());
    double comission =Double.parseDouble(tfcomissionrate.getText());
    double comissionamount;
    comissionamount = sales * (comission / 100);

    tfcomissionamount.setText(String.format("RM%.2f",comissionamount));
  
    Stage subStage = new Stage();
    subStage.setTitle("");
    
    GridPane gridPane1 = new GridPane();
    gridPane1.setHgap(5);
    gridPane1.setVgap(5);
    gridPane1.add(new Label("Comision Amount: RM" + comissionamount), 0, 2);
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