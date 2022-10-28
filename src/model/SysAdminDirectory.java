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
public class SysAdminDirectory extends PersonDirectory {

    List<Person> sysadminDirectory = new ArrayList<>();

    public SysAdminDirectory() {
        
    }

    

    public List<Person> getSysadminDirectory() {
        return sysadminDirectory;
    }

    public void setSysadminDirectory(List<Person> sysadminDirectory) {
        this.sysadminDirectory = sysadminDirectory;
    }

    public Person addsysAd(String name, int age, String username, String password, Role role, String address, String aptNo, String communityName, String cityName) {
        Person person  = new Person(name, age, username, password, role, aptNo,  address, communityName, cityName);
        this.sysadminDirectory.add(person);
        this.addPerson(person);
        return person;
    }

    public void removeSysAd(String username) {
        for (int i = 0; i < this.sysadminDirectory.size(); i++) {
            Person person = this.sysadminDirectory.get(i);
            if (person.getuserName().equals(username)) {
                this.sysadminDirectory.remove(i);
                this.removePerson(username);
                break;
            }
        }
    }

}
