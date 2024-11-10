/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simulation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sajid
 */
public class LandBuyerhomesceneController implements Initializable {
  
    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private Label infolabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Landbuyergivevotebtn(MouseEvent event) throws IOException {
        {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("LandBuyergivevotescene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
        
    }

    @FXML
    private void landbuyersignoutbtn(MouseEvent event) throws IOException {
        {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("homeScene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    }

    @FXML
    private void fileacasebtn(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Landbuyerfileacase.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    
        
    }

    @FXML
    private void landinformationbtn(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LandBuyerGetlandinfoscene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
        
        
    }

    @FXML
    private void setmeetingbtn(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LandbuyerSetmeetingscene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void getmeetinginfolabel(MouseEvent event) throws FileNotFoundException, IOException {
        
        FileInputStream fis = new FileInputStream("meeting data.bin");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        String meetingData = new String(data);
        fis.close();

        infolabel.setText(meetingData);
        
    }

    @FXML
    private void Landbuyerinformationbtn(MouseEvent event) throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Landbuyerinformationscene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
        
        
        
    }
    
   
    
    
    
    
    
    
}
