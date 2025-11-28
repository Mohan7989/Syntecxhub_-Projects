package com.mohan.food;

	import java.util.Scanner;

import com.mohan.billing.Billing;
import com.mohan.billing.Prices;

	public class Snaks extends Billing {
	         Billing  bobj =	new Billing(); 
		
		
		
		public String snack() {
			Scanner sc=new Scanner(System.in );
			int total= super.getSnackTotal();
			
			 
			 

	        
	         Prices priceObj = new Prices();
	         
	         while (true) {
	         	System.out.println("\n================= Snacks Menu =================");
	         	System.out.printf("%-5s %-20s %s\n", "No.", "Item", "Price");
	         	System.out.println("===============================================");

	         	for(int i=0;i<priceObj.getSnackItemCount();i++) {
	         		System.out.printf("%-5d %-20s Rs.%-5d\n", (i + 1), priceObj.getSnackItem(i), priceObj.getSnackPrice(i));

	         		
	         	}
	         	System.out.printf("%-5d %-25s\n", 6, "🔙 Back to Main Menu");
	         	System.out.printf("%-5d %-25s\n", 7, "❌ Exit");
	         	System.out.println("===============================================");

	         	System.out.print("\nPlease Enter Your Choice (1-7): "); // corrected prompt (1-7)
	         	int snacks = sc.nextInt();
	         	sc.nextLine();

	         	// first handle exit/break conditions
	         	if (snacks == 6) {
	         	    break;
	         	}
	         	if (snacks == 7) {
	         	    System.out.println("\n👋 Thank you for visiting Sunset Palace Hotel!");
	         	    System.out.println("🏨 Have a great day!");
	         	    System.exit(0);
	         	}

	         	
	         	if (snacks < 1 || snacks > priceObj.getSnackItemCount()) {
	         	    System.out.println("Invalid choice. Try again.");
	         	    continue;
	         	}

	         	// only now it's safe to access arrays
	         	int itemPrice = priceObj.getSnackPrice(snacks - 1);
	         	String itemName = priceObj.getSnackItem(snacks - 1);


	             System.out.println("You selected: " +""+ itemName + " - Price per plate: ₹" + itemPrice);
	             System.out.print("Please enter how many plates you want: ");
	             String plate = sc.nextLine();
	             Integer plates = Integer.parseInt(plate);
	            

	             
	             int itemTotal = itemPrice * plates;
	             total += itemTotal;
	             
	             

	             System.out.println("You can select "+plates+" "+"plates of "+itemName);
	             System.out.println();
	             System.out.println("Current Total Bill: ₹" + total);
	             setSnackTotal(total);
	             
	             while (true) {
	            	    System.out.print("Do you want to buy one more? (yes/no): ");
	            	    String input = sc.nextLine();
	            	    System.out.println();

	            	    if (input.equalsIgnoreCase("yes")) {
	            	        
	            	        break; 
	            	    } else if (input.equalsIgnoreCase("no")) {
	            	        setSnackTotal(total);
	            	        setGrandTotal();
	            	        printFinalBill();
	            	       return "🙏 Thank you for choosing us. Please visit again!\n";
	            	       
	            	    } else {
	            	        System.out.println("Invalid choice, try again !!");
	            	    }
	            	}

	             
	             
	         }
			return "🙏 Thank you for choosing us. Please visit again!\n";
	         
	         
			
		
		
		}

	}


