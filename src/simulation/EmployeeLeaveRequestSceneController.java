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
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jawhar
 */
public class EmployeeLeaveRequestSceneController implements Initializable {

    @FXML
    private TextArea messageBodyTextField;
    @FXML
    private TextField summaryTextField;
    @FXML
    private TextField nameTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendRequestButtonOnAction(ActionEvent event) throws IOException 
    {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        
        File f =  null;
        
        FileWriter  fw = null;
        
        //unchecked exception
        
        try
        {
            f = new File("execComEmpLeaveRequests.txt");
        
        if(f.exists())
        {
            fw = new FileWriter(f,true); //APPEND MODE
        }
        else
        {
            fw = new FileWriter(f); //file creating
        }
        
        //file created
        
        String str = nameTextField.getText() + "," + summaryTextField.getText() + ","+ messageBodyTextField.getText() + "\n";
        fw.write(str); 

        a.setTitle("Leave Request");
        a.setHeaderText("Send successfull");
        a.setContentText("Leave Request has been sent successfully");
        a.showAndWait();
       
        
        
        }
        catch(IOException e)
        {
            System.out.println("Exception : "+e);
            
        }
        finally
        {
            fw.close();
        }
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("employeeHomeScene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    }
    
