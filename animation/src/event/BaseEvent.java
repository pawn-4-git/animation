/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import java.util.Date;

/**
 *
 * @author Pawn
 */
public class BaseEvent {
    private String eventinfo="";
    private Date eventTime;

    /**
     * @return the eventinfo
     */
    public String getEventinfo() {
        return eventinfo;
    }

    /**
     * @param eventinfo the eventinfo to set
     */
    public void setEventinfo(String eventinfo) {
        this.eventinfo = eventinfo;
    }

    /**
     * @return the eventTime
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * @param eventTime the eventTime to set
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }
    
    
    
}
