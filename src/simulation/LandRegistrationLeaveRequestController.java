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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelclass.Land_Registraion_Administrative;
import modelclass.Member;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class LandRegistrationLeaveRequestController implements Initializable {

    @FXML
    private TextArea messageBodyTextField;
    @FXML
    private TextField summaryTextField;
    @FXML
    private ComboBox<String> employeeidcombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
                    if (emp.getUserType().equals("Land Registraion Administrative")){
                        
                    
                         employeeidcombobox.getItems().add(emp.getId());
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
        // TODO
    }    

    @FXML
    private void sendRequestButtonOnAction(ActionEvent event) throws IOException {
        Boolean add= Land_Registraion_Administrative.leaverequestsender(
                        
                        /*String id, String summary, String body*/
                        
                        employeeidcombobox.getValue(),
                        summaryTextField.getText(),
                        messageBodyTextField.getText()
                       
                        
                        
                        

                );


        if(add){

            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Leave Request sent!");
            a.showAndWait();
        }
        else{

            Alert a =new Alert(Alert.AlertType.ERROR);
            a.setContentText("Error");
            a.showAndWait();
        
    }
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LandRegistrationAdministrative.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    
}
