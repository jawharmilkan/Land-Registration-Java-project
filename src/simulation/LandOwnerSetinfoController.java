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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modelclass.LandBuyer;
import modelclass.LandOwner;
import modelclass.LandOwnerinformation;
import modelclass.Landbuyerinformation;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class LandOwnerSetinfoController implements Initializable {

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
    private TextArea outputtextarea;
    @FXML
    private TextField registrationNumberTextField;
    @FXML
    private DatePicker registrationDateDatePicker;
    @FXML
    private ComboBox<String> landLocationCombo;
    @FXML
    private TextArea landAreaTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        landLocationCombo.getItems().addAll("Dhaka", "Chitagong", "Cumillah", "Rangpurt", "Barisal");
        // TODO
    }    
//String name, String gender, String age, String nid, String phone, String address, String registrationNumber, String landArea, String landLocation, LocalDate registrationDate
    @FXML
    private void infosavebtn(MouseEvent event) throws IOException {
        Boolean add= 
                LandOwner.landownergetinfo(
                        
                        namefield.getText(),
                        gender.getText(),
                        age.getText(),
                        nid.getText(),
                        phone.getText(),
                        address.getText(),
                        registrationNumberTextField.getText(),
                        landAreaTextArea.getText(),
                        landLocationCombo.getValue(),
                        registrationDateDatePicker.getValue()
                        
                        
                        

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
    private void backbutton(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("landOwnerHomeScene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    
}
