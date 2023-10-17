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

    public void main(String[] args) {   
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your first breakdown details: ");
        GroupProject.update();
        
        System.out.println("Please select 'Update' to provide a new "
                + "breakdown scenario, or 'Exit' to view results.");
        String cont = scan.nextLine();
               
        if(cont.equals("Exit")){
            //display values from Compare class
        }else{
            System.out.println("Please enter the information for "
                    + "the next breakdown: ");
            
            GroupProject.update();            
        }        
        scan.close();
        }
    
    public void update(){
            Scanner scan = new Scanner(System.in);
            System.out.println("What is the type of breakdown; Tire, Breaks, "
                    + "or Engine: ");
            String type = scan.nextLine();
            
            System.out.println("What was the temperature when it occured "
                    + "or was reported (in F)? ");
            int temp = scan.nextLine();
                
            System.out.println("What where the weather conditions "
                    + "when this occured? ");
            System.out.println("Enter either Sunny/Cloudy, Rainy, "
                    + "Stormy, Snowy, Windy, or Other");                
            String condition = scan.nextLine();
            
            Breakdown.addBreakdown(type, temp, condition);
            scan.close();
        }
        
    }

