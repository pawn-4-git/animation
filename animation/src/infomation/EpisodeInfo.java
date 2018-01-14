/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infomation;

import event.BaseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawn
 */
public class EpisodeInfo {
    private List<BaseEvent> eventList=new ArrayList<>();
    private int episodeNo=-1;
    
    private Music oping;
    
    private Music ending;
    
    public EpisodeInfo(int episodeNo){
        this.episodeNo=episodeNo;
    }
    
    public void add(BaseEvent baseEvent){
        getEventList().add(baseEvent);
    }

    /**
     * @return the eventList
     */
    public List<BaseEvent> getEventList() {
        return eventList;
    }

    /**
     * @param eventList the eventList to set
     */
    public void setEventList(List<BaseEvent> eventList) {
        this.eventList = eventList;
    }

    /**
     * @return the episodeNo
     */
    public int getEpisodeNo() {
        return episodeNo;
    }

    /**
     * @param episodeNo the episodeNo to set
     */
    public void setEpisodeNo(int episodeNo) {
        this.episodeNo = episodeNo;
    }

    /**
     * @return the oping
     */
    public Music getOping() {
        return oping;
    }

    /**
     * @param oping the oping to set
     */
    public void setOping(Music oping) {
        this.oping = oping;
    }

    /**
     * @return the ending
     */
    public Music getEnding() {
        return ending;
    }

    /**
     * @param ending the ending to set
     */
    public void setEnding(Music ending) {
        this.ending = ending;
    }
    
    
}
