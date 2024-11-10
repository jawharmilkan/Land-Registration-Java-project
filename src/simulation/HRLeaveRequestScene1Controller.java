/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simulation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class HRLeaveRequestScene1Controller implements Initializable {

    @FXML
    private BorderPane borderPanefxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sentLeaveRequestscene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hRLeaveRequest.fxml"));
        
        borderPanefxid.setCenter(root);
    }

    @FXML
    private void checkLeaveRequestscene(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("hRCheckLeaveRequest.fxml"));
        
        borderPanefxid.setCenter(root);
    }
    
}
