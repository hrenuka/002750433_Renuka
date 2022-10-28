/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class Encounter {
    
    private int id;
    private String patientUsername;
    private VitalRecord vital;
    private String doctorUsername;

    public Encounter(String patient, VitalRecord vital, String doctor) {
        this.patientUsername = patient;
        this.vital = vital;
        this.doctorUsername = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public VitalRecord getVital() {
        return vital;
    }

    public void setVital(VitalRecord vital) {
        this.vital = vital;
    }

    public String getDoctorUsername() {
        return doctorUsername;
    }

    public void setDoctorUsername(String doctorUsername) {
        this.doctorUsername = doctorUsername;
    }
    
    
    
    
}
