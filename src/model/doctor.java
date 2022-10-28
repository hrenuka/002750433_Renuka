/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class Doctor extends Person {
    
    private int id;
    private Hospital hospital;

    public Doctor(String name, int age, String username, String password, Role role, String address, String aptNo, String communityName, String cityName) {
        super(name, age, username, password, role, aptNo,  address, communityName, cityName);
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
    
    public void enterRecord(){
        
       
        
    }
    
}
