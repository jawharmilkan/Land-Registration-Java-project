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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import modelclass.HRVLLeaveRequests;
import modelclass.LRAVLLeaveRequests;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class LandRegistrationCheckLeaveRequestController implements Initializable {

    @FXML
    private TextArea showTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showTextArea.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("LRAVLLeaveRequests.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            LRAVLLeaveRequests emp;
            try{
                showTextArea.setText("");
                while(true){
                    emp = (LRAVLLeaveRequests)ois.readObject();
                    
                    showTextArea.appendText(emp.toString());
                }
            }//end of nested try//end of nested try
            catch(Exception e){
                //
            }//nested catch     
            showTextArea.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
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
