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
public  class Compare {
    private static List<Breakdown> breakdownList = new ArrayList<>();
    private String type;       
    private int temp;
    private String condition;   
  
    public static void add(Breakdown breakdown){
        breakdownList.add(breakdown);
        
        Breakdown latestBreak = breakdownList.get(breakdownList.size() -1);
        
        
        if (latestBreak.getType().equals("Tire")){
            //check and update temp count
            if (latestBreak.getTemp() <= 32){
                Tire.addFreezing();
            }else if (latestBreak.getTemp() <= 55){
                Tire.addCold();
            }else if (latestBreak.getTemp() <= 75){
                Tire.addWarm();
            }else if (latestBreak.getTemp() > 75){
                Tire.addHot();       
            }
            
            //check and update condition count
            if (latestBreak.getCondition().equals("Good") ){
                Tire.addGood();
            }else if (latestBreak.getCondition().equals("Rainy")){
                Tire.addRainy();           
            }else if (latestBreak.getCondition().equals("Stormy")){
                Tire.addStormy();
            }else if (latestBreak.getCondition().equals("Windy")){
                Tire.addWindy();
            }else if (latestBreak.getCondition().equals("Snowy")){
                Tire.addSnowy();
            }
            
        }else if (latestBreak.getType().equals("Brakes")){
            //check and update temp count
            if (latestBreak.getTemp() <= 32){
                Brakes.addFreezing();
            }else if (latestBreak.getTemp() <= 55){
                Brakes.addCold();
            }else if (latestBreak.getTemp() <= 75){
                Brakes.addWarm();
            }else if (latestBreak.getTemp() > 75){
                Brakes.addHot();       
            }
            
            //check and update condition count
            if (latestBreak.getCondition().equals("Good") ){
                Brakes.addGood();
            }else if (latestBreak.getCondition().equals("Rainy")){
                Brakes.addRainy();           
            }else if (latestBreak.getCondition().equals("Stormy")){
                Brakes.addStormy();
            }else if (latestBreak.getCondition().equals("Windy")){
                Brakes.addWindy();
            }else if (latestBreak.getCondition().equals("Snowy")){
                Brakes.addSnowy();
            }
        }else if (latestBreak.getType().equals("Engine")){
                //check and update temp count
            if (latestBreak.getTemp() <= 32){
                Engine.addFreezing();
            }else if (latestBreak.getTemp() <= 55){
                Engine.addCold();
            }else if (latestBreak.getTemp() <= 75){
                Engine.addWarm();
            }else if (latestBreak.getTemp() > 75){
                Engine.addHot();       
            }
            
            //check and update condition count
            if (latestBreak.getCondition().equals("Good") ){
                Engine.addGood();
            }else if (latestBreak.getCondition().equals("Rainy")){
                Engine.addRainy();           
            }else if (latestBreak.getCondition().equals("Stormy")){
                Engine.addStormy();
            }else if (latestBreak.getCondition().equals("Windy")){
                Engine.addWindy();
            }else if (latestBreak.getCondition().equals("Snowy")){
                Engine.addSnowy();
            }
        }        
    }
    
    



    
}
