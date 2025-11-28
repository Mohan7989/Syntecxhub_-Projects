package com.mohan.rooms;

	import java.util.Scanner;

	public class LuxuryRoom {

		 private String[][] hotel;
		    private boolean[][] isBooked;
		    private int[][] roomSharing;
		    private Scanner sc;
		    
		    public LuxuryRoom(String[][] hotel, boolean[][] isBooked, int[][] roomSharing, Scanner sc) {
		        this.hotel = hotel;
		        this.isBooked = isBooked;
		        this.roomSharing = roomSharing;
		        this.sc = sc;
		    }
		    
		    public void LuxuryRoomMenu() {
		    	
		    	 boolean backToRoomMenu = false;
	             while (!backToRoomMenu) {
	                 System.out.println("╔══════════════════════════════════════════╗");
	                 System.out.println("║          Luxury Room                     ║");
	                 System.out.println("╠══════════════════════════════════════════╣");
	                 System.out.println("║ 1. View Facilities                       ║");
	                 System.out.println("║ 2. Available Rooms                       ║");
	                 System.out.println("║ 3. Pricing Information                   ║");
	                 System.out.println("║ 4. Optional Services                     ║");
	                 System.out.println("║ 5. Back to Main Menu                     ║");
	                 System.out.println("╚══════════════════════════════════════════╝");

	                 System.out.print("Please enter your choice :");
	                 int delu = sc.nextInt();
	                 switch (delu) {
	                     case 1:
	                    	 System.out.println("🏨 Facilities for Luxury  Room:");
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
	                    	 
	                         System.out.print(" /n How much rate you will give to this facility (1 to 5): ");
	                         int rate = sc.nextInt();

	                         if (rate >= 1 && rate <= 5) {
	                             System.out.print("You rated: ");
	                             for (int i = 0; i < rate; i++) {
	                                 System.out.print("★");
	                             }
	                             System.out.println();
	                         } else {
	                             System.out.println("❌ Invalid rating. Please enter a number between 1 and 5.");
	                         }
	                         break;
	                         
	                     case 2:
	                         System.out.println("\n🟢 Available Luxury ROOMS  (Per Floor):\n");
	                         boolean showAnotherShear = true;
	                         while (showAnotherShear) {
	                             System.out.print("How many shearing room you want ? :");
	                             int shear = Integer.parseInt(sc.next());
	                             for (int floor = 0; floor < 4; floor++) {
	                                 boolean found = false;
	                                 System.out.println("Floor " + (floor + 1) + ":");
	                                 for (int rooms = 0; rooms < 8; rooms++) {
	                                     if (hotel[floor][rooms].equals("Luxury") && !isBooked[floor][rooms] && roomSharing[floor][rooms] == shear) {
	                                         System.out.println("  ➤ Room " + (floor + 1) + "0" + (rooms + 1)
	                                                 + " " + roomSharing[floor][rooms] + " sharing is available ");
	                                         found = true;
	                                     }
	                                 }
	                                 if (!found) {
	                                     System.out.println("  ❌ No Luxury Room Available with " + shear + " sharing");
	                                 }
	                                 System.out.println();
	                             }
	                             System.out.print("\nDo you want to see another shearing availability? (yes/no) :" );
	                             String avai = sc.next();
	                             if (avai.equalsIgnoreCase("no")) {
	                                 showAnotherShear = false;
	                             }
	                         }
	                         break;
	                     case 3:
	                    	  System.out.println("\n🔹 Extra Charges (if applicable):");
	                             System.out.println("   - Late Check-out : ₹300 per hour");
	                             System.out.println("\n💡 Note:");
	                             System.out.println("   ✔ All rooms include A/C, Wi-Fi, and TV");
	                             System.out.println("   ✔ Discounts apply automatically");
	                             System.out.println("   ✔ GST extra as per government rules");
	                             
	                         boolean showPricing = true;
	                         while (showPricing) {
	                           

	                             System.out.println("\n🏨 Suite Room Pricing Menu");
	                             System.out.println("-------------------------------------");
	                             System.out.println("🔹1. Luxury Room Rates:");
	                             System.out.println("🔹2. See Discounts ");
	                        
	                             System.out.println("🔹3. Back ");
	                             System.out.print("\nPlease enter your choice :");

	                             int enter = sc.nextInt();
	                             switch (enter) {
	                                 case 1:
	                                     System.out.println("   - Two persons (double sharing): ₹3200 per night");
	                                     System.out.println("   - Three person (triple sharing): ₹4700 per night");
	                                     System.out.println("   - Four person (four sharing): ₹6200 per night");
	                                     System.out.println("   - Extra person : ₹500 per night");
	                                     break;
	                                 case 2:
	                                     System.out.println("\n🔹 Discounts on Long Stay:");
	                                     System.out.println("   - Stay 3 or more nights: 15% OFF");
	                                     System.out.println("   - Stay 7 or more nights: 20% OFF");
	                                     break;
	                                 
	                                 case 3:
	                                     showPricing = false;
	                                     break;
	                                 default:
	                                     System.out.println("❌ Invalid choice. Please try again.");
	                                     break;
	                             }
	                         }
	                         break;
	                     
	                     case 4:
	                    	 System.out.println("\n🔹 Optional Services Available:");
	                    	 System.out.println("--------------------------------------------------");
	                    	 System.out.println("✔️ Breakfast Service");
	                    	 System.out.println("✔️ Lunch (Veg / Non-Veg)");
	                    	 System.out.println("✔️ Extra Mattress/Bed");
	                    	 System.out.println("✔️ Laundry & Ironing");
	                    	 System.out.println("✔️ Gym Access");
	                    	 System.out.println("✔️ Conference Room Access");

	                    	 System.out.println("\n💡 Note:");
	                    	 System.out.println("✔ Charges apply additionally and will be included in final bill.");
	                    	
	                         break;
	                     case 5:
	                         backToRoomMenu = true;
	                         break;
	                     default:
	                         System.out.println("❌ Invalid choice. Please try again.");
	                         break;
	                 }
	             }
	             
	        	 
		    }
	}


