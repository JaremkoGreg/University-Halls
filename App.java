package com.mycompany.student_halls;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
/**
 * JavaFX App
 */
public class App extends Application {
    private StudentHall firstHall;
    
    @Override
    public void start(Stage stage) {
        firstHall = new StudentHall("Main Hall", 200);
        //CREATING GRID PANE
        GridPane root = new GridPane();
        root.setPadding(new Insets(15,15,15,15));
        root.setVgap(5);
        root.setHgap(5);
        root.setStyle("-fx-background-color: white;");
        
        //PAGE TITLE
        Text title = new Text("Welcome Administrator!");
        title.setFill(Paint.valueOf("#007FFF"));
        title.setFont(Font.font("Arial", FontWeight.BOLD, 40));
        
        //LABELS FOR USER INPUT
        //STUDENT ID LABEL
        Label lblId = new Label("Enter student's ID:  ");
        lblId.setFont(Font.font("Arial", 15));
        TextField txtId = new TextField();
        
        //STUDENT NAME LABEL
        Label lblName = new Label("Enter student's first name:  ");
        lblName.setFont(Font.font("Arial", 15));
        TextField txtName = new TextField();
        
        //STUDENT SURNAME LABEL
        Label lblSurname = new Label("Enter student's surname:  ");
        lblSurname.setFont(Font.font("Arial", 15));
        TextField txtSurname = new TextField();
        
        //STUDENT GENDER LABEL
        Label lblGender = new Label("What's the student's gender:  ");
        lblGender.setFont(Font.font("Arial", 15));
        TextField txtGender = new TextField();
        
        //STUDENT EMAIL LABEL
        Label lblEmail = new Label("Enter student's email address:  ");
        lblEmail.setFont(Font.font("Arial", 15));
        TextField txtEmail = new TextField();
        
        //CREATING CONFIRMATION LABEL
        Label lblResponse = new Label();
        lblResponse.setFont(Font.font("Arial", 15));
        
        //BUTTONS
        //CREATING BUTTONS
        Button submit = new Button("ADD STUDENT");
        Button clear = new Button("CLEAR");
        
        //SUBMIT BUTTON ACTION
        DropShadow shadow = new DropShadow();
        submit.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->
        {
            submit.setEffect(shadow); 
        });
        
        submit.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)-> 
        {
            submit.setEffect(null);
        });
        
        submit.setOnAction((ActionEvent e)->{
            if(txtId.getText()!=null && !txtId.getText().isEmpty())
            {
               Student myStu = new Student(txtId.getText(), txtName.getText(),txtSurname.getText(),txtGender.getText(),txtEmail.getText());
               lblResponse.setText("Student added");
                
                
                firstHall.addStudent(myStu);
                lblResponse.setText(firstHall.displayStudents());
            }
            else
            {
                lblResponse.setText("You have entered a student");
            }
        });
        
        //CLEAR BUTTON ACTION
        clear.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->
        {
            clear.setEffect(shadow); 
        });
        
        clear.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)-> 
        {
            clear.setEffect(null);
        });
        
        clear.setOnAction((ActionEvent e)-> {
            txtId.clear();
            txtName.clear();
            txtSurname.clear();
            txtGender.clear();
            txtEmail.clear();
            lblResponse.setText(null);
        });
       
        //POSITIONING
        root.add(title, 50, 0, 1, 1);
        root.add(lblId, 50, 2);
        root.add(txtId,50,3);
        root.add(lblName, 50, 4);
        root.add(txtName, 50, 5);
        root.add(lblSurname,50,6);
        root.add(txtSurname,50,7);
        root.add(lblGender,50,8);
        root.add(txtGender,50,9);
        root.add(lblEmail,50,10);
        root.add(txtEmail,50,11);
        root.add(submit,52,18);
        root.add(clear,50, 18);
        root.add(lblResponse,0,20,2,1);
        
        //Creating the scene and naming it
        Scene scene = new Scene(root, 1000, 800);
        stage.setFullScreen(true);
        stage.setTitle("Student Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}