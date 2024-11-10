/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modelclass.LandBuyer;
import modelclass.Landbuyerinformation;

/**
 * FXML Controller class
 *
 * @author sajid
 */
public class LandbuyerinformationsceneController implements Initializable {

    @FXML
    private TextField gender;
    @FXML
    private TextField address;
    @FXML
    private TextField namefield;
    @FXML
    private TextField nid;
    @FXML
    private TextField age;
    @FXML
    private TextField phone;
    @FXML
    private TextArea outputtextarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void infosavebtn(MouseEvent event) throws IOException {
        Boolean add= 
                LandBuyer.landbuyergetinfo(
                        
                        namefield.getText(),
                        gender.getText(),
                        age.getText(),
                        nid.getText(),
                        phone.getText(),
                        address.getText()
                        
                        
                        

                );


        if(add){

            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Member Added Sucussfully");
            a.showAndWait();
        }
        else{

            Alert a =new Alert(Alert.AlertType.ERROR);
            a.setContentText("Error");
            a.showAndWait();
        
    }
        
    }

    @FXML
    private void showbtn(MouseEvent event) {
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("Landbuyerinfo.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Landbuyerinformation emp;
            try{
                outputtextarea.setText("");
                while(true){
                    emp = (Landbuyerinformation)ois.readObject();
                    
                    outputtextarea.appendText(emp.toString());
                }
            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
            outputtextarea.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
        
        
        
    }

    @FXML
    private void backbtn(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LandBuyerhomescene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
        
        
        
    }
    
    
    
}
