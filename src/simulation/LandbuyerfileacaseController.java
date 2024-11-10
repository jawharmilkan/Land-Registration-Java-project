/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simulation;

import java.io.File;
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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sajid
 */
public class LandbuyerfileacaseController implements Initializable {

    @FXML
    private TextField casesummurytextfield;
    @FXML
    private TextField nametextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    private void backbtn(MouseEvent event) throws IOException {
        
        {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("LandBuyerhomescene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
        
    }

    @FXML
    private void sendcasebtn(MouseEvent event) throws IOException {
         File f = null;

           FileWriter fw = null;
           try {
               f = new File("Complaints.bin");

           if (f.exists()) {
               fw = new FileWriter(f, true);
           } else {
               fw = new FileWriter(f);
           }



           String str = String.format("%s,%s\n", casesummurytextfield.getText(), nametextfield.getText());


           fw.write(str);


           } catch (IOException e) {
               System.out.println("Exception : " + e);

           } finally {
               fw.close();
           }
    }
    
}
