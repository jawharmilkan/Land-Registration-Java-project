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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelclass.LandBuyer;
import modelclass.LandOwnerinformation;
import modelclass.Land_Registraion_Administrative;
import modelclass.Landbuyerinformation;
import modelclass.Member;
import modelclass.RegisterProperty;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class LandRegisterPropertyController implements Initializable {

    @FXML
    private TextField landOwnerNIDTextField;
    @FXML
    private TextField landBuyerNIDTextField;
    @FXML
    private TextField landRegistrationNumTextField;
    @FXML
    private DatePicker landRegistrationDatePicker;
    @FXML
    private TextField landAreaTextField;
    @FXML
    private TextArea showTextArea;
    @FXML
    private ComboBox<String> landLocationCombo;
    @FXML
    private TextField amountTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        landLocationCombo.getItems().addAll("Dhaka", "Chitagong", "Cumillah", "Rangpurt", "Barisal");
        // TODO
    }   
    @FXML
    private void registerButtonOnAction(ActionEvent event) throws IOException {
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String lonid ="";
        String loname="";
        String loadress="";
        String logender="";
        String lophonenum="";
        
        String lbnid ="";
        String lbname="";
        String lbadress="";
        String lbgender="";
        String lbphonenum="";
        int i= 0;
        int j=0;
        
        
        
        
        try {
            f = new File("LandOwnerrinfo.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            LandOwnerinformation emp;
            try{
                
                while(true){
                    emp = (LandOwnerinformation)ois.readObject();
                    if(emp.getNid().equals(landOwnerNIDTextField.getText())) {
                        
                        lonid =lbnid+emp.getNid();
                        
                        loname=lbname+emp.getName();
                        loadress=lbadress + emp.getAddress();
                        logender=lbgender+emp.getGender();
                        lophonenum = lbphonenum + emp.getPhone();
      
                        j++;
                        
                    } 
                }
                

            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
                   
        }
        catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
        if(j!=1){
            Alert a =new Alert(Alert.AlertType.ERROR);
            a.setContentText("Wrong Land Owner NID.");
            a.showAndWait();
        }
        
        try {
            f = new File("Landbuyerinfo.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Landbuyerinformation emp;
            try{
                
                while(true){
                    emp = (Landbuyerinformation)ois.readObject();
                    if(emp.getNid().equals(landBuyerNIDTextField.getText())) {
                        
                        lbnid =lbnid+emp.getNid();
                        
                        lbname=lbname+emp.getName();
                        lbadress=lbadress + emp.getAddress();
                        lbgender=lbgender+emp.getGender();
                        lbphonenum = lbphonenum + emp.getPhone();
      
                        i++;
                        
                    } 
                }
                

            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
                   
        }
        catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        if(i!=1){
            Alert a =new Alert(Alert.AlertType.ERROR);
            a.setContentText("Wrong Land Buyer NID.");
            a.showAndWait();
        }
        
        boolean add=  
                Land_Registraion_Administrative.Register(
                loname, 
                lonid,
                loadress,
                logender,
                lophonenum,
                lbname, 
                lbnid,
                lbadress,
                lbgender,
                lbphonenum,
                landLocationCombo.getValue(),
                landAreaTextField.getText(),
                landRegistrationNumTextField.getText(),
                Integer.parseInt(amountTextField.getText()),
                landRegistrationDatePicker.getValue()
                
                
        );
        if(add){

            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Registerd ");
            a.showAndWait();
        }
        else{

            Alert a =new Alert(Alert.AlertType.ERROR);
            a.setContentText("Error");
            a.showAndWait();
        
    }
    }

    @FXML
    private void saveButtonOnAction(ActionEvent event) {
        showTextArea.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("Register.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            RegisterProperty emp;
            try{
                showTextArea.setText("");
                while(true){
                    emp = (RegisterProperty)ois.readObject();
                    
                    showTextArea.appendText(emp.toString());
                }
            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
            showTextArea.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }                  
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("hRHomeScene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    
    
}
