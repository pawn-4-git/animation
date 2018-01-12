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
    List<BaseEvent> eventList=new ArrayList<>();
    int episodeNo=-1;
    
    public EpisodeInfo(int episodeNo){
        this.episodeNo=episodeNo;
    }
    
    public void add(BaseEvent baseEvent){
        eventList.add(baseEvent);
    }
}
