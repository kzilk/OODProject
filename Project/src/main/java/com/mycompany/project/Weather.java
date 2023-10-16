/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author kziel
 */
public class Weather {
    private static String location;    
    private static String dateTime;

    private int temp;
    private String condition;
    
    private int tempCalc(String newLocation, String newDateTime){
        //takes location & dateTime to get temp
    }
    
    private void conditionCalc(String newLocation, String newDateTime){
        //takes location & dateTime to get conditions
        //set weather as either Sunny,Cloudy, Stormy, Rainy, Snowy, or Undefined
        
    }
    //Weather Class constructor
    Weather(String newLocation, String newDateTime){
        location = newLocation;
        dateTime = newDateTime;
      
        
            //set below to be calcuated based on above
        temp = tempCalc(newLocation, newDateTime);
        condition = conditionCalc(newLocation, newDateTime);
    }
    
}
