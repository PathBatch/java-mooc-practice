/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class Song {
    private String name;
    private int length;
    
    public Song (String initialName, int initialLength) {
        name = initialName;
        length = initialLength;
    }
    
    public String name() {
        return name;
    }
    
    public int length () {
        return length;
    }
    
}
