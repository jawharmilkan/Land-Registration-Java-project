/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
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

import modelclass.Landinformation;

/**
 * FXML Controller class
 *
 * @author sajid
 */
public class LandBuyerGetlandinfosceneController implements Initializable {

    @FXML
    private TableView<Landinformation> LandinformationTableView;
    
    @FXML
    private TableColumn<Landinformation, String> LandinformationTableColumn;
    @FXML
    private TableColumn<Landinformation, String> LandinformationtypeTableColumn;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LandinformationTableColumn.setCellValueFactory(new PropertyValueFactory<Landinformation, String>("Land information"));

        LandinformationtypeTableColumn.setCellValueFactory(new PropertyValueFactory<Landinformation, String>("Land information type"));

        

        LandinformationTableView.setItems(getLandinformation());
    }    

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LandBuyerhomescene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
        
    }

    private ObservableList<Landinformation> getLandinformation() {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        ObservableList<Landinformation> LandinformationList = FXCollections.observableArrayList();

        File f = null;

        Scanner sc = null;
        String str;
        String[] tokens;
        try {
            f = new File("Land information.bin");
            sc = new Scanner(f);
            if (f.exists()) {

                while (sc.hasNextLine()) {
                    str = sc.nextLine();
                    tokens = str.split(",");

                    LandinformationList.add(new Landinformation(tokens[0], tokens[1]));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            sc.close();

        }

        return LandinformationList;

    }

    

    
}
