/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anujkumar
 */
public class Controller {

    PersonDirectory personDirectory = new PersonDirectory();
    PatientDirectory patientDirectory = new PatientDirectory();
    DoctorDirectory doctorDirectory = new DoctorDirectory();
    CommunityAdminDirectory communityAdminDirectory = new CommunityAdminDirectory();
    SysAdminDirectory sysadminDirectory = new SysAdminDirectory();

    HospitalDirectory hospitalDirectory = new HospitalDirectory();
    EncounterRecords encounterRecords = new EncounterRecords();

    public Controller() {

        this.initializeHospital();
        this.initializePatient();
        this.intializeDoctor();
        this.initializeEncounter();

//        }
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void initializeHospital() {
        this.createHospital("Boston Public Hospital", "Jamaica Plain", "Boston");
        this.createHospital("Massachusetts Hospital", "Norwood", "Cambridge");
        this.createHospital("Cancer Care Hospital", "WestLand", "Boston");
        this.createHospital("Roxbury Community Hospital", "Boston Center", "Salem");
        this.createHospital("Tufts Medical Center", "Lower Roxburry", "Chalsea");
        this.createHospital("Greenwhitch Medical Center", "Mass Ave", "Boston");
    }

    public void initializePatient() {

        Person per = this.patientDirectory.addPatient("Renuka", 21, "Ren", "1234", Role.PATIENT, "JAMAICA PLAIN", "A", "Jamaica Plain", "Boston");
        this.personDirectory.addPerson(per);
        Person per1 = this.patientDirectory.addPatient("Dhanashree", 37, "Dhan", "1234", Role.PATIENT, "ROXBURY St", "A", "Norwood", "Cambridge");
        this.personDirectory.addPerson(per1);
        Person per2 = this.patientDirectory.addPatient("Darshana", 30, "Darsh", "1234", Role.PATIENT, "LONGWOOD St", "A", "WestLand", "Boston");
        this.personDirectory.addPerson(per2);
        Person per3 = this.patientDirectory.addPatient("Manas", 37, "Man", "1234", Role.COMMUNITYADMIN, "NOORWOOD St", "A", "Boston Center", "Salem");
        this.personDirectory.addPerson(per3);
        Person per4 = this.patientDirectory.addPatient("Kunal", 30, "Kun", "1234", Role.SYSADMIN, "Mozart St", "A", "Lower Roxburry", "Boston");
        this.personDirectory.addPerson(per4);

    }

    public void intializeDoctor() {

        Hospital hospital = hospitalDirectory.searchHospitalByName("Boston Public Hospital");
        Person doc = this.doctorDirectory.addDoctor("John Kred", 25, "doctor", "patient", Role.DOCTOR, "JAMAICA PLAIN", "A", "Jamaica Plain", "Boston", hospital);
        this.personDirectory.addPerson(doc);

        Hospital hospital1 = hospitalDirectory.searchHospitalByName("Massachusetts Hospital");
        Person per1 = this.doctorDirectory.addDoctor("doctor2", 37, "doctor2", "patient", Role.DOCTOR, "ROXBURY St", "A", "Norwood", "Cambridge", hospital1);
        this.personDirectory.addPerson(per1);

        Hospital hospital2 = hospitalDirectory.searchHospitalByName("Cancer Care Hospital");
        Person per2 = this.doctorDirectory.addDoctor("doctor2", 37, "doctor3", "patient", Role.DOCTOR, "LONGWOOD St", "A", "WestLand", "Boston", hospital2);
        this.personDirectory.addPerson(per2);

    }

    public void initializeEncounter() {
        this.createEncounter("Ren", "doctor", 60, 98, "", "");
        this.createEncounter("Dhan", "doctor", 60, 98, "", "");
        this.createEncounter("Darsh", "doctor", 60, 98, "", "");
        this.createEncounter("Man", "doctor", 60, 98, "", "");
        this.createEncounter("Kun", "doctor", 70, 98, "", "");
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
            case DOCTOR -> {
                Hospital hospital = hospitalDirectory.searchHospitalByName(hospitalName);
                person = doctorDirectory.addDoctor(name, age, userName, password, role, address, aptNo, communityName, cityName, hospital);
            }
        }

        this.personDirectory.addPerson(person);

        System.out.println("Print");
        for (Person p : this.personDirectory.getPersonDirectory()) {
            System.out.println(p.getuserName() + "=" + p.getPassword());
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
        System.out.println(name + "" + password + "" + role);
        return personDirectory.authenticatePerson(name, password, role);
    }

    public List<Encounter> searchEncountersByDoctor(String doctorName) {

        List<Encounter> encounterResult = new ArrayList<>();

        for (Encounter e : encounterRecords.getEncounterRecords()) {
            if (e.getDoctorUsername().equals(doctorName)) {
                encounterResult.add(e);
            }
        }

        return encounterResult;
    }

    public List<Encounter> searchEncountersByPatient(String doctorName, String patientName) {

        List<Encounter> encounterResult = new ArrayList<>();

        for (Encounter e : encounterRecords.getEncounterRecords()) {
            if (e.getPatientUsername().equals(patientName)) {
                if (doctorName != null) {
                    if (e.getDoctorUsername().equals(doctorName)) {
                        encounterResult.add(e);
                    }
                } else {
                    encounterResult.add(e);
                }
            }
        }
        return encounterResult;
    }

    public void createHospital(String name, String community, String city) {
        hospitalDirectory.addHospital(name, community, city);
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
        System.out.println("Enter");
        encounterRecords.createEncounter(vital, patientUsername, doctorUsername);
        for (Encounter e: encounterRecords.getEncounterRecords()){
            System.out.println(e.getDoctorUsername()+" "+e.getVital().getAllergies());
        }
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

    public List<Hospital> searchHospital(String communityName, String cityName) {

        List<Hospital> hospitalResult = new ArrayList<>();
        if (cityName != null) {
            if (communityName != null) {
                return hospitalDirectory.searchHospitalByAll(communityName, cityName);
            }
        }

        if (cityName == null) {
            return hospitalDirectory.searchHospitalByComunity(communityName);
        }

        if (communityName == null) {
            return hospitalDirectory.searchHospitalByCity(cityName);
        }

        return hospitalResult;
    }

}
