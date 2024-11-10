/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simulation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import modelclass.Salary;

/**
 * FXML Controller class
 *
 * @author Unknown
 */
public class LegalAdvisorCheckSalarySceneController implements Initializable {

    @FXML
    private TableColumn<Salary, String> salaryamountcolumn;
    @FXML
    private TableColumn<Salary, String> accountnumbercolumn;
    @FXML
    private TableColumn<Salary, String> datecolumn;
    @FXML
    private TableColumn<Salary, String> paidbycolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backbtn(ActionEvent event) {
    }
    
}
