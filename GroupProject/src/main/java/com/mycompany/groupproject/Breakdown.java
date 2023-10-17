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
    
    private static String type;        //type of breakdown eg tire, breaks, or engine
    private static int temp;
    private static String condition;
    
    List<Breakdown> breakdownList = new ArrayList<>();
    
    public void addBreakdown(String type, int temp, String condition){
        Breakdown breakdown = new Breakdown(type, 
                temp, condition);   
        
        breakdownList.add(breakdown);   
        Compare.updateCompare(breakdownList);
        
    }
    
    //Breakdown Class constructor
    Breakdown(String newType, int newTemp, String newCondition){
        type = newType;
        temp = newTemp;
        condition = newCondition;
    }
    
}
