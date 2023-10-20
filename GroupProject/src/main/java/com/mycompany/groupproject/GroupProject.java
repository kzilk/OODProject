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
    private static Tire tire;
    private static Engine engine;
    private static Brakes brakes;

    
    public static void main(String[] args) {   
        tire = new Tire();
        engine = new Engine();
        brakes = new Brakes();

        
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
            results(tire, engine, brakes);
        }else{
            System.out.println("Please enter the information for "
                    + "the next breakdown: ");
            
            update();            
        }        
        
        ask();
    }
    
    public static void update(){
            Scanner scan = new Scanner(System.in);
            System.out.println("What is the type of breakdown; Tire, Breaks, "
                    + "or Engine: ");
            String type = scan.nextLine();
            
            System.out.println("What was the temperature when it occured "
                    + "or was reported (in F)? ");
            String strTemp = scan.nextLine();
            int temp = Integer.parseInt(strTemp);
                
            System.out.println("What where the weather conditions "
                    + "when this occured? ");
            System.out.println("Enter either Good, Rainy, "
                    + "Stormy, Snowy, or Windy.");                
            String condition = scan.nextLine();
            
            Breakdown breakdown = new Breakdown(type, temp, 
                    condition);              
             
            Compare.add(breakdown);     
    }
    
    public static void results(Tire tire, Engine engine, Brakes brakes){
        //tire returns
       System.out.println("Here are the weather conditions for all "
               + "Tire breakdowns:");
       
       System.out.println("Freezing conditions = " + tire.getFreezing());
       System.out.println("Cold conditions = " + tire.getCold());
       System.out.println("Warm conditions = " + tire.getWarm());
       System.out.println("Hot conditions = " + tire.getHot());
       
       System.out.println();
       
       System.out.println("Good weather = " + tire.getGood());
       System.out.println("Rainy weather = " + tire.getRainy());
       System.out.println("Stormy weather = " + tire.getStormy());
       System.out.println("Windy weather = " + tire.getWindy());
       System.out.println("Snowy weather = " + tire.getSnowy());
       System.out.println();
       
       //brake returns
       System.out.println("Here are the weather conditions for all "
               + "Brake breakdowns:");
       
       System.out.println("Freezing conditions = " + brakes.getFreezing());
       System.out.println("Cold conditions = " + brakes.getCold());
       System.out.println("Warm conditions = " + brakes.getWarm());
       System.out.println("Hot conditions = " + brakes.getHot());
       
       System.out.println();
       
       System.out.println("Good weather = " + brakes.getGood());
       System.out.println("Rainy weather = " + brakes.getRainy());
       System.out.println("Stormy weather = " + brakes.getStormy());
       System.out.println("Windy weather = " + brakes.getWindy());
       System.out.println("Snowy weather = " + brakes.getSnowy());
       System.out.println();
       
       //engine returns
       
       System.out.println("Here are the weather conditions for all "
               + "Brake breakdowns:");
       
       System.out.println("Freezing conditions = " + engine.getFreezing());
       System.out.println("Cold conditions = " + engine.getCold());
       System.out.println("Warm conditions = " + engine.getWarm());
       System.out.println("Hot conditions = " + engine.getHot());
       
       System.out.println();
       
       System.out.println("Good weather = " + engine.getGood());
       System.out.println("Rainy weather = " + engine.getRainy());
       System.out.println("Stormy weather = " + engine.getStormy());
       System.out.println("Windy weather = " + engine.getWindy());
       System.out.println("Snowy weather = " + engine.getSnowy());
       
       System.exit(0);
    }
    
        
}

