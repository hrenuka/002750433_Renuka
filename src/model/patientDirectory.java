/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class patientDirectory {
    private ArrayList<patients> history;
    
    public patientDirectory(){
            
            this.history = new ArrayList<patients>();
    }

    public ArrayList<patients> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<patients> history) {
        this.history = history;
    }
            
}
