/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Land_Registraion_Administrative implements Serializable {
    
    
   //String landOwnerName, String landOwnerNamenid, String landOwneradress, String landOwneGender, String landOwnePhoneNumber, String landBuyerName, String landBuyerNid, String landBuyerAdress, String landBuyerGender, String landBuyerPhoneNumber, String landLocation, String landArea, String registrationNumber, int amount, LocalDate registrationDate
    
    public static boolean Register(String landOwnerName, String landOwnerNamenid, String landOwneradress, String landOwneGender, String landOwnePhoneNumber, String landBuyerName, String landBuyerNid, String landBuyerAdress, String landBuyerGender, String landBuyerPhoneNumber, String landLocation, String landArea, String registrationNumber, int amount, LocalDate registrationDate)throws FileNotFoundException, IOException{
       
        RegisterProperty newMeeting =new RegisterProperty(
                    
            landOwnerName, 
            landOwnerNamenid, 
            landOwneradress ,
            landOwneGender,
            landOwnePhoneNumber,
            landBuyerName,
            landBuyerNid,
            landBuyerAdress,
            landBuyerGender,
            landBuyerPhoneNumber,
            landLocation,
            landArea,
            registrationNumber,
            amount,
            registrationDate
        );
   File f = new File("Register.bin");

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

    oos.writeObject(newMeeting);
    oos.close();
    fos.close();
    
    return true;
} catch (IOException e) {
    return false;
}

    }
    
public static boolean leaverequestsender(String id, String summary, String body)throws FileNotFoundException, IOException{
       
        LeaveRequest leaverequ =new LeaveRequest(
                     
                id,
                summary,
                body 
                );
   File f = new File("LeaveRequests.bin");

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

    oos.writeObject(leaverequ);
    oos.close();
    fos.close();
    
    return true;
} catch (IOException e) {
    return false;
}

 }    
    
}
