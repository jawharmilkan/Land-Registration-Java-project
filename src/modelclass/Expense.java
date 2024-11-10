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

/**
 *
 * @author sindid
 */
public class Expense extends User implements Serializable {

    public static Boolean createRecord(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String sector, expense;
    
    
    public Expense(String sector, String expense) {
        this.sector = sector;
        this.expense = expense;

    }

   
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }


 
    @Override
    public String toString() {
        return "Expense{" + "sector=" + sector + ", expense=" + expense +'}';
    }
    
    
    public static boolean departmentExpense(String sector, String expense) throws FileNotFoundException, IOException {
        Expense newExpense = new Expense(sector, expense);

        File f = new File("expense.bin");

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

            oos.writeObject(newExpense);
            oos.close();
            fos.close();

            return true;
        } catch (IOException e) {
            return false;
        }
    }
} 

