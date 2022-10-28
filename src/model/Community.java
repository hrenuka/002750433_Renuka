/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

//import java.util.List; 
/**
 *
 * @aut hor visha_wb3uzfg
 */
public class Community extends City {

//    private HospitalDirectory hospitalDiect;
    private String communityName;

    public Community(String community, String city) {
        super(city);
        this.communityName = community;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
} 
