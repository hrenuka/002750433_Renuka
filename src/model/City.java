/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anujkumar
 */
public class City {

    private String cityName;
//    private int id;
//    private Community community;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCity() {
        return cityName;
    }

    public void setCity(String name) {
        this.cityName = name;
    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
}
