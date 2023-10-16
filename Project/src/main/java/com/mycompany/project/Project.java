/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;

import java.util.*;

/**
 *
 * @author kziel
 */
public class Project {
    
    public static void main(String[] args) {
        List<Breakdown> breakdownList = new ArrayList<>();
        
        boolean continueUpdate = true;  
            
        while(continueUpdate){
            System.out.println("Please select 'Update' to provide a new "
                    + "breakdown scenario, or 'Exit' to view results.");//checks if we want to add more instances
            Scanner scan = new Scanner(System.in);
            String cont = scan.nextLine();
            
            
            
                
            if(cont.equals("Exit")){//if we want to display results
                continueUpdate = false;
                //return display info from Compare
                }
            
            
            
            
            else{                          //if we want to add more instances            
                System.out.println("What is the location of this breakdown: ");
                String location = scan.nextLine();
            
                System.out.println("What is the type of breakdown; tire, breaks, "
                    + "or engine: ");
                String type = scan.nextLine();
            
                System.out.println("When did it occur to the nearest hour, "
                    + "MM/DD/YY 2300");
                String dateTime = scan.nextLine();
            
                Breakdown breakdown = new Breakdown(location, 
                    type, dateTime);
                
                breakdownList.add(breakdown);
            }
        }
    }
}
    
    

    
