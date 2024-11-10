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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modelclass.Member;
import modelclass.SetMeeting;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class HRPieChartController implements Initializable {

    @FXML
    private PieChart pieChart;
    private ObservableList <PieChart.Data> list 
            = FXCollections.observableArrayList();

    /**                            
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        
        try {
            f = new File("member.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Member emp;
            try{
                //"Land Owner", "Employee", "H.R", "Finance Department", "Legal Advisor","Land Buyer"
                while(true){
                    emp = (Member)ois.readObject();
                    if(emp.getUserType().equals("H.R")) {
                        
                        a++;
                         }
                    else if(emp.getUserType().equals("Land Owner")){
                        b++;
                    }
                     else if(emp.getUserType().equals("Employee")){
                        c++;
                     }
                    else if(emp.getUserType().equals("Land Owner")){
                        d++;
                     }
                    else if(emp.getUserType().equals("Finance Department")){
                        g++;
                     }
                    else if(emp.getUserType().equals("Legal Advisor")){
                        h++;
                     }
                    else if(emp.getUserType().equals("Land Buyer")){
                        i++;
                     }
                    else if(emp.getUserType().equals("Land Registraion Administrative")){
                        j++;
                     }
                }
                

            }//end of nested try
        catch(Exception e){
                //
            }//nested catch     
                   
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
        list.add( new PieChart.Data("H.R",a) );
        list.add( new PieChart.Data("Land Owner",b) );
        list.add( new PieChart.Data("Employee",c) );
        list.add( new PieChart.Data("Land Owner",d) );
        list.add( new PieChart.Data("Finance Department",g) );
        list.add( new PieChart.Data("Legal Advisor",h) );
        list.add( new PieChart.Data("Land Buyer",i) );
        list.add( new PieChart.Data("Land Registraion Administrative",j) );
        //ObservableList <PieChart.Data> list2 = FXCollections.observableArrayList();
        //list2.add(new PieChart.Data("Java",50));
        //...
        pieChart.setData(list);
        
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, 
                    new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
            
        }
        // TODO
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
