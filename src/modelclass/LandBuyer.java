package modelclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class LandBuyer extends User implements Serializable{
    private String landId, landPrice, landLocation, landArea, landStatus;

    public void viewLandDetails(TextField landIdTextField, TextField landPriceTextField, TextField landLocationTextField, TextField landAreaTextField, TextField landStatusTextField) throws IOException {
        File f = null;
        Scanner sc  = null;
        
        String str; String[] tokens = null;
        
        try
        {
            f = new File("landDetails.txt");
            
            sc = new Scanner(f);
            
            if(f.exists())
            {
                
                while(sc.hasNextLine())
                {
                   str = sc.nextLine();
                  
                    
                  tokens  = str.split(",");
                  
                 
                    
                    
                }
                landId = tokens[0];
                landPrice = tokens[1];
                landLocation = tokens[2];
                landArea = tokens[3];
                landStatus = tokens[4];
                
                 landIdTextField.setText(landId);
                 landPriceTextField.setText(landPrice);
                 landLocationTextField.setText(landLocation);
                 landAreaTextField.setText(landArea);
                 landStatusTextField.setText(landStatus);
                 
                
                
                
                
            }
            
            
             
            
            
            
        }
        catch(Exception e)
        {
            System.out.println("Exception  : "+e);
        }
        finally{
            sc.close();
        }
        
        
    }

    public void purchaseLand(String landId) throws IOException {
        landStatus = "Sold";
        File f =  null;
        
        FileWriter  fw = null;
        
        //unchecked exception
        
        try
        {
            f = new File("landDetails.txt");
        
        if(f.exists())
        {
            fw = new FileWriter(f,true); //APPEND MODE
        }
        else
        {
            fw = new FileWriter(f); //file creating
        }
        
        //file created
        
        String str = landId+","+landStatus+"\n";
        fw.write(str); 

        
        
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
public static boolean landbuyergetinfo(String name, String gender, String age, String nid, String phone, String address)throws FileNotFoundException, IOException{
       
        Landbuyerinformation landbuyerinfo =new Landbuyerinformation(
                      
                  name,gender,age,nid,phone,address
                );
   File f = new File("Landbuyerinfo.bin");

try {
    FileOutputStream fos;
    ObjectOutputStream oos;

    if (f.exists()) {
        fos = new FileOutputStream(f, true); // Append mode
        oos = new AppendableObjectOutputStream(fos);
    } else {
        fos = new FileOutputStream(f);
        oos = new ObjectOutputStream(fos);
    }

    oos.writeObject(landbuyerinfo);
    oos.close();
    fos.close();
    
    return true;
} catch (IOException e) {
    return false;
}

 }

}


    
    
    
