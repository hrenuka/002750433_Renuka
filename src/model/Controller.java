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
public class Controller {

    PersonDirectory personDirectory = new PersonDirectory();
    PatientDirectory patientDirectory = new PatientDirectory();
    DoctorDirectory doctorDirectory = new DoctorDirectory();
    CommunityAdminDirectory communityAdminDirectory = new CommunityAdminDirectory();
    SysAdminDirectory sysadminDirectory = new SysAdminDirectory();

    HospitalDirectory hospitalDirectory = new HospitalDirectory();
    EncounterRecords encounterRecords = new EncounterRecords();

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public CommunityAdminDirectory getCommunityAdminDirectory() {
        return communityAdminDirectory;
    }

    public void setCommunityAdminDirectory(CommunityAdminDirectory communityAdminDirectory) {
        this.communityAdminDirectory = communityAdminDirectory;
    }

    public SysAdminDirectory getSysadminDirectory() {
        return sysadminDirectory;
    }

    public void setSysadminDirectory(SysAdminDirectory sysadminDirectory) {
        this.sysadminDirectory = sysadminDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public EncounterRecords getEncounterRecords() {
        return encounterRecords;
    }

    public void setEncounterRecords(EncounterRecords encounterRecords) {
        this.encounterRecords = encounterRecords;
    }
    
    

    public boolean signup(String name, int age, String userName, String password, Role role, String address, String aptNo, String communityName, String cityName, String hospitalName) {
//        name, age, password, role, address, aptNo, cityName
        System.out.println(userName);
        Person person = null;
        switch (role) {
            case PATIENT ->
                person = patientDirectory.addPatient(name, age, userName, password, role, address, aptNo, communityName, cityName);

            case COMMUNITYADMIN ->
                person = communityAdminDirectory.addAdmin(name, age, userName, password, role, address, aptNo, communityName, cityName);

            case SYSADMIN ->
                person = sysadminDirectory.addsysAd(name, age, userName, password, role, address, aptNo, communityName, cityName);
            case DOCTOR ->{
                Hospital hospital = hospitalDirectory.searchHospitalByName(hospitalName);
                person = doctorDirectory.addDoctor(name, age, userName, password, role, address, aptNo, communityName, cityName, hospital);
            }
        }
        
        this.personDirectory.addPerson(person);
        
        System.out.println("Print");
        for (Person p: this.personDirectory.getPersonDirectory()){
            System.out.println(p.getuserName()+"="+p.getPassword());
        }
        return true;
    }
    
    
//
//    public boolean signup(String name, int age, String userName, String password, Role role, String address, String aptNo, String communityName, String cityName, String hospitalName) {
//
//        Hospital hospital = hospitalDirectory.searchHospitalByName(hospitalName);
//
//        switch (role) {
//            case DOCTOR ->
//                doctorDirectory.addDoctor(name, age, userName, password, role, address, aptNo, communityName, cityName, hospital) ;
//        }
//
//        return true;
//    }

    public Person signin(String name, String password, Role role) {
        System.out.println(name+""+password+""+role);
        return personDirectory.authenticatePerson(name, password, role);
    }
    public void createHospital(String name, String community, String city){
        hospitalDirectory.addHospital(name, community, city);
    }
    
    public List<Encounter> searchEncountersByDoctor(String doctorName){
        
        List<Encounter> encounterResult = new ArrayList<>();
        
        for (Encounter e: encounterRecords.getEncounterRecords()){
            if (e.getDoctorUsername().equals(doctorName)){
                encounterResult.add(e);
            }
        }
        
        return encounterResult;
        
    }
    
//    public 
    
//    public Doctor searchDoctor() {
//        
////        personDirectory
//        return null;
//    }

    public void createEncounter(String patientUsername, String doctorUsername, int heartrate, float temperature, String remarks, String allergies) {
//      Add Vital params
        VitalRecord vital = new VitalRecord(heartrate, temperature, remarks, allergies);

        encounterRecords.createEncounter(vital, patientUsername, doctorUsername);
    }

    public void addHospital(String name, String city, String communityName) {
//        Add hospital parameters

        hospitalDirectory.addHospital(name, city, communityName);
    }

    public void removeHospital(String name) {
        hospitalDirectory.removeHospital(name);
    }

    public void removeHospital(int id) {
        hospitalDirectory.removeHospital(id);
    }

}
