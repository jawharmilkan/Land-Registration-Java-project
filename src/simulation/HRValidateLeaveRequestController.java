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
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelclass.HR;
import modelclass.LeaveRequest;
import modelclass.Member;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class HRValidateLeaveRequestController implements Initializable {

    @FXML
    private TextArea showTextArea;
    @FXML
    private ComboBox<String> idCombo;
    @FXML
    private ComboBox<String> accptRjctCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        accptRjctCombo.getItems().addAll("ACCEPTED","REJECTED");
        accptRjctCombo.setValue("REJECTED");
        showTextArea.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        
        
        try {
            f = new File("LeaveRequests.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            LeaveRequest emp;
            try{
                showTextArea.setText("");
                
                while(true){
                    emp = (LeaveRequest)ois.readObject();
                    idCombo.getItems().add(emp.getId());
                    
                    showTextArea.appendText(emp.toString());
                    
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
    private void sendButtonOnAction(ActionEvent event) throws IOException {
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        
        
        try {
            f = new File("member.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Member emp;
            try{
                
                while(true){
                    emp = (Member)ois.readObject();
                    if(emp.getId().equals(idCombo.getValue())) {
                        if(emp.getUserType().equals("H.R")){
                            Boolean add= HR.validateLeaveRqst1(
                        
                        
                                idCombo.getValue(),
                        accptRjctCombo.getValue()
                         );
                            
                            if(add){

                                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                                    a.setContentText("Validated Leave Request!");
                                    a.showAndWait();
                                }
                                else{

                                    Alert a =new Alert(Alert.AlertType.ERROR);
                                    a.setContentText("Error");
                                    a.showAndWait();
        
                                        }
                        
                        }
                        
                       
                        else if(emp.getUserType().equals("Land Owner")){
                            Boolean add= HR.validateLeaveRqst2(
                        
                        
                                idCombo.getValue(),
                        accptRjctCombo.getValue()
                         );
                            
                            if(add){

                                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                                    a.setContentText("Validated Leave Request!");
                                    a.showAndWait();
                                }
                                else{

                                    Alert a =new Alert(Alert.AlertType.ERROR);
                                    a.setContentText("Error");
                                    a.showAndWait();
        
                                        }
                        
                        }
                        
                        else if(emp.getUserType().equals("Employee")){
                            Boolean add= HR.validateLeaveRqst3(
                        
                        
                                idCombo.getValue(),
                        accptRjctCombo.getValue()
                         );
                            
                            if(add){

                                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                                    a.setContentText("Validated Leave Request!");
                                    a.showAndWait();
                                }
                                else{

                                    Alert a =new Alert(Alert.AlertType.ERROR);
                                    a.setContentText("Error");
                                    a.showAndWait();
        
                                        }
                        
                        }
                        
                        else if(emp.getUserType().equals("Finance Department")){
                            Boolean add= HR.validateLeaveRqst4(
                        
                        
                                idCombo.getValue(),
                        accptRjctCombo.getValue()
                         );
                            
                            if(add){

                                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                                    a.setContentText("Validated Leave Request!");
                                    a.showAndWait();
                                }
                                else{

                                    Alert a =new Alert(Alert.AlertType.ERROR);
                                    a.setContentText("Error");
                                    a.showAndWait();
        
                                        }
                        
                        }
                        
                        else if(emp.getUserType().equals("Legal Advisor")){
                            Boolean add= HR.validateLeaveRqst5(
                        
                        
                                idCombo.getValue(),
                        accptRjctCombo.getValue()
                         );
                            
                            if(add){

                                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                                    a.setContentText("Validated Leave Request!");
                                    a.showAndWait();
                                }
                                else{

                                    Alert a =new Alert(Alert.AlertType.ERROR);
                                    a.setContentText("Error");
                                    a.showAndWait();
        
                                        }
                        
                        }
                        
                        else if(emp.getUserType().equals("Land Buyer")){
                            Boolean add= HR.validateLeaveRqst6(
                        
                        
                                idCombo.getValue(),
                        accptRjctCombo.getValue()
                         );
                            
                            if(add){

                                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                                    a.setContentText("Validated Leave Request!");
                                    a.showAndWait();
                                }
                                else{

                                    Alert a =new Alert(Alert.AlertType.ERROR);
                                    a.setContentText("Error");
                                    a.showAndWait();
        
                                        }
                        
                        }
                        
                        if(emp.getUserType().equals("Land Registraion Administrative")){
                            Boolean add= HR.validateLeaveRqst7(
                        
                        
                                idCombo.getValue(),
                        accptRjctCombo.getValue()
                         );
                            
                            if(add){

                                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                                    a.setContentText("Validated Leave Request!");
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
        
        
        
        
    }

    
}
