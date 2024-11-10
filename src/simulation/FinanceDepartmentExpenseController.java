/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelclass.EmployeePayment;
import modelclass.Expense;
import modelclass.FinanceDepartment;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FinanceDepartmentExpenseController implements Initializable {

    private TextField yearTextField;
    private TextField monthTextField;
    @FXML
    private TextField expenseTextField;
    @FXML
    private TextField sectorTextField;
    @FXML
    private TextArea outputTextArea;
    @FXML
    private DatePicker datePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         datePicker.setValue(LocalDate.now());

        // Listen for changes to the date picker's value.
        datePicker.valueProperty().addListener((observable, oldValue, newValue) -> {
            // Update the year and month text fields with the new value.
            yearTextField.setText(newValue.getYear() + "");
            monthTextField.setText(newValue.getMonth().toString());
        });
    }

        // TODO
     

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("financeDepartmentHomeScene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
        
    }


    @FXML
    private void showDataButtonOnAction(ActionEvent event) {
        outputTextArea.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("expense.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            EmployeePayment emp;
            try{
                outputTextArea.setText("");
                while(true){
                    System.out.println("Printing objects.");
                    emp = (EmployeePayment)ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    //emp.submitReport();
                    System.out.println(emp.toString());
                    outputTextArea.appendText(emp.toString());
                }
            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
            outputTextArea.appendText("All data are loaded successfully...\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }           

    }

    @FXML
    private void addDataButtonOnAction(ActionEvent event) throws IOException {
          Boolean addstatus;
        addstatus = Expense.departmentExpense(
                sectorTextField.getText(),
                expenseTextField.getText()
                
        );



        if(addstatus){

            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setContentText(" Added Sucussfully");
            a.showAndWait();
        }
        else{

            Alert a =new Alert(Alert.AlertType.ERROR);
            a.setContentText("Error");
            a.showAndWait();
        
    }
    
    }
    
    }
    


    