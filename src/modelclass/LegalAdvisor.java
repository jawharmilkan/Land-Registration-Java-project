/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javafx.scene.control.Alert;

/**
 *
 * @author sajid
 */
public class LegalAdvisor extends User implements Serializable{

    private String complainID,meetingDate, meetingType, meetingTime, meetingLocation, meetingLink, meetingSetBy;
    public void seeProgress(String id) {
        this.complainID = id;
        Alert a = new Alert(Alert.AlertType.INFORMATION);
         a.setTitle("Complain");
         a.setHeaderText("Progress");
         a.setContentText("Complain "+ complainID+ " is going good");
         a.showAndWait();
    }

    public void setEmergencyMeeting(String date, String type, String time, String location, String link, String setBy) throws IOException {
        meetingDate = date;
        meetingType = type;
        meetingTime = time;
        meetingLocation = location;
        meetingLink = link;
        meetingSetBy = setBy;
        
        File f =  null;
        
        FileWriter  fw = null;
		
        String str = null;
        
        //unchecked exception
        
        
        try
        {
            f = new File("execComGmHrMeetingInfo.txt");
        
        if(f.exists())
        {
            fw = new FileWriter(f,true); //APPEND MODE
        }
        else
        {
            fw = new FileWriter(f); //file creating
        }
        
        //file created
        
        
            str =meetingDate+","+meetingType+","+meetingTime+","
                       +meetingLocation+","+meetingLink+","+meetingSetBy+"\n";
        
       
        
       
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
    
    //leaverequestsender
    
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

public static boolean complainfiler(String id, String summary, String body)throws FileNotFoundException, IOException{
       
        Complain leaverequ =new Complain(
                     
                id,
                summary,
                body);
   File f = new File("Complain.bin");

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
       
       
    
    

