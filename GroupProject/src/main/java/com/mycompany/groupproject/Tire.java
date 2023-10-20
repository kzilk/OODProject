/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author kziel
 */
public class Tire {
    private static int freezing;
    private static int cold;
    private static int warm;
    private static int hot;

    private static int Rainy;
    private static int Good;
    private static int Stormy;
    private static int Windy;
    private static int Snowy;

    
    
    Tire(){
        freezing = 0;
        cold = 0;
        warm = 0;
        hot = 0;
        
        Rainy = 0;
        Good = 0;
        Stormy = 0;
        Windy = 0;
        Snowy = 0;
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
