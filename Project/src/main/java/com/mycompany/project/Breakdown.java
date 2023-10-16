/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kziel
 */
public class Breakdown{
    private Weather weather;
    private static String location;    //location of breakdown
    private static String type;        //type of breakdown eg tire, breaks, or engine
    private String dateTime;    //date and time of breakdown

    
    //Breakdown Class constructor
    Breakdown(String newLocation, String newType, String newDateTime){
        location = newLocation;
        type = newType;
        dateTime = newDateTime;
        Breakdown.makeWeather(newLocation, newDateTime);
       
    }
    
    public static int getCount(){
        int count = 0; //counts number of instances
        count++;
        return count;
    }
    //creates weather object and adds to array
    public static void makeWeather(String newLocation,String newDateTime){
        List<Weather> weatherList = new ArrayList<>();
        Weather weather = new Weather(newLocation, newDateTime);
        weatherList.add(weather);
    }
        
}
  
