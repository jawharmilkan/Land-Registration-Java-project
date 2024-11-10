package simulation;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Unknown
 */
public class LandbuyerSetmeetingsceneController implements Initializable {

    @FXML
    private DatePicker datepickermeeting;
    @FXML
    private RadioButton onlinemeetingradiobtn;
    @FXML
    private TextField meetingtimefield;
    @FXML
    private TextField meetinglocationfield;
    @FXML
    private TextField meetinglinkfield;
    @FXML
    private Label savenotificationlabel;
    @FXML
    private RadioButton offlinemeetingradiobtn;
    private String meetingLink = "";


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void setmeetingbtn(MouseEvent event) throws IOException{ 
            
            
            String meetingDate = datepickermeeting.getValue().toString();
            String meetingType = null;
            if (onlinemeetingradiobtn.isSelected()) {
                offlinemeetingradiobtn.setDisable(true);

                meetingType = "Online Meeting";
            } else {
                onlinemeetingradiobtn.setDisable(true);
                meetingType = "Offline Meeting";
            }

            try {
                String meetingLink = meetinglinkfield.getText();
            } catch (NullPointerException e) {
                // The control is null, so initialize it and get the text.
                meetinglinkfield= (TextField) FXMLLoader.load(getClass().getResource("LandbuyerSetmeetingscene.fxml"));
                meetingLink = meetinglinkfield.getText();
            }

            // Save the meeting data to a file.
            BufferedWriter writer = new BufferedWriter(new FileWriter("meeting data.bin"));
            writer.write("Meeting Date: " + meetingDate + "\n");
            writer.write("Meeting Type: " + meetingType + "\n");
            writer.write("Meeting Time: " + meetingtimefield.getText() + "\n");
            writer.write("Meeting Location: " + meetinglocationfield.getText() + "\n");
            writer.write("Meeting Link: " + meetingLink + "\n");
            writer.write("Meeting Set By: " + "Legal Advisor" + "\n");
            writer.close();
            
             String meetingData = "";
        FileInputStream fis = new FileInputStream("meeting data.bin");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        meetingData = new String(data);
        fis.close();

         savenotificationlabel.setText(meetingData);
            
            
    }

    @FXML
    private void backbtn(MouseEvent event) throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LandBuyerhomescene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    
    }
    
    
}