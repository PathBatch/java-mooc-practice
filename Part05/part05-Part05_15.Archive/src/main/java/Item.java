/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    } 
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (compared == null || getClass() != compared.getClass()) {
            return false;
        }
        Item compare = (Item) compared;
        if (this.identifier.equals(compare.identifier)) {
            return true;
        }
        return false;
    }
}
