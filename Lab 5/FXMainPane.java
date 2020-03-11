import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button b1, b2, b3, b4, b5, b6;
	Label label;
	TextField txt_Fld;
	//  declare two HBoxes
	HBox box1;
	HBox box2;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager datamanager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		b1 = new Button("Hello");
		b2 = new Button("Howdy");
		b3 = new Button("Chinese");
		b4 = new Button("Clear");
		b5 = new Button("Exit");
		b6 = new Button("Nepali");
		
		label = new Label("Feedback");
		txt_Fld = new TextField();
		
		//  instantiate the HBoxes
		box1 = new HBox();
		box2 = new HBox();
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		datamanager = new DataManager();
		//  set margins and set alignment of the components
		HBox.setMargin(b1,new Insets(40, 20, 30, 0));
		HBox.setMargin(b2,new Insets(40, 20, 30, 0));
		HBox.setMargin(b3,new Insets(40, 20, 30, 0));
		HBox.setMargin(b6,new Insets(40, 20, 30, 0));
		HBox.setMargin(b4,new Insets(40, 20, 30, 0));
		HBox.setMargin(b5,new Insets(40, 0, 30, 0));
		
		HBox.setMargin(label,new Insets(0, 10, 0, 0));
		HBox.setMargin(txt_Fld, new Insets(0,0,0,0));
		box1.setAlignment(Pos.CENTER);
		box2.setAlignment(Pos.CENTER);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		box2.getChildren().addAll(label,txt_Fld);
		//  add the buttons to the other HBox
		box1.getChildren().addAll(b1, b2, b3, b6, b4, b5);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(box1,box2);
		
		b1.setOnAction(new ButtonHandler());
		b2.setOnAction(new ButtonHandler());
		b3.setOnAction(new ButtonHandler());
		b4.setOnAction(new ButtonHandler());
		b5.setOnAction(new ButtonHandler());
		b6.setOnAction(new ButtonHandler());
	}
	
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
			switch (((Labeled) event.getTarget()).getText()) {
			case "Hello":
				txt_Fld.setText(datamanager.getHello());
				break;
			case "Howdy":
				txt_Fld.setText(datamanager.getHowdy());
				break;
			case "Chinese":
				txt_Fld.setText(datamanager.getChinese());
				break;
				// Optional Task
			case "Nepali":
				txt_Fld.setText(datamanager.getNepali());
				break;
			case "Clear":
				txt_Fld.setText("");
				break;
			case "Exit":
				Platform.exit();
				System.exit(0);
				break;
		}
		
	}

}

}