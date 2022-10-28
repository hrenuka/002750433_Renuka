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
public class DoctorDirectory extends PersonDirectory {

    List<Doctor> doctorDirectory = new ArrayList<>();

    public DoctorDirectory() {
        super();
        

    }

    public List<Doctor> getDoctorDirectory() {
        return this.doctorDirectory;
    }

    public void setDoctorDirectory(List<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public Doctor addDoctor(String name, int age, String userName, String password, Role role, String address, String aptNo, String communityName,String cityName, Hospital hospital) {
        Doctor doctor = new Doctor(name, age, userName, password, role, address, aptNo, communityName, cityName); 
        doctor.setHospital(hospital);
        this.doctorDirectory.add(doctor);
        this.addPerson(doctor);
        return doctor;
    }

    public void removeDoctor(String username) {
        for (int i = 0; i < this.doctorDirectory.size(); i++) {
            Doctor doctor = this.doctorDirectory.get(i);
            if (doctor.getuserName().equals(username)) {
                this.doctorDirectory.remove(i);
                this.removePerson(username);
                break;
            }
        }
    }
}