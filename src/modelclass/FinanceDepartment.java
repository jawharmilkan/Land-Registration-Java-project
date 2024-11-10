/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TableView;
import simulation.FinanceDepartmentEmployeesPaymentController;

/**
 *
 * @author jawhar
 */
public class FinanceDepartment extends User implements Serializable{
    
    private String fcName, feesDetails, empName, empPaymentStatus;
    private String fcSalary, fcBonus;
    private String str;
    private String sector, expense, month, year;

    
    public void collectFunds(String details) throws IOException {
        feesDetails = details;
        File f =  null;
        
        FileWriter  fw = null;
        
        //unchecked exception
        
        
        try
        {
            f = new File("fcFeesCollection.txt");
        
        if(f.exists())
        {
            fw = new FileWriter(f,true); //APPEND MODE
        }
        else
        {
            fw = new FileWriter(f); //file creating
        }
        
        //file created
        
        String str = feesDetails+"\n";
        
       
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

    
    public static boolean paymentsDue(String employeeName, String paymentStatus,String sector) throws FileNotFoundException, IOException{ 
        
   
            EmployeePayment newpayment =new EmployeePayment(
                    employeeName,  
                    paymentStatus,
                    sector
            );
        
       
   File f = new File("employeespayment.bin");

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

    oos.writeObject(newpayment);
    oos.close();
    fos.close();
    
    return true;
} catch (IOException e) {
    return false;
}

    }
    

    }

    