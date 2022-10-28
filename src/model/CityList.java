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
public class CityList {

    private List<City> cityList = new ArrayList<>();

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public void addCity(String name) {
        int id = this.cityList.size()+1;
        City city = new City(name);
//        city.setId(id);
        this.cityList.add(city);
    }

    public void removeCity(String name) {
        for (int i = 0; i < this.cityList.size(); i++) {
            if (this.cityList.get(i).getCity().equals(name)) {
                this.cityList.remove(i);
            }
        }
    }

    public void updateCity(int id, City city) {
        this.cityList.set(id, city);
        
    }

}
