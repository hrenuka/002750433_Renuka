/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class House extends Community{
    
    private String street;
    private String aptNumber;

    public House(String street, String aptNumber, String community, String city) {
        super(community, city);
        this.street = street;
        this.aptNumber = aptNumber;
    }
    
    
    
}
