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
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelclass.Member;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class HRUserInformationController implements Initializable {

    @FXML
    private TableView<Member> memberTableView;
    @FXML
    private TableColumn<Member, String> idTableCol;
    @FXML
    private TableColumn<Member, String> nameTableCol;
    @FXML
    private TableColumn<Member, String> ageTableCol;
    @FXML
    private TableColumn<Member, String> salaryTableCol;
    @FXML
    private TableColumn<Member, String> dobTableCol;
    @FXML
    private TableColumn<Member, String>dojTableCol;
    @FXML
    private TableColumn<Member, String> userTypeTableCol;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idTableCol.setCellValueFactory(new PropertyValueFactory <Member, String>("id"));
        nameTableCol.setCellValueFactory(new PropertyValueFactory <Member, String>("name"));
        userTypeTableCol.setCellValueFactory(new PropertyValueFactory <Member, String>("userType"));
        ageTableCol.setCellValueFactory(new PropertyValueFactory <Member, String>("age"));
        salaryTableCol.setCellValueFactory(new PropertyValueFactory <Member, String>("salary"));
        dobTableCol.setCellValueFactory(new PropertyValueFactory <Member, String>("dob"));
        dojTableCol.setCellValueFactory(new PropertyValueFactory <Member, String>("doj"));
        
       // memberTableView.setItems(getComplaints());
        // TODO
    }    

    @FXML
    private void backButtonOnAction(ActionEvent event) {
    }
    
    
   
    }
    
    
    
    
    
    
    
    
    
    
    
        

