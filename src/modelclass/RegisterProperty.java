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
public class RegisterProperty implements Serializable {

    private String landOwnerName, 
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
            registrationNumber;
    
    private int amount;
    
    private LocalDate registrationDate;

    public RegisterProperty(String landOwnerName, String landOwnerNamenid, String landOwneradress, String landOwneGender, String landOwnePhoneNumber, String landBuyerName, String landBuyerNid, String landBuyerAdress, String landBuyerGender, String landBuyerPhoneNumber, String landLocation, String landArea, String registrationNumber, int amount, LocalDate registrationDate) {
        this.landOwnerName = landOwnerName;
        this.landOwnerNamenid = landOwnerNamenid;
        this.landOwneradress = landOwneradress;
        this.landOwneGender = landOwneGender;
        this.landOwnePhoneNumber = landOwnePhoneNumber;
        this.landBuyerName = landBuyerName;
        this.landBuyerNid = landBuyerNid;
        this.landBuyerAdress = landBuyerAdress;
        this.landBuyerGender = landBuyerGender;
        this.landBuyerPhoneNumber = landBuyerPhoneNumber;
        this.landLocation = landLocation;
        this.landArea = landArea;
        this.registrationNumber = registrationNumber;
        this.amount = amount;
        this.registrationDate = registrationDate;
    }

    public String getLandOwnerName() {
        return landOwnerName;
    }

    public void setLandOwnerName(String landOwnerName) {
        this.landOwnerName = landOwnerName;
    }

    public String getLandOwnerNamenid() {
        return landOwnerNamenid;
    }

    public void setLandOwnerNamenid(String landOwnerNamenid) {
        this.landOwnerNamenid = landOwnerNamenid;
    }

    public String getLandOwneradress() {
        return landOwneradress;
    }

    public void setLandOwneradress(String landOwneradress) {
        this.landOwneradress = landOwneradress;
    }

    public String getLandOwneGender() {
        return landOwneGender;
    }

    public void setLandOwneGender(String landOwneGender) {
        this.landOwneGender = landOwneGender;
    }

    public String getLandOwnePhoneNumber() {
        return landOwnePhoneNumber;
    }

    public void setLandOwnePhoneNumber(String landOwnePhoneNumber) {
        this.landOwnePhoneNumber = landOwnePhoneNumber;
    }

    public String getLandBuyerName() {
        return landBuyerName;
    }

    public void setLandBuyerName(String landBuyerName) {
        this.landBuyerName = landBuyerName;
    }

    public String getLandBuyerNid() {
        return landBuyerNid;
    }

    public void setLandBuyerNid(String landBuyerNid) {
        this.landBuyerNid = landBuyerNid;
    }

    public String getLandBuyerAdress() {
        return landBuyerAdress;
    }

    public void setLandBuyerAdress(String landBuyerAdress) {
        this.landBuyerAdress = landBuyerAdress;
    }

    public String getLandBuyerGender() {
        return landBuyerGender;
    }

    public void setLandBuyerGender(String landBuyerGender) {
        this.landBuyerGender = landBuyerGender;
    }

    public String getLandBuyerPhoneNumber() {
        return landBuyerPhoneNumber;
    }

    public void setLandBuyerPhoneNumber(String landBuyerPhoneNumber) {
        this.landBuyerPhoneNumber = landBuyerPhoneNumber;
    }

    public String getLandLocation() {
        return landLocation;
    }

    public void setLandLocation(String landLocation) {
        this.landLocation = landLocation;
    }

    public String getLandArea() {
        return landArea;
    }

    public void setLandArea(String landArea) {
        this.landArea = landArea;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "RegisterProperty{\n" + "landOwnerName=" + landOwnerName + ", landOwnerNamenid=" + landOwnerNamenid + ", landOwneradress=" + landOwneradress + ", landOwneGender=" + landOwneGender + ", landOwnePhoneNumber=" + landOwnePhoneNumber + "\n"+ " landBuyerName=" + landBuyerName + ", landBuyerNid=" + landBuyerNid + ", landBuyerAdress=" + landBuyerAdress + ", landBuyerGender=" + landBuyerGender + ", landBuyerPhoneNumber=" + landBuyerPhoneNumber + "\n"+ " landLocation=" + landLocation + ", landArea=" + landArea + ", registrationNumber=" + registrationNumber + ", amount=" + amount + ", registrationDate=" + registrationDate + "}\n";
    }

    
    
}
