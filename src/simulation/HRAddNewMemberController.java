/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simulation;

import modelclass.Member;
import modelclass.HR;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class HRAddNewMemberController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private DatePicker dobDatePicker;
    @FXML
    private DatePicker dojDatePicker;
    @FXML
    private TextField salaryTextField1;
    @FXML
    private ComboBox<String> userTypeCombo;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        userTypeCombo.getItems().addAll("Land Owner", "Employee", "H.R", "Finance Department", "Legal Advisor","Land Buyer","Land Registraion Administrative");
        // TODO
    }    



    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("hRHomeScene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void addMemberButtonOnAction(ActionEvent event) throws IOException {
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        int i= 0;
        
        try {
            f = new File("member.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Member emp;
            try{
                
                while(true){
                    emp = (Member)ois.readObject();
                    if(emp.getId().equals(idTextField.getText())) {
                        i++;
                        
                    } 
                }
                

            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
                   
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }     
        if(i==1){
            Alert a =new Alert(Alert.AlertType.ERROR);
            a.setContentText("Opss...This ID Already Exists.");
            a.showAndWait();
        }
        else{
                         
              Boolean addstatus= 
                HR.addMember(

                        idTextField.getText(),
                        nameTextField.getText(),
                        userTypeCombo.getValue(),
                        Float.parseFloat(salaryTextField1.getText()),
                        ageTextField.getText(),
                        dobDatePicker.getValue(),
                        dojDatePicker.getValue()
                        
                        
                        
                        


                );


        if(addstatus){

            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Member Added Sucussfully");
            a.showAndWait();
        }
        else{

            Alert a =new Alert(Alert.AlertType.ERROR);
            a.setContentText("Error");
            a.showAndWait();
        
    }
   
        }
    
    }
   
    }


