/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawn
 */
public class Human extends Character{
    private SexEnum sex;
    
    private List<Human> brother;
    private List<Human> sister;
    private List<Human> children;
    private Human mother;
    private Human father;
    private Human spouse;
    private boolean existence;
    private List<String> characteristics;
    
    public Human(String name,SexEnum sex){
        setName(name);
        this.sex=sex;
    }

    /**
     * @return the sex
     */
    public SexEnum getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    /**
     * @return the brother
     */
    public List<Human> getBrother() {
        return brother;
    }

    /**
     * @param brother the brother to set
     */
    public void setBrother(List<Human> brother) {
        this.brother = brother;
    }

    /**
     * @return the sister
     */
    public List<Human> getSister() {
        return sister;
    }

    /**
     * @param sister the sister to set
     */
    public void setSister(List<Human> sister) {
        this.sister = sister;
    }

    /**
     * @return the mother
     */
    public Human getMother() {
        return mother;
    }

    /**
     * @param mother the mother to set
     */
    public void setMother(Human mother) {
        this.mother = mother;
    }

    /**
     * @return the father
     */
    public Human getFather() {
        return father;
    }

    /**
     * @param father the father to set
     */
    public void setFather(Human father) {
        this.father = father;
    }

    /**
     * @return the spouse
     */
    public Human getSpouse() {
        return spouse;
    }

    /**
     * @param spouse the spouse to set
     */
    public void setSpouse(Human spouse) {
        this.spouse = spouse;
    }

    /**
     * @return the existence
     */
    public boolean isExistence() {
        return existence;
    }

    /**
     * @param existence the existence to set
     */
    public void setExistence(boolean existence) {
        this.existence = existence;
    }

    /**
     * @return the characteristics
     */
    public List<String> getCharacteristics() {
        return characteristics;
    }

    /**
     * @param characteristics the characteristics to set
     */
    public void setCharacteristics(List<String> characteristics) {
        this.characteristics = characteristics;
    }
    
    public void addcharacteristic(String text){
        if(this.characteristics==null){
            this.characteristics=new ArrayList<>();
        }
        this.characteristics.add(text);
    }
    public String outputcharacteristic(){
        StringBuilder sb=new StringBuilder();
        this.characteristics.stream().forEach((characteristic) -> {
            sb.append(characteristic);
        });
        
        return sb.toString();
    }
    
    public void addSister(Human addSister){
        if(this.sister==null){
            this.sister=new ArrayList<>();
        }
        for(Human s:this.sister){
            if(s.equals(addSister)){
                return;
            }
        }
        this.sister.add(addSister);
    }

    
    public void addBrother(Human addBrother){
        
        if(this.sister==null){
            this.sister=new ArrayList<>();
        }
        for(Human s:this.sister){
            if(s.equals(addBrother)){
                return;
            }
        }
        this.sister.add(addBrother);
        
    }
    
     public void addChildren(Human addCildren){
        if(this.children==null){
            this.children=new ArrayList<>();
        }
        for(Human c:this.children){
            if(c.equals(addCildren)){
                return;
            }
        }
        //子供生まれると子供には親が必要なので追加する
        if(this.sex==SexEnum.Man){
            addCildren.setFather(this);
            addCildren.setMother(this.spouse);
        }else if(this.sex==SexEnum.Woman){
            addCildren.setMother(this);
            addCildren.setFather(this.spouse);
        }
        if(this.children!=null&&this.children.size()>1){
            //子供がいる場合子供の兄弟姉妹を追加する
            this.getChildren().stream().map((child) -> {
                if(addCildren.getSex()==SexEnum.Man){
                    child.addBrother(addCildren);
                }
                return child;
            }).map((child) -> {
                if(addCildren.getSex()==SexEnum.Woman){
                    child.addSister(addCildren);
                }
                return child;
            }).map((child) -> {
                if(child.getSex()==SexEnum.Man){
                    addCildren.addBrother(child);
                }
                return child;
            }).filter((child) -> (child.getSex()==SexEnum.Woman)).forEach((child) -> {
                addCildren.addSister(child);
            });
        }
        this.children.add(addCildren);
    }

    /**
     * @return the children
     */
    public List<Human> getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(List<Human> children) {
        this.children = children;
    }
    
    
}
