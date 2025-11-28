package com.mohan.main;
	import java.util.Scanner;

import com.mohan.food.Meals;
import com.mohan.food.Snaks;
import com.mohan.rooms.Room;


	public class  HotelApp{

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in );	
			
			System.out.println("         _________________________");
	        System.out.println("        |                         |");
	        System.out.println("        |      SUNSET PALACE      |");
	        System.out.println("        |          HOTEL          |");
	        System.out.println("        |_________________________|");
	        System.out.println("        |   []    []    []    []  |");
	        System.out.println("        |   []    []    []    []  |");
	        System.out.println("        |   []    []    []    []  |");
	        System.out.println("        |   []    []    []    []  |");
	        System.out.println("        |_________________________|");
	        System.out.println("        |           ||            |");
	        System.out.println("        |           ||            |");
	        System.out.println("        |   Lobby   ||   Dining   |");
	        System.out.println("        |___________||____________|");
	        System.out.println("        |                       __|");
	        System.out.println("        |  Reception           |  |");
	        System.out.println("        |______________________|__|");
	    
	        
	        	
	        
	        System.out.println("\n==============================================");
	        System.out.println("        Welcome To Sunset Palace Hotel");
	        System.out.println("==============================================\n");
	        
	        
	        while(true) {
	        
	        	System.out.println("\n       ⭆⭆⭆ Main Menu ⭅⭅⭅");
	        	System.out.println("       ---------------------");
	        	System.out.println("       1. Snacks");
	        	System.out.println("       2. Meals");
	        	System.out.println("       3. Rooms");
	        	System.out.println("       4. Exit");
	        
	        System.out.print("\nPlease Enter your choise =");
	        int choice=Integer.parseInt(sc.next());
	        
	        if(choice>4) {
	        	System.out.println("Invalid Choice try again !!");
	        }
	        
	     
	        
	        switch(choice) {
	        
	        case 1 :
	        	 Snaks hobj =new Snaks();
	        	
	        	String input=hobj.snack();
	        	System.out.println(input);
	          
	        	break;
	        	
	        case 2:
	        	Meals mobj=new Meals();
	        	mobj.menu();
	        	break;
	        	
	        case 3:
	        	Room robj = new Room();
	            robj.showMainMenu(); 
	            break;
	        
	        
	                    
	       
	        case 4:
	            System.out.println("\n👋 Thank you for visiting Sunset Palace Hotel!");
	            System.out.println("🏨 Have a great day!");
	            System.exit(0); 
	            break;
	        }
	        
	        

		}

	}
	}

