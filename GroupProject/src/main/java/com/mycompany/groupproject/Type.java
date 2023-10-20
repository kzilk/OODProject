/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author kziel
 */
class Type implements TypeInterface {
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
    
            //type vals
    public static void addTire(){
        Tire++;
    }
    
    @Override
    public int getTire(){
        return Tire;
    }
    
    public static void addBrakes(){
        Brakes++;
    }
    
    @Override
    public int getBrakes(){
        return Brakes;
    }
    
    public static void addEngine(){
        Engine++;
    }
    
    @Override
    public int getEngine(){
        return Engine;
    }
    
    
            //temp vals
    public static void addFreezing(){
        freezing++;
    }
    
    @Override
    public int getFreezing(){
        return freezing;
    }
    
    public static void addCold(){
        cold++;
    }
    
    @Override
    public int getCold(){
        return cold;
    }
    
    public static void addWarm(){
        warm++;
    }
    
    @Override
    public int getWarm(){
        return warm;
    }
    
    public static void addHot(){
        hot++;
    }
    
    @Override
    public int getHot(){
        return hot;
    }
    
        //condition vals
    
    public static void addRainy(){
        Rainy++;
    }
    
    @Override
    public int getRainy(){
        return Rainy;
    }
    
    public static void addGood(){
        Good++;
    }
    
    @Override
    public int getGood(){
        return Good;
    }
    
    public static void addStormy(){
        Stormy++;
    }
    
    @Override
    public int getStormy(){
        return Stormy;
    }
    
    public static void addWindy(){
        Windy++;
    }
    
    @Override
    public int getWindy(){
        return Windy;
    }
    
    public static void addSnowy(){
        Snowy++;
    }
    
    @Override
    public int getSnowy(){
        return Snowy;
    }
}
