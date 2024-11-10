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
import java.io.Serializable;

/**
 *
 * @author sindid
 */
public class Salary extends User implements Serializable
{
    
    private String name; 
    private String salary, bonusAmount;

    public Salary(String name, String salary, String bonusAmount) {
        this.name = name;
        this.salary = salary;
        this.bonusAmount = bonusAmount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(String bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    @Override
    public String toString() {
        return "Salary{" + "name=" + name + ", salary=" + salary + ", bonusAmount=" + bonusAmount + '}';
    }
     
    public static boolean arrangeSalary(String name, String salary, String bonusAmount) throws FileNotFoundException, IOException {
        Salary newSalary = new Salary(name, salary, bonusAmount);

        File f = new File("salary.bin");

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

            oos.writeObject(newSalary);
            oos.close();
            fos.close();

            return true;
        } catch (IOException e) {
            return false;
        }
    }
} 


    
    

