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
public class PersonDirectory {

    private List<Person> personDirectory = new ArrayList();

//    public DoctorDirectory doctorDirectory = new DoctorDirectory();
//    public PatientDirectory patientDirectory = new PatientDirectory();
//    public CommunityAdminDirectory communityadminDirectory = new CommunityAdminDirectory();
//    
    public List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(List<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }

    public void addPerson(Person person) {

//        Person person = new Person();
        this.personDirectory.add(person);

    }

    public Person authenticatePerson(String username, String password, Role role) {

        Person per = null;
        for (Person p : this.personDirectory) {
            System.out.println("Authenticate" + p.getuserName() + "=" + p.getPassword());
            System.out.println(p.getRole() == role);
            System.out.println(p.getuserName().equals(username));
            System.out.println(p.getPassword().equals(password));
//            (p.getuserName().equals(username) == true) && (p.getPassword().equals(password) == true) && (p.getRole() == role == true) && (p.getStatus() == true)
            if (p.getuserName().equals(username)) {
                if (p.getPassword().equals(password)) {
                    if (p.getRole() == role) {
                        if (p.getStatus() == true) {
                            System.out.println("Done");
                            return p;
                        }
                    }

                }

            }
        }
        System.out.println("Not done");
        return per;
    }
    //    public void removeUser(String userName, Role role){
    //        switch(role){
    //            case DOCTOR -> doctorDirectory.removeDoctor(userName);
    //            
    //            case PATIENT -> patientDirectory.removePatient(userName);
    //                
    //            case COMMUNITYADMIN -> communityadminDirectory.removeAdmin(userName);
    //            
    //        }
    //    }

    public void removePerson(String username) {

        for (int i = 0; i < this.personDirectory.size(); i++) {
            Person person = this.personDirectory.get(i);

            if (person.getuserName().equals(username)) {
                person.setStatus(false);
//                removeUser(person.getUserName(), person.getRole());
            }
        }
    }

}
