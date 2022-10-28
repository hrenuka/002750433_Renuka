/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author visha_wb3uzfg
 */
public class PatientDirectory extends PersonDirectory{

    private List<Patient> patientDirectory = new ArrayList();

    public List<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(List<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public Patient addPatient(String name, int age, String userName, String password, Role role, String address, String aptNo, String communityName,String cityName) {
        Patient patient = new Patient(name, age, userName, password, role, address, aptNo, communityName, cityName);
        this.patientDirectory.add(patient);
//        this.addPerson(patient);
//        
        
        return patient;
    }

    public void removePatient(String username) {
        for (int i = 0; i < this.patientDirectory.size(); i++) {
            Patient patient = this.patientDirectory.get(i);
            if (patient.getuserName().equals(username)) {
                this.patientDirectory.remove(i);
                this.removePerson(username);
                break;
            }
        }
    }

}
