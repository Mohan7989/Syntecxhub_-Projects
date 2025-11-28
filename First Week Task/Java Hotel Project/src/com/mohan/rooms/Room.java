package com.mohan.rooms;

	import java.util.Scanner;

	public class Room {
	    private final String[][] hotel = new String[4][8];
	    private final int[][] roomSharing = new int[4][8];
	    private final boolean[][] isBooked = new boolean[4][8];
	    private final Scanner sc = new Scanner(System.in);

	    public Room() {
	        initializeRooms();
	    }

	    
	    private void initializeRooms() {
	        String[] types = {
	            "Deluxe Room", "Deluxe Room",
	            "AC Room", "AC Room",
	            "Non-AC Room", "Non-AC Room",
	            "Luxury Room", "Luxury Room"
	        };

	       
	        for (int floor = 0; floor < 4; floor++) {
	            for (int room = 0; room < 8; room++) {
	                hotel[floor][room] = types[room];
	            }
	        }

	        int[][] sharing = {
	            {2,3,2,4,3,2,4,2},  // Floor 1
	            {3,4,4,2,3,2,4,2},  // Floor 2
	            {4,2,2,2,3,2,4,2},  // Floor 3
	            {4,3,4,3,4,3,4,3}   // Floor 4
	        };

	        for (int i = 0; i < 4; i++) {
	            System.arraycopy(sharing[i], 0, roomSharing[i], 0, 8);
	        }

	        // Pre-booked rooms
	        isBooked[0][1] = true;
	        isBooked[0][3] = true;
	        isBooked[0][6] = true;
	        isBooked[1][0] = true;
	        isBooked[1][5] = true;
	        isBooked[2][7] = true;
	        isBooked[3][3] = true;
	    }

	    // Display hotel room map
	    private void displayHotel() {
	        System.out.println("\nCurrent Room Layout:");
	        for (int floor = 0; floor < 4; floor++) {
	            System.out.print("Floor " + (floor + 1) + ": | ");
	            for (int room = 0; room < 8; room++) {
	                System.out.print(String.format("%-13s", hotel[floor][room]) + " | ");
	            }
	            System.out.println();
	        }
	    }

	    // Main hotel menu
	    public void showMainMenu() {
	        while (true) {
	        	 System.out.println("\n=============================================");
	    	     System.out.println("          🏨 SUNSET PALACE HOTEL");
	    	     System.out.println("=============================================\n");

	    	     System.out.println("📋 Available Room Categories:");
	    	     System.out.println("---------------------------------------------");
	    	     System.out.println("1. Deluxe Room       | ₹2700 onwards");
	    	     System.out.println("2. AC Room           | ₹2100 onwards");
	    	     System.out.println("3. Non-AC Room       | ₹1400 onwards");
	    	     System.out.println("4. Luxury Room       | ₹3600 onwards");
	    	     System.out.println("5. Rooms Facilities");
	             System.out.println("6. Book a Room");
	    	     System.out.println("7. Exit Main Menu");
	    	     System.out.println("---------------------------------------------");
	    	     
	            System.out.print("\n➡️  Please enter your choice: ");
	            
	           

	            int choice = sc.nextInt();
	            System.out.println("You can select "+" "+choice +" "+ "room !");
	            switch (choice) {
	            
	            
	            case 1 :
	            	Deluxe deluxe = new Deluxe(hotel, isBooked, roomSharing, sc);
	                deluxe.deluxeRoomMenu();
	                break;
	              
	            
	            	
	            case 2:
	            	ACRoom ac = new ACRoom(hotel, isBooked, roomSharing, sc);
	                ac.acRoomMenu();
	                break;
	            	
	            	
	            case 3:
	            	NonAC non = new NonAC(hotel, isBooked, roomSharing, sc);
	                non.nonACMenu();
	                break;
	            	
	            	
	                        
	           
	            case 4:
	                
	            	LuxuryRoom lux = new LuxuryRoom(hotel, isBooked, roomSharing, sc);
	                lux.LuxuryRoomMenu();
	               
	                 
	                break;
	                
	            case 5:
	                     RoomFaci fobj =new RoomFaci();
	                     fobj.allroom();
	            	
	                 
	                break;
	                
	            case 6:
	                 RoomBook rb=new RoomBook(hotel, isBooked, roomSharing, sc);
	                 rb.roommenu();
	            
	           break;
	            
	            
	            
	                case 7:
	                    System.out.println("👋 Thank you for visiting Sunset Palace Hotel!");
	                    return;
	                default:
	                    System.out.println("❌ Invalid choice, please try again.");
	        
	    

	        }}}}

