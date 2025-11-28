package com.mohan.rooms;

	import java.util.*;

	class RoomBookingDetail {
	    String roomType;
	    int roomNumber;
	    int floor;
	    int sharing;
	    double price;

	    RoomBookingDetail(String roomType, int roomNumber, int floor, int sharing, double price) {
	        this.roomType = roomType;
	        this.roomNumber = roomNumber;
	        this.floor = floor;
	        this.sharing = sharing;
	        this.price = price;
	    }
	}

	public class RoomBook {
	    private String[][] hotel;
	    private boolean[][] isBooked;
	    private int[][] roomSharing;
	    private Scanner sc;

	    public RoomBook(String[][] hotel, boolean[][] isBooked, int[][] roomSharing, Scanner sc) {
	        this.hotel = hotel;
	        this.isBooked = isBooked;
	        this.roomSharing = roomSharing;
	        this.sc = sc;
	    }

	    public void roommenu() {
	        List<RoomBookingDetail> allBookedRooms = new ArrayList<>();
	        double totalPrice = 0;

	        while (true) {
	            System.out.println("\n╔════════════════════════════════════════════╗");
	            System.out.println("║           🛏️ Room Booking                  ║");
	            System.out.println("╠════════════════════════════════════════════╣");
	            System.out.println("║ 1. Deluxe Room                             ║");
	            System.out.println("║ 2. AC Room                                 ║");
	            System.out.println("║ 3. Non-AC Room                             ║");
	            System.out.println("║ 4. Luxury Room                             ║");
	            System.out.println("║ 5. Finish Booking & Print Bill             ║");
	            System.out.println("╚════════════════════════════════════════════╝");

	            System.out.print("➡️ Please enter your choice (1-5): ");
	            int choice = sc.nextInt();

	            String[] roomTypes = {"Deluxe Room", "AC Room", "Non-AC Room", "Luxury Room"};
	            int[][] prices = {
	                {2700, 3500, 4500}, // Deluxe
	                {2200, 3200, 4200}, // AC
	                {1400, 2000, 2700}, // Non-AC
	                {3200, 4700, 6200}  // Luxury
	            };

	            if (choice >= 1 && choice <= 4) {
	                String selectedType = roomTypes[choice - 1];
	                int[] selectedPrices = prices[choice - 1];
	                List<RoomBookingDetail> booked = booking(selectedType, selectedPrices);
	                allBookedRooms.addAll(booked);
	                for (RoomBookingDetail r : booked) totalPrice += r.price;
	            } else if (choice == 5) {
	                break;
	            } else {
	                System.out.println("❌ Invalid option. Please select from 1 to 5.");
	            }
	        }

	        if (allBookedRooms.isEmpty()) {
	            System.out.println("⚠️ No rooms booked. Returning to menu...");
	            return;
	        }

	        printFinalBill(allBookedRooms, totalPrice);
	    }

	    private List<RoomBookingDetail> booking(String roomType, int[] roomPrices) {
	        List<RoomBookingDetail> bookedRooms = new ArrayList<>();

	        System.out.printf("\n🛎️ How many %s Rooms do you want to book? ", roomType);
	        int howMany = sc.nextInt();

	        for (int i = 0; i < howMany; i++) {
	            int shares;
	            while (true) {
	                System.out.printf("➡️ Enter sharing type for Room %d (2/3/4): ", i + 1);
	                shares = sc.nextInt();
	                if (shares == 2 || shares == 3 || shares == 4) break;
	                System.out.println("⚠️ Invalid sharing type! Please enter 2, 3, or 4.");
	            }

	            int shareIndex = shares - 2;

	            // First show available rooms on each floor
	            boolean roomAvailable = false;
	            for (int floor = 0; floor < 4; floor++) {
	                boolean found = false;
	                System.out.print("🛏️ Floor " + (floor + 1) + ": ");
	                for (int roomNum = 0; roomNum < 8; roomNum++) {
	                    if (hotel[floor][roomNum].equalsIgnoreCase(roomType) &&
	                        roomSharing[floor][roomNum] == shares &&
	                        !isBooked[floor][roomNum]) {
	                        int roomNo = (floor + 1) * 100 + (roomNum + 1);
	                        System.out.print("[Room " + roomNo + "] ");
	                        found = true;
	                        roomAvailable = true;
	                    }
	                }
	                if (!found) System.out.print("No available rooms.");
	                System.out.println();
	            }

	            if (!roomAvailable) {
	                System.out.printf("⚠️ Sorry, no %s available for %d-sharing.\n", roomType, shares);
	                i--;
	                continue;
	            }

	            System.out.print("Please enter which floor you want (from available floor): ");
	            int selectedFloor = sc.nextInt();
	            sc.nextLine(); // consume newline

	            boolean foundRoomOnSelectedFloor = false;
	            int selectedRoomNumber = 0;

	            for (int roomNum = 0; roomNum < 8; roomNum++) {
	                if (hotel[selectedFloor - 1][roomNum].equalsIgnoreCase(roomType) &&
	                    roomSharing[selectedFloor - 1][roomNum] == shares &&
	                    !isBooked[selectedFloor - 1][roomNum]) {

	                    selectedRoomNumber = (selectedFloor) * 100 + (roomNum + 1);
	                    foundRoomOnSelectedFloor = true;
	                    break;
	                }
	            }

	            if (!foundRoomOnSelectedFloor) {
	                System.out.printf("⚠️ Sorry, no %s room available on Floor %d for %d-sharing.\n Please choose another floor.\n",
	                        roomType, selectedFloor, shares);
	                i--;
	                continue;
	            }

	            System.out.printf("✅ You can select Room no: %d on Floor %d (%s Room)\n",
	                    selectedRoomNumber, selectedFloor, roomType);

	            System.out.print("\nDo you want to proceed to book this room? (yes/no): ");
	            String confirm = sc.next().toLowerCase().trim();
	            if (!confirm.equals("yes")) {
	                System.out.printf("❌ Room %d not booked.\n", i + 1);
	                i--;
	                System.out.println("Do you want back to menu ?(yes/no)");
	                String menu=sc.next();
	                if(menu.equalsIgnoreCase("yes")) {
	                	Room robj=new Room();
	                	robj.showMainMenu();
	                }
	                continue;
	            
	            }

	            isBooked[selectedFloor - 1][(selectedRoomNumber % 100) - 1] = true;

	            int price = roomPrices[shareIndex];

	            System.out.print("Do you want to add 1 extra member to this room? (yes/no): ");
	            if (sc.next().equalsIgnoreCase("yes")) {
	                System.out.println("\n An extra charge of Rs. 500 will apply.");
	                System.out.print("Confirm to add extra member and pay Rs. 500? (yes/no): ");
	                if (sc.next().equalsIgnoreCase("yes")) {
	                    System.out.println("✅ Extra member added. Rs. 500 has been added to your bill.");
	                    price += 500;
	                }
	            }

	            System.out.print("For how many days you want room (Start 1/2): ");
	            double days = sc.nextDouble();
	            sc.nextLine(); // consume newline

	            double totalRoomPrice = price * days;
	            System.out.printf("✅ Price for Room %d: ₹%.2f\n", i + 1, totalRoomPrice);
	            System.out.printf("Room %d Booked Successfully\n", i + 1);

	            bookedRooms.add(new RoomBookingDetail(roomType, selectedRoomNumber, selectedFloor, shares, totalRoomPrice));
	        }
	        return bookedRooms;
	    }

	    private void printFinalBill(List<RoomBookingDetail> bookedRooms, double totalPrice) {
	        sc.nextLine(); // clear buffer
	        System.out.printf("\n Total Bill      : ₹%.2f\n", totalPrice);

	        if (totalPrice >= 7500 && totalPrice <= 9000) {
	            System.out.println("🎉 Congratulations! You will get 10% discount.");
	            totalPrice -= (10 * totalPrice) / 100;
	        } else if (totalPrice > 9000) {
	            System.out.println("🎉 Congratulations! You will get 15% discount.");
	            totalPrice -= (15 * totalPrice) / 100;
	        } else {
	            System.out.println("ℹ️ No discount applicable.");
	        }

	        System.out.printf(" Discounted Bill : ₹%.2f\n", totalPrice);

	        System.out.print("\n👤 Enter Your Full Name        : ");
	        String customerName = sc.nextLine().toUpperCase();

	        System.out.print("🆔 Enter Your Aadhaar Number   : ");
	        String aadhaarNo = sc.nextLine();

	        System.out.print("📞 Enter Your Mobile Number    : ");
	        long mobileNo = sc.nextLong();

	        System.out.println("\n\n╔════════════════════════════════════════════════════════════╗");
	        System.out.println("║                     🧾 SUNSET PALACE HOTEL BILL             ║");
	        System.out.println("╠════════════════════════════════════════════════════════════╣");
	        System.out.printf("║ Customer Name   : %-35s ║\n", customerName);
	        System.out.printf("║ Aadhaar Number  : %-35s ║\n", aadhaarNo);
	        System.out.printf("║ Mobile Number   : %-35d ║\n", mobileNo);
	        System.out.println("╠════════════════════════════════════════════════════════════╣");
	        System.out.printf("║ Total Rooms Booked  : %-35d ║\n", bookedRooms.size());

	        for (RoomBookingDetail detail : bookedRooms) {
	            System.out.println("╠════════════════════════════════════════════════════════════╣");
	            System.out.printf("║ Room Type       : %-35s ║\n", detail.roomType);
	            System.out.printf("║ Room No         : %-35d ║\n", detail.roomNumber);
	            System.out.printf("║ Floor           : %-35d ║\n", detail.floor);
	            System.out.printf("║ Sharing         : %-35s ║\n", detail.sharing + "-Sharing");
	            System.out.printf("║ Room Price      : ₹%-34.2f ║\n", detail.price);
	        }

	        System.out.println("╠════════════════════════════════════════════════════════════╣");
	        System.out.printf("║ Total Bill      : ₹%-34.2f ║\n", totalPrice);
	        System.out.println("╚════════════════════════════════════════════════════════════╝");
	        System.out.println("\n✅ Thank you for choosing SUNSET PALACE HOTEL!");
	        System.out.println("Visit again !!!");
	    }
	}



