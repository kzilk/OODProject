/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author kziel
 */
public class Breakdown implements BreakdownSubjectInterface{
    
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
    public void updateType(Type type, Breakdown breakdown){
        type.add(breakdown);
    }
   
    
    public String getKind(){
        return kind;
    }
    
   
    public int getTemp(){
        return temp;
    }
    
    
    public String getCondition(){
        return condition;
    }
    
}
 