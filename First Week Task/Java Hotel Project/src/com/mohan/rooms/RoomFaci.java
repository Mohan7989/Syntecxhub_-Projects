package com.mohan.rooms;

import java.util.Scanner;

public class RoomFaci {
	
	public void allroom(){
		
		Scanner sc=new Scanner(System.in);
		 boolean backToRoomMenu = false;
		  while (!backToRoomMenu) {
     		 backToRoomMenu = false;
     	 System.out.println("Room Facilities");
     	 System.out.println("1.Deluxe Room");
     	 System.out.println("2.AC Room");
     	 System.out.println("3.Non-AC Room");
     	 System.out.println("4.Luxury Room");
     	 
     	 System.out.println("6.Back to  Menu");
     	 
     	
     	 
     	 
     	 System.out.print("\n Which room facilities you want to see :");
     	 int faci=sc.nextInt();
     	 
     	 switch(faci) {
     	
     	 
     	 case 1:
     		 System.out.println("\n🏨 Facilities for Deluxe Room:");
              System.out.println(" ✔️  Spacious room with king-size bed");
              System.out.println(" ✔️  Free Wi-Fi");
              System.out.println(" ✔️  Air Conditioning");
              System.out.println(" ✔️  Attached Bathroom with hot water");
              System.out.println(" ✔️  Flat-screen TV with cable channels");
              System.out.println(" ✔️  24/7 room service");
              System.out.println(" ✔️  Mini fridge");
              System.out.println(" ✔️  Work desk and chair");
              System.out.println(" ✔️  Daily housekeeping and laundry services");
              break;
     	 case 2:
     		 System.out.println("\n🏨 Facilities for AC Room:");
         	 System.out.println(" ✔️ Comfortable queen-size bed");
         	 System.out.println(" ✔️ Fully Air-Conditioned environment");
         	 System.out.println(" ✔️ Attached bathroom with hot/cold water");
         	 System.out.println(" ✔️ Flat-screen LED TV with cable access");
         	 System.out.println(" ✔️ Free high-speed Wi-Fi");
         	 System.out.println(" ✔️ 24/7 electricity backup");
         	 System.out.println(" ✔️ 24/7 room service available");
         	 System.out.println(" ✔️ Daily cleaning and housekeeping");
         	 System.out.println(" ✔️ Electric kettle and complimentary water");
         	 break;
     	 case 3:
     		 System.out.println("🏨 Facilities for Non-AC Room:");
         	 System.out.println("------------------------------------------------");
         	 System.out.println("✔️  Comfortable Double Bed");
         	 System.out.println("✔️  Clean Linen and Towels");
         	 System.out.println("✔️  Ceiling Fan");
         	 System.out.println("✔️  24x7 Cold and Hot Water Supply");
         	 System.out.println("✔️   Basic Toiletries (Soap, Shampoo, Towel)");
         	 System.out.println("✔️  LED TV with Cable Channels");
         	 System.out.println("✔️  Free Wi-Fi Access");
         	 System.out.println("✔️  Room Service Available (Limited Hours)");
         	 System.out.println("✔️  Daily Housekeeping");
         	 System.out.println("✔️  Secure Locking System");
         	
         	 break;
         	 
     	 case 4:
     		 System.out.println("🏨 Facilities for Luxury Room:");
         	 System.out.println("------------------------------------------------");
         	 System.out.println("✔️  King-Size Bed with Premium Mattress & Linen");
         	 System.out.println("✔️  Separate Living Room with Sofa and Center Table");
         	 System.out.println("✔️  Fully Air Conditioned (Split AC)");
         	 System.out.println("✔️  Attached Bathroom with Bathtub and 24x7 Hot Water");
         	 System.out.println("✔️  Luxury Toiletries Kit (Shampoo, Soap, Dental Kit)");
         	 System.out.println("✔️  42'' Smart LED TV with OTT Access (Netflix, YouTube)");
         	 System.out.println("✔️  High-Speed Wi-Fi Connectivity");
         	 System.out.println("✔️  Tea/Coffee Maker with Complimentary Supplies");
         	 System.out.println("✔️  Mini-Fridge with Welcome Drinks & Snacks");
         	 System.out.println("✔️  Personal Wardrobe with Locker & Ironing Kit");
         	 System.out.println("✔️  Daily Room Cleaning  Service");
         	 System.out.println("✔️  24x7 Full Room Service Available");
         	 System.out.println("✔️  Balcony with Scenic View (Subject to Availability)");
         	 System.out.println("✔️  Digital Room Lock for Advanced Security");
         	 System.out.println("------------------------------------------------");
         	 
         	 
         	 
     	
     	 case 6:
     		 
     		 backToRoomMenu=true;
     		 break;
     		  default:
     			  System.out.println("Invalid choice try again ");
        	 
         	 
         	 break;
              
     		 
     		 
              
     	 }	 

          }
         
		
	}

}



