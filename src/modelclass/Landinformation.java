/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;


public class Landinformation {

    private String Landinformation, Landinformationtype;

    public Landinformation(String Landinformation, String Landinformationtype) {
        this.Landinformation = Landinformation;
        this.Landinformationtype = Landinformationtype;
    }

    public String getLandinformation() {
        return Landinformation;
    }

    public String getLandinformationtype() {
        return Landinformationtype;
    }

    public void setLandinformation(String Landinformation) {
        this.Landinformation = Landinformation;
    }

    public void setLandinformationtype(String Landinformationtype) {
        this.Landinformationtype = Landinformationtype;
    }

    @Override
    public String toString() {
        return "Landinformation{" + "Landinformation=" + Landinformation + ", Landinformationtype=" + Landinformationtype + '}';
    }

    
    
    
    
}
