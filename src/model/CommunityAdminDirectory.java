/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visha_wb3uzfg
 */
public class CommunityAdminDirectory extends PersonDirectory {

    private List<CommunityAdmin> adminDirectory = new ArrayList();

    public List<CommunityAdmin> getadminDirectory() {
        return adminDirectory;
    }

    public void setPatientDirectory(List<CommunityAdmin> adminDirectory) {
        this.adminDirectory = adminDirectory;
    }

    public CommunityAdmin addAdmin(String name, int age, String userName, String password, Role role, String aptNumber, String address, String communityName, String cityName) {
        
        CommunityAdmin communityAdmin = new CommunityAdmin(name, age, userName, password, role, aptNumber, address, communityName, cityName);
        
        this.adminDirectory.add(communityAdmin);
        this.addPerson(communityAdmin);
        
        return communityAdmin;
    }

    public void removeAdmin(String username) {
        for (int i = 0; i < this.adminDirectory.size(); i++) {
            CommunityAdmin communityAdmin = this.adminDirectory.get(i);
            if (communityAdmin.getuserName().equals(username)) {
                this.adminDirectory.remove(i);
                this.removePerson(username);
                break;
            }
        }
    }

}
