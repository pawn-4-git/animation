/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attribute;

import character.Character;

/**
 *
 * @author Pawn
 */
public class AttributeMapping {
    private Character character;
    
    private Attribute attribute;

    /**
     * @return the character
     */
    public Character getCharacter() {
        return character;
    }

    /**
     * @param character the character to set
     */
    public void setCharacter(Character character) {
        this.character = character;
    }

    /**
     * @return the attribute
     */
    public Attribute getAttribute() {
        return attribute;
    }

    /**
     * @param attribute the attribute to set
     */
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
    
    @Override
    public String toString(){
        return this.character.getName()+"は"+this.attribute.getValue()+"です";
    }
    
    
}
