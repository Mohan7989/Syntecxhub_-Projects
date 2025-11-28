package com.mohan.billing;
	import java.util.Scanner;

	public class Billing extends Bill {
		
		
		private String name;
		private long phone;
		private String cities;
		private String modes;
		private Scanner sc = new Scanner(System.in);
		
		
		

	@Override
	public void printFinalBill() {
		
		
	    
	    
		
	    System.out.print("👤 Please enter your name: ");
	    this.name = sc.nextLine().toUpperCase();

	    System.out.print("📞 Please enter your phone number: ");
	    this.phone = sc.nextLong();
	    sc.nextLine(); 

	    System.out.print("🏙️ Please enter your city: ");
	    this.cities = sc.nextLine().toUpperCase();

	    System.out.print("💳 Which mode do you want to pay? (Cash/Online): ");
	    this.modes = sc.nextLine();

	    setGrandTotal();
	    

	    System.out.println("\n\n╔════════════════════════════════════════════════════════════════════════════════╗");
	    System.out.println("║                          🏨 SUNSET PALACE HOTEL BILL                          ║");
	    System.out.println("╠════════════════════════════════════════════════════════════════════════════════╣");
	    System.out.printf ("║ Customer Name : %-20s  Phone : %-15s               ║\n", name, phone);
	    System.out.printf ("║ City          : %-20s  Payment Mode : %-10s              ║\n", cities, modes.equalsIgnoreCase("cash") ? "Cash" : "Online");
	    System.out.println("╠════════════════════════════════════════════════════════════════════════════════╣");
	    System.out.printf("║ TOTAL AMOUNT %-55s ₹%-9.2f ║\n", "", grandTotal);
	    System.out.println("╚════════════════════════════════════════════════════════════════════════════════╝");
	    System.out.println("🧾 GST Included | No Service Charge Applied");
	    


	    
	  
	    
	    
	}

	@Override
	public void printmeals() {
	    String[] items = getOrderedItems();
	    String[] types = getPlateTypes();
	    int[] qtys = getQuantities();
	    int[] totals = getItemTotals();
	    int count = getOrderCount();
	    System.out.println("\n============== CUSTOMER DETAILS ==============");
	    System.out.println("     Please enter your details to proceed     ");
	    System.out.println("==============================================");
	    
	    
	    System.out.print("Enter your name           : ");
	    this.name = sc.nextLine().toUpperCase();

	    System.out.print("Enter your phone number   : ");
	    this.phone = sc.nextLong();
	    sc.nextLine();

	    System.out.print("Enter your city           : ");
	    this.cities = sc.nextLine().toUpperCase();

	    System.out.print("Payment Mode (Cash/Online): ");
	    this.modes = sc.nextLine().toUpperCase();

	    setGrandTotal();

	    int totalBill = 0;

	    System.out.println("\n--------------------------------------------------");
	    System.out.println("               SUNSET PALACE HOTEL");
	    System.out.println("             Final Food Bill Receipt");
	    System.out.println("--------------------------------------------------");

	    
	    System.out.printf("Name         : %-25s\n", name);
	    System.out.printf("Phone        : %-15s\n", phone);
	    System.out.printf("City         : %-25s\n", cities);
	    System.out.printf("Payment Mode : %-10s\n", modes);
	    System.out.println("--------------------------------------------------");

	    
	    System.out.printf("%-3s %-22s %-10s %-5s %-8s\n", "No", "Item", "Type", "Qty", "Amount");
	    System.out.println("--------------------------------------------------");

	    
	    for (int i = 0; i < count; i++) {
	        System.out.printf("%-3d %-22s %-10s %-5d ₹%-7d\n",
	                (i + 1), items[i], types[i], qtys[i], totals[i]);
	        totalBill += totals[i];
	    }

	    
	    System.out.println("--------------------------------------------------");
	    System.out.printf("%-42s ₹%-7d\n", "TOTAL AMOUNT", totalBill);
	    System.out.println("--------------------------------------------------");

	    
	    System.out.println("    GST Included. No extra service charges.");
	    System.out.println("      Thank you for dining with us!");
	    System.out.println("          Please visit again.");
	    System.out.println("--------------------------------------------------\n");
	    
	    return;
	}
	
}
