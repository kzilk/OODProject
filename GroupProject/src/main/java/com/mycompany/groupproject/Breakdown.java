/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kziel
 */
public class Breakdown {
    
    private String type;       
    private int temp;
    private String condition;   
    
    //Breakdown Class constructor
    Breakdown(String newType, int newTemp, String newCondition){
        type = newType;
        temp = newTemp;
        condition = newCondition;
    }
    
    public String getType(){
        return type;
    }
    
    public int getTemp(){
        return temp;
    }
    
    public String getCondition(){
        return condition;
    }
    
}
 