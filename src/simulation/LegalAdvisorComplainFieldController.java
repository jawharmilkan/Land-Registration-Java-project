/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelclass.Case;

/**
 * FXML Controller class
 *
 * @author sajid
 */
public class LegalAdvisorComplainFieldController implements Initializable {

    @FXML
    private TableView<Case> complainfieldtable;
    @FXML
    private TableColumn<Case, String> complainsummarycolumn;
    @FXML
    private TableColumn<Case, String> complainnamecolumn;

    /**
     * Initializes the controller class.
     */
   
    public void initialize(URL url, ResourceBundle rb) {
            complainsummarycolumn.setCellValueFactory(new PropertyValueFactory<Case, String>("Summary"));
           complainnamecolumn.setCellValueFactory(new PropertyValueFactory<Case, String>("Name"));
            complainfieldtable.setItems(getcomplaindata());
        
        
     
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

    private ObservableList<Case> getcomplaindata() {
      ObservableList<Case> list = FXCollections.observableArrayList();

            File f = new File("Cases.txt");
            Scanner sc = null;
            try {
                sc = new Scanner(f);
                if (f.exists()) {

                    while (sc.hasNextLine()) {
                        String str = sc.nextLine();
                        String[] tokens = str.split(",");

                      //  list.add(new Complain(tokens[0], tokens[1]));
                    }
                }
            } catch (IOException ex) {
                System.out.println(ex);
            } finally {
                if (sc != null) {
                    sc.close();
                }
            }

        return list;
    }


   



    
}
