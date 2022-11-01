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
public class HospitalDirectory {

    private List<Hospital> hospitalList = new ArrayList<>();
    public List<Hospital> get;

    public List<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public void addHospital(String name, String city, String community) {
        Hospital hospital = new Hospital(name, community, city);
        this.hospitalList.add(hospital);
    }
    
    
    public Hospital searchHospitalByName(String name) {
//        List<Hospital> resultHospital = new ArrayList<>();
        for (int i = 0; i < this.hospitalList.size(); i++) {
            Hospital h = this.hospitalList.get(i);
            if (h.getName().equals(name)) {
                return h;
            }
        }
        return null;
    }

    public List<Hospital> searchHospitalByCity(String name) {
        List<Hospital> resultHospital = new ArrayList<>();
        for (int i = 0; i < this.hospitalList.size(); i++) {
            Hospital h = this.hospitalList.get(i);
            if (h.getCity().equals(name)) {
                resultHospital.add(h);
            }
        }
        return resultHospital;

    }
    public List<Hospital> searchHospitalByAll(String communityName, String cityName) {
        List<Hospital> resultHospital = new ArrayList<>();
        for (int i = 0; i < this.hospitalList.size(); i++) {
            Hospital h = this.hospitalList.get(i);
            if (h.getCommunityName().equals(communityName)) {
                if (h.getCity().equals(cityName)) {
                    resultHospital.add(h);
                }
            }
        }
        return resultHospital;

    }
        public List<Hospital> searchHospitalByComunity(String name) {
        List<Hospital> resultHospital = new ArrayList<>();
        for (int i = 0; i < this.hospitalList.size(); i++) {
            Hospital h = this.hospitalList.get(i);
            if (h.getCommunityName().equals(name)) {
                resultHospital.add(h);
            }
        }
        return resultHospital;

    }

    public void removeHospital(String name) {

        for (int i = 0; i < this.hospitalList.size(); i++) {
            Hospital h = this.hospitalList.get(i);
            if (h.getName().equals(name)) {
                this.hospitalList.remove(i);
            }
        }
    }

    public void removeHospital(int id) {

        for (int i = 0; i < this.hospitalList.size(); i++) {
            Hospital h = this.hospitalList.get(i);
            if (h.getId() == id) {
                this.hospitalList.remove(i);
            }
        }
    }
}
