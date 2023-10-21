/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;


/**
 *
 * @author kziel
 */
class Type implements TypeObserverInterface{    
    public static int freezing;
    public static int cold;
    public static int warm;
    public static int hot;
    
    public static int Rainy;
    public static int Good;
    public static int Stormy;
    public static int Windy;
    public static int Snowy;
    
    public static int Tire;
    public static int Brakes;
    public static int Engine;
    
    
    public Type(){
        freezing = 0;
        cold = 0;
        warm = 0;
        hot = 0;
        
        Rainy = 0;
        Good = 0;
        Stormy = 0;
        Windy = 0;
        Snowy = 0;
        
        Tire = 0;
        Brakes = 0;
        Engine = 0;
        
    }
    
    @Override
    public void add(Breakdown breakdown){
       
        if (breakdown.getKind().equals("Tire")){
            Type.addTire();
        }else if (breakdown.getKind().equals("Brakes")){
            Type.addBrakes();
        }else if (breakdown.getKind().equals("Engine")){
            Type.addEngine();
        }
            
            //check and update temp count
        if (breakdown.getTemp() <= 32){
            Type.addFreezing();
        }else if (breakdown.getTemp() <= 55){
            Type.addCold();
        }else if (breakdown.getTemp() <= 75){
            Type.addWarm();
        }else if (breakdown.getTemp() > 75){
             Type.addHot();       
        }
            
            //check and update condition count
        if (breakdown.getCondition().equals("Good") ){
            Type.addGood();
        }else if (breakdown.getCondition().equals("Rainy")){
            Type.addRainy();           
        }else if (breakdown.getCondition().equals("Stormy")){
            Type.addStormy();
        }else if (breakdown.getCondition().equals("Windy")){
            Type.addWindy();
        }else if (breakdown.getCondition().equals("Snowy")){
            Type.addSnowy();
   
        }        
    }
    
            //type vals
    public static void addTire(){
        Tire++;
    }
    
    
    public int getTire(){
        return Tire;
    }
    
    public static void addBrakes(){
        Brakes++;
    }
    
    
    public int getBrakes(){
        return Brakes;
    }
    
    public static void addEngine(){
        Engine++;
    }
    
    
    public int getEngine(){
        return Engine;
    }
    
    
            //temp vals
    public static void addFreezing(){
        freezing++;
    }
    
    
    public int getFreezing(){
        return freezing;
    }
    
    public static void addCold(){
        cold++;
    }
    
    
    public int getCold(){
        return cold;
    }
    
    public static void addWarm(){
        warm++;
    }
    
    
    public int getWarm(){
        return warm;
    }
    
    public static void addHot(){
        hot++;
    }
    
    
    public int getHot(){
        return hot;
    }
    
        //condition vals
    
    public static void addRainy(){
        Rainy++;
    }
    
    
    public int getRainy(){
        return Rainy;
    }
    
    public static void addGood(){
        Good++;
    }
    
    
    public int getGood(){
        return Good;
    }
    
    public static void addStormy(){
        Stormy++;
    }
    
    
    public int getStormy(){
        return Stormy;
    }
    
    public static void addWindy(){
        Windy++;
    }
    
    
    public int getWindy(){
        return Windy;
    }
    
    public static void addSnowy(){
        Snowy++;
    }
    
    
    public int getSnowy(){
        return Snowy;
    }
}
