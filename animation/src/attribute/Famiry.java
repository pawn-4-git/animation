/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attribute;

/**
 *
 * @author Pawn
 */
public enum Famiry implements Attribute{
    Father("父親"),Mother("母親"),BBBrother("兄弟"),SSSister("姉妹"),BSBrother("兄妹"),
    SBSister("姉弟"),LBrother("兄"),YBrother("弟"),LSisther("姉"),YSisther("妹");
    private String value;
    
    private Famiry(String value){
        this.value=value;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    
}
