/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
//import modelclass.LegalAdvisor;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.Label;


/**
 * FXML Controller class
 *
 * @author sajid
 */

public class LegalAdvisorSetEmergencyMeetingController implements Initializable {

    @FXML
    private TextField meetingTimeTextField;
    @FXML
    private RadioButton onlineMeetingRadioButton;
    @FXML
    private RadioButton offlineMeetingRadioButton;
    @FXML
    private TextField meetingLinkTextField;
    @FXML
    private TextField meetingLocationTextField;
    @FXML
    private DatePicker datepickermeeting;
    private String meetingLink = "";
    @FXML
    private Label meetingsetlabel;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup tg = new ToggleGroup();
        onlineMeetingRadioButton.setToggleGroup(tg);
        offlineMeetingRadioButton.setToggleGroup(tg);
    }

    @FXML
    private void saveButtonOnAction(ActionEvent event) throws IOException {
            String meetingDate = datepickermeeting.getValue().toString();
            String meetingType = null;
            if (onlineMeetingRadioButton.isSelected()) {
                meetingType = "Online Meeting";
            } else {
                meetingType = "Offline Meeting";
            }

            try {
                meetingLink = meetingLinkTextField.getText();
            } catch (NullPointerException e) {
                // The control is null, so initialize it and get the text.
                meetingLinkTextField = (TextField) FXMLLoader.load(getClass().getResource("legalAdvisorSetEmergencyMeeting.fxml"));
                meetingLink = meetingLinkTextField.getText();
            }

            // Save the meeting data to a file.
            BufferedWriter writer = new BufferedWriter(new FileWriter("meeting data.bin"));
            writer.write("Meeting Date: " + meetingDate + "\n");
            writer.write("Meeting Type: " + meetingType + "\n");
            writer.write("Meeting Time: " + meetingTimeTextField.getText() + "\n");
            writer.write("Meeting Location: " + meetingLocationTextField.getText() + "\n");
            writer.write("Meeting Link: " + meetingLink + "\n");
            writer.write("Meeting Set By: " + "Legal Advisor" + "\n");
            writer.close();
            
             String meetingData = "";
        FileInputStream fis = new FileInputStream("meeting data.bin");
        byte[] data = new byte[fis.available()];
     fis.read(data);
        meetingData = new String(data);
        fis.close();

         meetingsetlabel.setText(meetingData);
        }


    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("legalAdvisorHomeScene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }

}