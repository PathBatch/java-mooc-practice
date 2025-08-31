/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */

import java.util.ArrayList;
        
public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.stack.size()== 0;
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public String take() {
        if (this.stack.isEmpty()) {
            return null;
        }
        return this.stack.remove(this.stack.size() - 1);
    }
    
    public ArrayList<String> values() {
        ArrayList<String> reversed = new ArrayList<>();
        for (int i = this.stack.size() -1; i >= 0; i--) {
            reversed.add(this.stack.get(i));
        }
        return reversed;
    }
    
}
