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
public class SetMeeting implements Serializable {
    
    private String meetingLocation,meetingLink,meetingType,meetingTime,setby;
    private LocalDate meetingDate;

    public SetMeeting(String meetingLocation, String meetingLink, String meetingType, String meetingTime, String setby, LocalDate meetingDate) {
        this.meetingLocation = meetingLocation;
        this.meetingLink = meetingLink;
        this.meetingType = meetingType;
        this.meetingTime = meetingTime;
        this.setby = setby;
        this.meetingDate = meetingDate;
    }

    public SetMeeting(String meetingLocation, String meetingType, String meetingTime, String setby, LocalDate meetingDate) {
        this.meetingLocation = meetingLocation;
        this.meetingType = meetingType;
        this.meetingTime = meetingTime;
        this.setby = setby;
        this.meetingDate = meetingDate;
    }

    public String getMeetingLocation() {
        return meetingLocation;
    }

    public void setMeetingLocation(String meetingLocation) {
        this.meetingLocation = meetingLocation;
    }

    public String getMeetingLink() {
        return meetingLink;
    }

    public void setMeetingLink(String meetingLink) {
        this.meetingLink = meetingLink;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getSetby() {
        return setby;
    }

    public void setSetby(String setby) {
        this.setby = setby;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
    }

    @Override
    public String toString() {
        return  meetingDate +".";
    }
    
    
   
    

    
    
    
}
