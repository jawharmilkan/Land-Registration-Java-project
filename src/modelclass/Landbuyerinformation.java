/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

import java.io.Serializable;

/**
 *
 * @author Unknown
 */
public class Landbuyerinformation implements Serializable{
    private String name,gender,age,nid,phone,address;

    public Landbuyerinformation(String name, String gender, String age, String nid, String phone, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nid = nid;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getNid() {
        return nid;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Landbuyerinformation{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", nid=" + nid + ", phone=" + phone + ", address=" + address + '}';
    }
    
    
}
