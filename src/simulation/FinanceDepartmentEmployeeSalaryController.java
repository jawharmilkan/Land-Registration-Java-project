/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelclass.EmployeePayment;
import modelclass.Salary;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FinanceDepartmentEmployeeSalaryController implements Initializable {

    @FXML
    private TextField salaryTextField;
    @FXML
    private TextField bonusTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

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
            f = new File("salary.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            EmployeePayment emp;
            try{
                outputTextArea.setText("");
                while(true){
                    System.out.println("Printing objects.");
                    emp = (EmployeePayment)ois.readObject();
                    System.out.println(emp.toString());
                    outputTextArea.appendText(emp.toString());
                }
            }
            catch(Exception e){
               
            }  
            outputTextArea.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }           

    }
    

    

    @FXML
    private void appendDataButtonOnAction(ActionEvent event) throws IOException {
         Boolean addstatus= 
                Salary.arrangeSalary(
                             nameTextField.getText(),
                             salaryTextField.getText(),
                             bonusTextField.getText()
                  
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
