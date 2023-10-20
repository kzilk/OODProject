/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.groupproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kziel
 */
public class GroupProject {

    List<Breakdown> breakdownList = new ArrayList<>();
    Compare compare = new Compare();
    private static Type type;

    public static void main(String[] args) {   
        type = new Type();

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your first breakdown details: ");
        update();
               
        ask();
    }
    
    
    public static void ask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 'Update' to provide a new "
                + "breakdown scenario, or 'Exit' to view results.");
        String cont = scan.nextLine();
               
        if(cont.equals("Exit")){
            results(type);
        }else{
            System.out.println("Please enter the information for "
                    + "the next breakdown: ");
            
            update();            
        }        
        
        ask();
    }
    
    public static void update(){
            Scanner scan = new Scanner(System.in);
            System.out.println("What is the type of breakdown; Tire, Brakes, "
                    + "or Engine: ");
            String kind = scan.nextLine();
            
            System.out.println("What was the temperature when it occured "
                    + "or was reported (in F)? ");
            String strTemp = scan.nextLine();
            int temp = Integer.parseInt(strTemp);
                
            System.out.println("What where the weather conditions "
                    + "when this occured? ");
            System.out.println("Enter either Good, Rainy, "
                    + "Stormy, Snowy, or Windy.");                
            String condition = scan.nextLine();
            
            Breakdown breakdown = new Breakdown(kind, temp, 
                    condition);              
             
            Compare.add(breakdown);     
    }
    
    public static void results(Type type){
        //tire returns
       System.out.println("Here are the number of each type of breakdown "
               + "and the weather conditions for all.");
       
       System.out.println();
       
       System.out.println("Tire breakdowns = " + type.getTire());
       System.out.println("Brake failures = " + type.getBrakes());
       System.out.println("Engine breakdowns = " + type.getEngine());

       System.out.println();  
               
       System.out.println("Freezing conditions = " + type.getFreezing());
       System.out.println("Cold conditions = " + type.getCold());
       System.out.println("Warm conditions = " + type.getWarm());
       System.out.println("Hot conditions = " + type.getHot());
       
       System.out.println();
       
       System.out.println("Good weather = " + type.getGood());
       System.out.println("Rainy weather = " + type.getRainy());
       System.out.println("Stormy weather = " + type.getStormy());
       System.out.println("Windy weather = " + type.getWindy());
       System.out.println("Snowy weather = " + type.getSnowy());
       System.out.println();
      
       System.exit(0);
    }
    
        
}

