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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelclass.LegalAdvisor;

/**
 * FXML Controller class
 *
 * @author sajid
 */
public class LegalAdvisorComplainProgressController implements Initializable {

    @FXML
    private TextField complainidTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("legalAdvisorHomeScene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }


    @FXML
    private void seeProgressButtonOnAction(ActionEvent event) {
        LegalAdvisor h = new LegalAdvisor();
        String complainID = complainidTextField.getText();
        h.seeProgress(complainID);
        
    }
    
}
