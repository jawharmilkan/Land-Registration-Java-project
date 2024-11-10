/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author jawhar
 */
public class Record {
    private String date, description, expense;

    public Record(String date, String description, String expense) {
        this.date = date;
        this.description = description;
        this.expense = expense;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpenses() {
        return expense;
    }

    public void setExpenses(String expense) {
        this.expense = expense;
    }

    @Override
    public String toString() {
        return date + "," + description + "," + expense + "\n";
    }
    
    
    public static boolean saveRecord(String date, String description, String expense) throws FileNotFoundException, IOException {
        Record newRecord = new Record(date, description, expense);

        File f = new File("record.bin");

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

            oos.writeObject(newRecord);
            oos.close();
            fos.close();

            return true;
        } catch (IOException e) {
            return false;
        }
    }
} 


    
    


    
    
    

