/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infomation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pawn
 */
public abstract class AnimationInfo {
    private String animationName="";
    private Date startDate;
    private Date endDate;
    private List<EpisodeInfo> episodeInfoList=new ArrayList<>();
    
    SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");

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
    
    public void setStartDate(String yyyymmdd){
        try {
            this.startDate= sdf.parse(yyyymmdd);
        } catch (ParseException ex) {
            Logger.getLogger(AnimationInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    public void setEndDate(String yyyymmdd){
        try {
            this.endDate= sdf.parse(yyyymmdd);
        } catch (ParseException ex) {
            Logger.getLogger(AnimationInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public abstract void doSettingEpisode();
    
    public void addEpisode(EpisodeInfo episodeInfo){
        this.episodeInfoList.add(episodeInfo);
    }
    
    
}
