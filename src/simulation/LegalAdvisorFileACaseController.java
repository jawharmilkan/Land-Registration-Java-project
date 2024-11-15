/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.io.File;
import java.io.FileWriter;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author sajid
 */
public class LegalAdvisorFileACaseController implements Initializable {

    @FXML
    private TextArea caseTextArea;
    @FXML
    private TextField againstTextField;

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
    private void sendCaseButtonOnAction(ActionEvent event) throws IOException {



        File f = null;

        FileWriter fw = null;
        try {
            f = new File("Complaints.bin");

        if (f.exists()) {
            fw = new FileWriter(f, true);
        } else {
            fw = new FileWriter(f);
        }



        String str = String.format("%s,%s\n", caseTextArea.getText(), againstTextField.getText());


        fw.write(str);


        } catch (IOException e) {
            System.out.println("Exception : " + e);

        } finally {
            fw.close();
        }



        }
    
}
