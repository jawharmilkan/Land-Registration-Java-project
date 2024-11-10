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
public class LandOwnerinformation implements Serializable{
    private String name,gender,age,nid,phone,address,registrationNumber,landArea,landLocation;
    private LocalDate registrationDate;

    public LandOwnerinformation(String name, String gender, String age, String nid, String phone, String address, String registrationNumber, String landArea, String landLocation, LocalDate registrationDate) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nid = nid;
        this.phone = phone;
        this.address = address;
        this.registrationNumber = registrationNumber;
        this.landArea = landArea;
        this.landLocation = landLocation;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getLandArea() {
        return landArea;
    }

    public void setLandArea(String landArea) {
        this.landArea = landArea;
    }

    public String getLandLocation() {
        return landLocation;
    }

    public void setLandLocation(String landLocation) {
        this.landLocation = landLocation;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "LandOwnerinformation{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", nid=" + nid + ", phone=" + phone + ", address=" + address + ", registrationNumber=" + registrationNumber + ", landArea=" + landArea + ", landLocation=" + landLocation + ", registrationDate=" + registrationDate + '}';
    }

    
    
}
