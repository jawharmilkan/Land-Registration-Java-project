/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
//import modelclass.AppendableObjectOutputStream;
//import modelclass.Member;

/**
 *
 * @author Admin
 */
public class HR implements Serializable{
        public static boolean addMember(String id, String name, String userType, float salary ,String age,  LocalDate dob, LocalDate doj) throws FileNotFoundException, IOException{
       
        Member newMember =new Member(
                    
               id, 
               name, 
               userType,
               salary,
                age, 
                 dob, 
                   doj
                      
        
        );
   File f = new File("member.bin");

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

    oos.writeObject(newMember);
    oos.close();
    fos.close();
    
    return true;
} catch (IOException e) {
    return false;
}

    }
        
        public static boolean setMeetingg(String meetingLocation, String meetingType, String meetingTime, String setby, LocalDate meetingDate)throws FileNotFoundException, IOException{
       
        SetMeeting newMeeting =new SetMeeting(
                    
               meetingLocation, 
                
                meetingType, 
                meetingTime,
                setby,
                meetingDate
                
        );
   File f = new File("meeting.bin");

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
        
        
        
    public static boolean setMeeting(String meetingLocation, String meetingLink, String meetingType, String meetingTime, String setby, LocalDate meetingDate)throws FileNotFoundException, IOException{
       
        SetMeeting newMeeting =new SetMeeting(
                    
               meetingLocation, 
               meetingLink, 
                meetingType, 
                meetingTime, 
                setby,
                meetingDate
                 
        );
   File f = new File("meeting.bin");

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
 public static boolean validateLeaveRqst1(String id, String validate)throws FileNotFoundException, IOException{
       
       
        HRVLLeaveRequests levrqst =new HRVLLeaveRequests(
                    
               id,
                validate
                 
        );
        File f = new File("HRVLLeaveRequests.bin");

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

                    oos.writeObject(levrqst);
                    oos.close();
                    fos.close();

                    return true;
                } catch (IOException e) {
                    return false;
                }
            
        
 }
 
 
 public static boolean validateLeaveRqst2(String id, String validate)throws FileNotFoundException, IOException{
       
        LOVLLeaveRequests levrqst =new LOVLLeaveRequests(
                    
               id,
                validate
                 
        );
        File f = new File("LOVLLeaveRequests.bin");

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

                    oos.writeObject(levrqst);
                    oos.close();
                    fos.close();

                    return true;
                } catch (IOException e) {
                    return false;
                }
            
        
 }
 
 
 public static boolean validateLeaveRqst3(String id, String validate)throws FileNotFoundException, IOException{
       
        EMVLLeaveRequests levrqst =new EMVLLeaveRequests(
                    
               id,
                validate
                 
        );
        File f = new File("EMVLLeaveRequests.bin");

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

                    oos.writeObject(levrqst);
                    oos.close();
                    fos.close();

                    return true;
                } catch (IOException e) {
                    return false;
                }
            
        
 }
 

 public static boolean validateLeaveRqst4(String id, String validate)throws FileNotFoundException, IOException{
       
        FDVLLeaveRequests levrqst =new FDVLLeaveRequests(
                    
               id,
                validate
                 
        );
        File f = new File("FDVLLeaveRequests.bin");

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

                    oos.writeObject(levrqst);
                    oos.close();
                    fos.close();

                    return true;
                } catch (IOException e) {
                    return false;
                }
            
        
 }

 public static boolean validateLeaveRqst5(String id, String validate)throws FileNotFoundException, IOException{
       
        LAVLLeaveRequests levrqst =new LAVLLeaveRequests(
                    
               id,
                validate
                 
        );
        File f = new File("LAVLLeaveRequests.bin");

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

                    oos.writeObject(levrqst);
                    oos.close();
                    fos.close();

                    return true;
                } catch (IOException e) {
                    return false;
                }
            
        
 }

 public static boolean validateLeaveRqst6(String id, String validate)throws FileNotFoundException, IOException{
       
        LBVLLeaveRequests levrqst =new LBVLLeaveRequests(
                    
               id,
                validate
                 
        );
        File f = new File("LBVLLeaveRequests.bin");

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

                    oos.writeObject(levrqst);
                    oos.close();
                    fos.close();

                    return true;
                } catch (IOException e) {
                    return false;
                }
            
        
 }
    
 public static boolean validateLeaveRqst7(String id, String validate)throws FileNotFoundException, IOException{
       
        LRAVLLeaveRequests levrqst =new LRAVLLeaveRequests(
                    
               id,
                validate
                 
        );
        File f = new File("LRAVLLeaveRequests.bin");

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

                    oos.writeObject(levrqst);
                    oos.close();
                    fos.close();

                    return true;
                } catch (IOException e) {
                    return false;
                }
            
        
 }
 
 
}
    
  
    
    


