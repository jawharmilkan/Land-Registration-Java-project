/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.io.Serializable;

/**
 *
 * @author sindid
 */
public class EmployeePayment extends User implements Serializable{

   
    private String employeeName, paymentStatus,sector;
   


    public EmployeePayment(String employeeName, String paymentStatus, String sector) {
        this.employeeName = employeeName;
        this.paymentStatus = paymentStatus;
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }


    public void setSector(String sector) {
        this.sector = sector;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "EmployeePayment{" + "employeeName=" + employeeName + ", paymentStatus=" + paymentStatus +",sector=" + sector + '}';
    }

    public void submitReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
