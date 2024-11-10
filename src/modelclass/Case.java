/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Unknown
 */
public class Case {
    private String Name;
    private String Summary;

    public Case(String Name, String Summary) {
        this.Name = Name;
        this.Summary = Summary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Case{");
        sb.append("Name=").append(Name);
        sb.append(", Summary=").append(Summary);
        sb.append('}');
        return sb.toString();
    }
    
    
}
