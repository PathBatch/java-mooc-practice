/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class Timer {
    private ClockHand hundrethsOfSecond;
    private ClockHand seconds;
    
    public Timer () {
        this.hundrethsOfSecond = new ClockHand (100);
        this.seconds = new ClockHand(60);
    }
    
    
    public void advance() {
        hundrethsOfSecond.advance();
        if (hundrethsOfSecond.value() == 0) {
            seconds.advance();
        }
    }
    
    public String toString() {
        return seconds + ":" + hundrethsOfSecond;
    }
    
}
