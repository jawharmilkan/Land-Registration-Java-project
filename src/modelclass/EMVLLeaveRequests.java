/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class EMVLLeaveRequests implements Serializable{
    private String id, validate;

    public EMVLLeaveRequests(String id, String validate) {
        this.id = id;
        this.validate = validate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    @Override
    public String toString() {
        return "EMVLLeaveRequests{" + "id=" + id + ", validate=" + validate + "\n";
    }
    
    
    
}
