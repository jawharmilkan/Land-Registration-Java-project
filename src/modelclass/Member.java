/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Member  implements Serializable{
    private String id;
    private String name,age,userType;
    private LocalDate dob,doj;
    private float salary;

    public Member(String id, String name,String userType, float salary ,String age,  LocalDate dob, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.userType =userType;
        this.salary = salary;
        this.age = age;
        this.dob = dob;
        this.doj = doj;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", name=" + name + ", userType=" + userType + ", age=" + age +   ", dob=" + dob + ", doj=" + doj + ", salary=" + salary + ")\n\n";
    }
    
    
    
    

   

    

    


}
