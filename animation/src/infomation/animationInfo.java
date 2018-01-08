/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infomation;

import java.util.Date;

/**
 *
 * @author Pawn
 */
public class animationInfo {
    private String animationName="";
    private Date startDate;
    private Date endDate;

    /**
     * @return the animationName
     */
    public String getAnimationName() {
        return animationName;
    }

    /**
     * @param animationName the animationName to set
     */
    public void setAnimationName(String animationName) {
        this.animationName = animationName;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
}
