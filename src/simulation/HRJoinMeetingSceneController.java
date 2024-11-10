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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import modelclass.Member;
import modelclass.SetMeeting;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class HRJoinMeetingSceneController implements Initializable {

    @FXML
    private TextField meetingLocationTextField;
    @FXML
    private TextField meetingDateTextField;
    @FXML
    private TextField meetingTimeTextField;
    @FXML
    private TextField meetingLinkTextField;
    @FXML
    private TextField meetingTypeTextField;
   
    @FXML
    private DatePicker selectDatePicker;
    
    private ToggleGroup tg;
    @FXML
    private ComboBox<String> selectTypeCombo;
    @FXML
    private ComboBox<String> selectSetByCombo2;
    @FXML
    private TextField setByTextField1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectSetByCombo2.getItems().addAll("Land Owner", "Employee", "H.R", "Finance Department", "Legal Advisor","Land Buyer","Land Registraion Administrative");
           
                
        selectTypeCombo.getItems().addAll("Offline Meeting", "Online Meeting");

        selectTypeCombo.setValue("Offline Meeting");

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
    private void searchButtonOnAction(ActionEvent event) {
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("meeting.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            SetMeeting met;
            try{
                
                while(true){
                    met = (SetMeeting)ois.readObject();
                    meetingLocationTextField.setText("");
                    meetingDateTextField.setText("");
                    meetingTimeTextField.setText("");
                    meetingTypeTextField.setText("");
                    setByTextField1.setText("");
                    
                    meetingLinkTextField.setText("");
                    
                    
                    
                    if(selectDatePicker.getValue().equals(met.getMeetingDate()) && selectTypeCombo.getValue().equals(met.getMeetingType()) && selectSetByCombo2.getValue().equals(met.getSetby())){
                    meetingLocationTextField.setText("");
                    meetingDateTextField.setText("");
                    meetingTimeTextField.setText("");
                    meetingTypeTextField.setText("");
                    setByTextField1.setText("");
                    
                    meetingLinkTextField.setText("");
                    
                    
                    
                    meetingLocationTextField.appendText(met.getMeetingLocation());
                    meetingDateTextField.appendText(met.toString());
                    meetingTimeTextField.appendText(met.getMeetingTime());
                    meetingTypeTextField.appendText(met.getMeetingType());
                    setByTextField1.appendText(met.getSetby());
                    
                    meetingLinkTextField.appendText(met.getMeetingLink());
                    
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
