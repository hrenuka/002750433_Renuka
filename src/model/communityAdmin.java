/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class CommunityAdmin extends Person{
    
    private int id;
//    private Community community;

    public CommunityAdmin(String name, int age, String userName, String password, Role role, String aptNumber, String address, String communityName, String cityName) {
        super(name, age, userName, password, role, aptNumber, address, communityName, cityName);
//        this.community = community;
    }
    
    

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    
    
}
