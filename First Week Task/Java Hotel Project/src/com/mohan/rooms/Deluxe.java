package com.mohan.rooms;

import java.util.Scanner;

public class Deluxe {

    
    private String[][] hotel;
    private boolean[][] isBooked;
    private int[][] roomSharing;
    private Scanner sc;

    public Deluxe(String[][] hotel, boolean[][] isBooked, int[][] roomSharing, Scanner sc) {
        this.hotel = hotel;
        this.isBooked = isBooked;
        this.roomSharing = roomSharing;
        this.sc = sc;
    }

    public void deluxeRoomMenu() {
        boolean backToRoomMenu = false;

        while (!backToRoomMenu) {
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║            Deluxe Room                   ║");
            System.out.println("╠══════════════════════════════════════════╣");
            System.out.println("║ 1. View Facilities                       ║");
            System.out.println("║ 2. Available Rooms                       ║");
            System.out.println("║ 3. Pricing Information                   ║");
            System.out.println("║ 4. Optional Services                     ║");
            System.out.println("║ 5. Back to Menu                          ║");
            System.out.println("╚══════════════════════════════════════════╝");

            System.out.print("Please enter your choice: ");
            int delu = sc.nextInt();
            switch (delu) {
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
                    
                    System.out.print("\nHow much rate you will give to this facility (1 to 5): ");
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
                    System.out.println("\n🟢 Available Deluxe Rooms (Per Floor):\n");
                    boolean showAnotherShear = true;
                    while (showAnotherShear) {
                        System.out.print("How many sharing room you want? : ");
                        int shear = sc.nextInt();
                        for (int floor = 0; floor < 4; floor++) {
                            boolean found = false;
                            System.out.println("Floor " + (floor + 1) + ":");
                            for (int rooms = 0; rooms < 8; rooms++) {
                                if ("Deluxe Room".equals(hotel[floor][rooms]) &&
                                    !isBooked[floor][rooms] &&
                                    roomSharing[floor][rooms] == shear) {

                                    System.out.println("  ➤ Room " + (floor + 1) + "0" + (rooms + 1)
                                            + " " + roomSharing[floor][rooms] + " sharing is available");
                                    found = true;
                                }
                            }
                            if (!found) {
                                System.out.println("  ❌ No Deluxe Room available with " + shear + " sharing");
                            }
                            System.out.println();
                        }
                        System.out.print("\nDo you want to see another sharing availability? (yes/no): ");
                        String avai = sc.next();
                        if (avai.equalsIgnoreCase("no")) {
                            showAnotherShear = false;
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n🔹 Extra Charges (if applicable):");
                    System.out.println("   - Late Check-out: ₹300 per hour");
                    System.out.println("\n💡 Note:");
                    System.out.println("   ✔ All rooms include A/C, Wi-Fi, and TV");
                    System.out.println("   ✔ Discounts apply automatically");
                    System.out.println("   ✔ GST extra as per government rules");
                    
                    boolean showPricing = true;
                    while (showPricing) {
                        System.out.println("\n🏨 Deluxe Room Pricing Menu");
                        System.out.println("-------------------------------------");
                        System.out.println("🔹1. Deluxe Room Rates:");
                        System.out.println("🔹2. See Discounts");
                        System.out.println("🔹3. Back");
                        System.out.print("\nPlease enter your choice: ");
                        int enter = sc.nextInt();
                        switch (enter) {
                            case 1:
                                System.out.println("   - Two persons (double sharing): ₹2700 per night");
                                System.out.println("   - Three persons (triple sharing): ₹3500 per night");
                                System.out.println("   - Four persons (four sharing): ₹4500 per night");
                                System.out.println("   - Extra person: ₹500 per night");
                                break;
                            case 2:
                                System.out.println("\n🔹 Discounts on Long Stay:");
                                System.out.println("   - Final bill above ₹7500: 10% OFF");
                                System.out.println("   - Final bill above ₹9000: 15% OFF");
                                break;
                            case 3:
                                showPricing = false;
                                break;
                            default:
                                System.out.println("❌ Invalid choice. Please try again.");
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
                    break;
                case 5:
                    backToRoomMenu = true;
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }
}


