package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


public class Main extends Application {
	private double width = 700;
	private double height = 600;
	
	ArrayList<Person> personList = new ArrayList<Person>();
	ArrayList<Person> payPerson = new ArrayList<Person>();
	ArrayList<Person> receivePerson = new ArrayList<Person>();
	
	public Scene solutionPage(Stage stage) {
		double transferAmount = 0.0;
		for(int i = 0 ; i<payPerson.size() ; i++) {
			payPerson.get(i).balance = MainActivity.average - payPerson.get(i).totalPaid;
			System.out.println("pay: " + payPerson.get(i).name + " balance " + payPerson.get(i).balance);
		}
		
		for(int i = 0 ; i<receivePerson.size() ; i++) {
			receivePerson.get(i).balance = receivePerson.get(i).totalPaid - MainActivity.average;
			System.out.println("receive: " + receivePerson.get(i).name + " balance " + receivePerson.get(i).balance);
			transferAmount += receivePerson.get(i).balance;
		}
		
		System.out.println(transferAmount);
		
		ArrayList<Text> solution = new ArrayList<Text>();
		
		int i = 0;
		int j = 0;
		
		while(transferAmount>0) {
			
			if(payPerson.get(i).balance == receivePerson.get(j).balance) {
				Text t = new Text(payPerson.get(i).name + " need to pay " + receivePerson.get(j).name + " RM" + receivePerson.get(j).balance);
				solution.add(t);
				transferAmount -= receivePerson.get(j).balance;
				i++;
				j++;
			}
			else if(payPerson.get(i).balance > receivePerson.get(j).balance) {
				Text t = new Text(payPerson.get(i).name + " need to pay " + receivePerson.get(j).name + " RM" + receivePerson.get(j).balance);
				payPerson.get(i).balance -= receivePerson.get(j).balance;
				System.out.println(payPerson.get(i).balance);
				transferAmount -= receivePerson.get(j).balance;
				solution.add(t);
				j++;
			}
			else if(payPerson.get(i).balance < receivePerson.get(j).balance) {
				Text t = new Text(payPerson.get(i).name + " need to pay " + receivePerson.get(j).name + " RM" + payPerson.get(j).balance);
				receivePerson.get(i).balance -= payPerson.get(j).balance;
				transferAmount -= payPerson.get(j).balance;
				solution.add(t);
				i++;
			}
		}
		
		GridPane grid = new GridPane();
		for(int k = 0 ; k< solution.size() ; k++) {
			grid.add(solution.get(k), 0, k);
		}
		
		BorderPane pane = new BorderPane();
		pane.setCenter(grid);
		
		Scene scene = new Scene(pane, width, height);
		
		return scene;
	}
	
	public Scene totalSpentPage(Stage stage) {
		
		HBox header = new HBox();
		GridPane grid = new GridPane();
		
		ArrayList<TextField> field = new ArrayList<TextField>();
		
		for(int i = 0 ; i<personList.size() ; i++) {
			Text label = new Text("How much " + personList.get(i).name + " pay: ");
			TextField fields = new TextField();
			
			field.add(fields);
			
			grid.add(label, 0, i);
			grid.add(fields, 1, i);
		}
		
		Button submit = new Button("submit");
		grid.add(submit, 1, personList.size());
		
		submit.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			for(int i = 0 ; i<personList.size() ; i++) {
				personList.get(i).totalPaid = Double.parseDouble(field.get(i).getText());
				MainActivity.totalSpent += Double.parseDouble(field.get(i).getText());
			}
			
			MainActivity.average = MainActivity.totalSpent/MainActivity.peopleCount;
			
			for(int i = 0 ; i<personList.size() ; i++) {
				if(personList.get(i).totalPaid == MainActivity.average) {
					continue;
				}
				else if(personList.get(i).totalPaid > MainActivity.average) {
					receivePerson.add(personList.get(i));
				}
				else {
					payPerson.add(personList.get(i));
				}
			}
			
			for(int i = 0 ; i<payPerson.size() ; i++) {
				System.out.println("pay: " + payPerson.get(i).name);
			}
			for(int i = 0 ; i<receivePerson.size() ; i++) {
				System.out.println("receive" + receivePerson.get(i).name);
			}
			
			stage.setScene(solutionPage(stage));
		});
		
		BorderPane pane = new BorderPane();
		pane.setTop(header);
		pane.setCenter(grid);
		
		Scene scene = new Scene(pane, width, height);
		
		return scene;
	}
	
	public Scene addNamePage(Stage stage) {
		
		HBox header = new HBox();
		header.getChildren().add(new Text("Add name"));
		
		GridPane grid = new GridPane();
		
		ArrayList<TextField> field = new ArrayList<TextField>();
		
		for(int i = 0 ; i<personList.size() ; i++) {
			Text labelName = new Text("Name " + (i+1));
			TextField nameField = new TextField();
			
			field.add(nameField);
			
			grid.add(labelName, 0, i);
			grid.add(nameField, 1, i);
		}
		
		Button submit = new Button("submit");
		grid.add(submit, 1, personList.size());
		
		submit.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			for(int i = 0 ; i<personList.size() ; i++) {
				personList.get(i).name = field.get(i).getText();
				System.out.println(personList.get(i).name);
			}
			
			stage.setScene(totalSpentPage(stage));
		});
		
		BorderPane pane = new BorderPane();
		pane.setTop(header);
		pane.setCenter(grid);
		
		Scene scene = new Scene(pane, width, height);
		
		return scene;
	}
	
	public Scene mainPage(Stage stage) {
		Text personText = new Text("How many people: ");
		TextField numPersonField = new TextField();
		
		Button submitButton = new Button("submit");
		submitButton.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			MainActivity.peopleCount = Integer.parseInt(numPersonField.getText());
			System.out.println(MainActivity.peopleCount);
			
			for(int i = 0 ; i<MainActivity.peopleCount ; i++) {
				Person p = new Person();
				personList.add(p);
			}
			
			stage.setScene(addNamePage(stage));
		});
		
		HBox header = new HBox();
		header.getChildren().add(new Text("Home"));
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.add(personText, 0, 0);
		grid.add(numPersonField, 0, 1);
		grid.add(submitButton, 0, 2);
		
		BorderPane pane = new BorderPane();
		pane.setTop(header);
		pane.setCenter(grid);
		
		Scene scene = new Scene(pane, width, height);
		
		return scene;
	}
	
	@Override
	public void start(Stage stage) {
		stage.setScene(mainPage(stage));
		stage.setTitle("bill calculator");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
