package Assignment9;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 

public class Exercise extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Register");


        GridPane gridPane = createRegistrationFormPane();   
        addUIControls(gridPane);    
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private GridPane createRegistrationFormPane() {
 
        GridPane gridPane = new GridPane();
 
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        ColumnConstraints columnTwo = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwo.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwo);

        return gridPane;
    }
    private void addUIControls(GridPane gridPane) {
          
        String url = "https://images.app.goo.gl/XADbB71GnMpMRjLP8";
        
        boolean backgroundLoading = true;
        
        Image image = new Image(url, backgroundLoading);
        
        ImageView pic = new ImageView(image);
        pic.setFitWidth(220);
        pic.setFitHeight(220);
        pic.setImage(image);
        gridPane.add(pic, 1, 0);
    
        Label nameLabel = new Label("Username :   ");
        gridPane.add(nameLabel, 0,1);
   
        TextField nameField = new TextField();
        nameField.setPrefHeight(30);
        gridPane.add(nameField, 1,1);
   
        Label passwordLabel = new Label("Password :   ");
        gridPane.add(passwordLabel, 0, 2);
       
        PasswordField passwordField = new PasswordField();
        passwordField.setPrefHeight(30);
        gridPane.add(passwordField, 1, 2);
       
        Button submitButton = new Button("OK");   
        gridPane.add(submitButton, 0, 3);
        
        Button cancelButton = new Button("Cancel");     
        gridPane.add(cancelButton, 1, 3);    
    }
    public static void main(String[] args) {
        launch(args);
    }
}
