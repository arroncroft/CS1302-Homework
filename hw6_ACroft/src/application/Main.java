// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 6
// Due:		3/29/16

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Main extends Application {
	//data fields
	double op1, result;
	int op2;
	protected TextField operand1, operand2;
	protected TextArea resultBox;

	//start method
	@Override
	public void start(Stage stage) {
		Pane gridRootPane = buildGuiPane();
		Scene scene = new Scene(gridRootPane,600,400);
		stage.setScene(scene);
		stage.setTitle("MyLittleCalculator");
		stage.setResizable(false);
		stage.show();
	}

	//buildGuiPane
	private Pane buildGuiPane(){
		//put Operand 1 and 2 in GridPane
		GridPane operands = new GridPane();
		operands.setHgap(10);
		operands.setVgap(10);
		operands.setPadding(new Insets(25, 25, 25, 25));
		operands.setAlignment(Pos.CENTER);
		operands.getColumnConstraints().add(new ColumnConstraints(100));
		operands.getColumnConstraints().add(new ColumnConstraints(200));

        Label label1 = new Label("Operand 1:");
        operands.add(label1, 0, 0);
     	operand1 = new TextField();
     	operands.add(operand1, 2, 0);
     	Label label2 = new Label("Operand 2:");
     	operands.add(label2, 0, 1);
     	operand2 = new TextField();
     	operands.add(operand2, 2, 1);

     	//put calculator buttons in an HBox
     	HBox buttons = new HBox();
     	buttons.setSpacing(10.0);
     	buttons.setAlignment(Pos.CENTER);

     	Button btnAdd = new Button("add");
     	buttons.getChildren().add(btnAdd);
     	Button btnSubtract = new Button("subtract");
     	buttons.getChildren().add(btnSubtract);
     	Button btnMultiply = new Button("multiply");
     	buttons.getChildren().add(btnMultiply);
     	Button btnDivide = new Button("divide");
     	buttons.getChildren().add(btnDivide);
     	Button btnLoad = new Button("load");
     	buttons.getChildren().add(btnLoad);
     	Button btnExp = new Button("exp");
     	buttons.getChildren().add(btnExp);

     	// Create button event handler
        btnAdd.setOnAction(e -> {
        	op1 = Double.parseDouble(operand1.getText());
        	op2 = Integer.parseInt(operand2.getText());
        	result = op1 + op2;
        	resultBox.setText(result+"");
        });
        btnSubtract.setOnAction(e -> {
        	op1 = Double.parseDouble(operand1.getText());
        	op2 = Integer.parseInt(operand2.getText());
        	result = op1 - op2;
        	resultBox.setText(result+"");
        });
        btnMultiply.setOnAction(e -> {
        	op1 = Double.parseDouble(operand1.getText());
        	op2 = Integer.parseInt(operand2.getText());
        	result = op1 * op2;
        	resultBox.setText(result+"");
        });
        btnDivide.setOnAction(e -> {
        	op1 = Double.parseDouble(operand1.getText());
        	op2 = Integer.parseInt(operand2.getText());
        	result = op1 / op2;
        	resultBox.setText(result+"");
        });
        btnLoad.setOnAction(e -> {
        	result = Double.parseDouble(resultBox.getText());
        	operand1.setText(result+"");
        	resultBox.setText("");
        });
        btnExp.setOnAction(e -> {
        	op1 = Double.parseDouble(operand1.getText());
        	op2 = Integer.parseInt(operand2.getText());
        	result = Math.pow(op1, op2);
        	resultBox.setText(result+"");
        });

     	//put results area in GridPane
     	GridPane results = new GridPane();
     	results.setHgap(10);
		results.setVgap(10);
		results.setPadding(new Insets(25, 25, 25, 25));
		results.setAlignment(Pos.CENTER);
     	results.getColumnConstraints().add(new ColumnConstraints(100));
		results.getColumnConstraints().add(new ColumnConstraints(400));

     	Label label3 = new Label("Result:");
     	results.add(label3, 0, 1);
     	resultBox = new TextArea();
     	results.add(resultBox, 1, 1);

        //main gui is a VBox, put the three boxes in
        Pane pane = new VBox();
        VBox.setMargin(operands, new Insets(20,0,0,0));
        VBox.setMargin(buttons, new Insets(20,0,0,0));
        pane.getChildren().addAll(operands, buttons, results);

        return pane;
	}

	//main method
	public static void main(String[] args) {
		launch(args);
	}
}
