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
public class Compare{
    private static List<Breakdown> breakdownList = new ArrayList<>();
    private String type;       
    private int temp;
    private String condition;   
  
    public static void add(Breakdown breakdown){
        breakdownList.add(breakdown);
        
        Breakdown latestBreak = breakdownList.get(breakdownList.size() -1);
        
        
        if (latestBreak.getKind().equals("Tire")){
            Type.addTire();
        }else if (latestBreak.getKind().equals("Brakes")){
            Type.addBrakes();
        }else if (latestBreak.getKind().equals("Engine")){
            Type.addEngine();
        }
            
            //check and update temp count
        if (latestBreak.getTemp() <= 32){
            Type.addFreezing();
        }else if (latestBreak.getTemp() <= 55){
            Type.addCold();
        }else if (latestBreak.getTemp() <= 75){
            Type.addWarm();
        }else if (latestBreak.getTemp() > 75){
             Type.addHot();       
        }
            
            //check and update condition count
        if (latestBreak.getCondition().equals("Good") ){
            Type.addGood();
        }else if (latestBreak.getCondition().equals("Rainy")){
            Type.addRainy();           
        }else if (latestBreak.getCondition().equals("Stormy")){
            Type.addStormy();
        }else if (latestBreak.getCondition().equals("Windy")){
            Type.addWindy();
        }else if (latestBreak.getCondition().equals("Snowy")){
            Type.addSnowy();
   
        }        
    }

}
