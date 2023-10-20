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
public class Breakdown implements BreakdownInterface{
    
    private String kind;       
    private int temp;
    private String condition;   
    
    //Breakdown Class constructor
    Breakdown(String newKind, int newTemp, String newCondition){
        kind = newKind;
        temp = newTemp;
        condition = newCondition;
    }
    
   
    @Override
    public String getKind(){
        return kind;
    }
    
    @Override
    public int getTemp(){
        return temp;
    }
    
    @Override
    public String getCondition(){
        return condition;
    }
    
}
 