/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class Gauge {
    private int value;
    
    public Gauge () {
        value = 0;
    }
    
    public void increase () {
        value = value + 1;
        if (value > 5) {
            value =5;
        }
    }
    
    public void decrease () {
        value = value - 1;
        if (value < 0) {
            value = 0;
        }
    }
    
    public int value() {
        return value;
    }
    
    public boolean full() {
        return this.value == 5;
    }
}
