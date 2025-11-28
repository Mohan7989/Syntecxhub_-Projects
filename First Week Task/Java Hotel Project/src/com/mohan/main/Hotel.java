package com.mohan.main;

	import java.util.Arrays;

	import java.util.ArrayList;

	import java.time.LocalDate;
	import java.util.Scanner;

import com.mohan.billing.Billing;


	public class Hotel extends Billing{
		
		static int nontotal=0;
		
		public void meth1() {
			 System.out.println("         ________________________    _");
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
		        boolean backtomainmenu = true;
		        
		        Scanner sc=new Scanner(System.in );	
		      System.out.println();
		         System.out.println("           ⭆⭆⭆Main menu⭅⭅⭅              ");
		         System.out.println("           -----------------                 ");
		         System.out.println("1. Snacks");
		         System.out.println("2. Meals");
		         System.out.println("3 . Rooms ");
		         System.out.println("4 . Exit ");
		        
		        System.out.println();
		        System.out.print("Please Enter your choise =");
		        String Choice =sc.nextLine();
		        Integer choice=Integer.parseInt(Choice);
		        
		        if(choice>4) {
		        	System.out.println("Invalid Choice try again !!");
		        }
		        
		        switch(choice) {
		        
		        
		        case 4:
		            System.out.println("\n👋 Thank you for visiting Sunset Palace Hotel!");
		            System.out.println("🏨 Have a great day!");
		            System.exit(0); 
		            break;
		        	
		        
		        case 1:
		        	
		            int total = 0;

		            String[] arr1 = {"Idli Sambar", "Wada Sambar", "Masala Dosa", "Samosa", "French Fries" ,};
		            Integer[] arr2 = {50, 50, 40, 20, 50};

		            while (true) {
		            	System.out.println("\n================= Snacks Menu =================");
		            	System.out.printf("%-5s %-20s %s\n", "No.", "Item", "Price");
		            	System.out.println("===============================================");

		            	for (int i = 0; i < arr1.length; i++) {
		            	    System.out.printf("%-5d %-20s Rs.%-5d\n", (i + 1), arr1[i], arr2[i]);
		            	}
		            	System.out.printf("%-5d %-25s\n", 6, "🔙 Back to Main Menu");
		            	System.out.printf("%-5d %-25s\n", 7, "❌ Exit");
		            	System.out.println("===============================================");

		                System.out.print("\nPlease Enter Your Choice (1-5): ");
		                int snacks = sc.nextInt();
		                sc.nextLine();
		                
		                

		                
		                
		                if(snacks==6) {
		                	break;
		                }
		                if(snacks==7) {
		                	System.out.println("\n👋 Thank you for visiting Sunset Palace Hotel!");
		                    System.out.println("🏨 Have a great day!");
		                    System.exit(0); 
		                    break;
		                	
		                }if (snacks < 1 || snacks > 5) {
		                    System.out.println("Invalid choice. Try again.");
		                    continue;
		                }
		                

		                System.out.println("You selected: " +""+ arr1[snacks - 1] + " - Price per plate: ₹" + arr2[snacks - 1]);
		                System.out.print("Please enter how many plates you want: ");
		                String plate = sc.nextLine();
		                Integer plates = Integer.parseInt(plate);
		               

		                int itemPrice = arr2[snacks - 1];
		                int itemTotal = itemPrice * plates;
		                total += itemTotal;

		                System.out.println("You can select "+plates+" "+"plates of "+arr1[snacks-1]);
		                System.out.println();
		                System.out.println("Current Total Bill: ₹" + total);
	                    
		                
		                System.out.print("Do you want to buy one more? (yes/no): ");
		                String input = sc.nextLine();
		                System.out.println();

		                if (input.equalsIgnoreCase("no")) {
		                	
		                	System.out.println("");
		                	System.out.println("\n================= SUNSET PALACE HOTEL =================");
		                    System.out.println("                Customer Food Bill Receipt             ");
		                    System.out.println("-------------------------------------------------------");
		                    System.out.println("              ✅ Your  Total Bill: ₹" + total            );
		                    System.out.println("-------------------------------------------------------");
		                    System.out.println(    "Thank you for ordering from Sunset Palace Hotel!"       );
		                    System.out.println("=======================================================");
		                    break;
		                }
		                
		                backtomainmenu=true;
		            }
		            break;
		            
		        case 2:
		            int vegtotal = 0;

		            System.out.println("\n========= 🍱 Meals Menu =========");
		            System.out.println("1. Veg");
		            System.out.println("2. Non-Veg ");
		            System.out.printf("3.🔙 Back to Main Menu\n");
		            System.out.printf("4.❌ Exit");
		            System.out.println();
		            System.out.print("Please enter your choice: ");
		            int input = sc.nextInt();
		            sc.nextLine();

		            boolean exit = false;
		            while (!exit) {
		                switch (input) {
		                    case 1:
		                        String[] veg = {
		                            "Veg Thali", "Veg Biryani", "Dal Tadka", "Mix Vegetable Curry", "Paneer Butter Masala",
		                            "Matar Paneer", "Palak Paneer", "Chole Masala", "Rajma Curry", "Kadai Paneer",
		                            "Shahi Paneer", "Veg Pulao", "Jeera Rice", "Veg Fried Rice", "Vegetable Kofta",
		                            "Kaju Curry", "Baingan Bharta", "Cabbage Sabzi", "Lauki Kofta", "Roti", "Chapati"
		                        };

		                        Integer[] vegprice = {
		                            170, 100, 90, 120, 180, 170, 160, 140, 130, 160,
		                            160, 120, 60, 70, 100, 190, 80, 80, 80, 15, 12
		                        };

		                        String[] vegfull = {
		                            "-", "190", "170", "230", "350", "340", "320", "270", "250", "310",
		                            "310", "240", "120", "140", "200", "380", "150", "150", "150", "-", "-"
		                        };

		                        String[] orderedItems = new String[100];
		                        String[] plateTypes = new String[100];
		                        int[] quantities = new int[100];
		                        int[] itemTotals = new int[100];
		                        int orderCount = 0;

		                        Integer[] vegfu = new Integer[vegfull.length];
		                        for (int i = 0; i < vegfull.length; i++) {
		                            if (vegfull[i].equals("-")) {
		                                vegfu[i] = null;
		                            } else {
		                                vegfu[i] = Integer.parseInt(vegfull[i]);
		                            }
		                        }

		                        boolean moreItems = true;
		                        while (moreItems) {
		                            System.out.println("\n=============== 🥗 Veg Menu ===============");
		                            System.out.printf("%-5s %-25s %-10s %-10s\n", "ID", "Item", "Half (₹)", "Full (₹)");
		                            System.out.println("==========================================================");
		                            for (int i = 0; i < veg.length; i++) {
		                                System.out.printf("%-5d %-25s %-10d %-10s\n", (i + 1), veg[i], vegprice[i], vegfull[i]);
		                            }

		                            System.out.println("==========================================");
		                            System.out.print("Please Enter Your Choice (1 to " + veg.length + "): ");
		                            int veginput = sc.nextInt();
		                            sc.nextLine();

		                            if (veginput < 1 || veginput > veg.length) {
		                                System.out.println("❌ Invalid choice.");
		                                continue;
		                            }

		                            String selectedItem = veg[veginput - 1];
		                            System.out.println("You can select " + selectedItem);

		                            if (selectedItem.equalsIgnoreCase("Roti") || selectedItem.equalsIgnoreCase("Chapati")) {
		                                System.out.print("How many " + selectedItem + " would you like? : ");
		                                int qty = sc.nextInt();
		                                sc.nextLine();
		                                int unitPrice = vegprice[veginput - 1];
		                                int itemTotal = unitPrice * qty;
		                                vegtotal += itemTotal;
		                                System.out.println("✅ You ordered " + qty + " " + selectedItem + "(s) for ₹" + itemTotal);
		                                System.out.println("🧾 Current Bill: ₹" + vegtotal);

		                                orderedItems[orderCount] = selectedItem;
		                                plateTypes[orderCount] = "PER PIECE";
		                                quantities[orderCount] = qty;
		                                itemTotals[orderCount] = itemTotal;
		                                orderCount++;
		                            } else {
		                                while (true) {
		                                    System.out.print("You want full plate or half plate? : ");
		                                    String fh = sc.nextLine().trim().toLowerCase();

		                                    if (fh.equals("half")) {
		                                        int price = vegprice[veginput - 1];
		                                        System.out.println("✅ Half plate of " + selectedItem + " is ₹" + price);
		                                        System.out.print("How many half plates of " + selectedItem + " you want? : ");
		                                        int qty = sc.nextInt();
		                                        sc.nextLine();
		                                        int itemTotal = price * qty;
		                                        vegtotal += itemTotal;
		                                        System.out.println("🧾 Current Bill: ₹" + vegtotal);
		                                        orderedItems[orderCount] = selectedItem;
		                                        plateTypes[orderCount] = "HALF";
		                                        quantities[orderCount] = qty;
		                                        itemTotals[orderCount] = itemTotal;
		                                        orderCount++;
		                                        break;
		                                    } else if (fh.equals("full")) {
		                                        if (vegfu[veginput - 1] != null) {
		                                            int fullPrice = vegfu[veginput - 1];
		                                            System.out.println("✅ Full plate of " + selectedItem + " is ₹" + fullPrice);
		                                            System.out.print("How many full plates of " + selectedItem + " you want? : ");
		                                            int qty = sc.nextInt();
		                                            sc.nextLine();
		                                            int itemTotal = fullPrice * qty;
		                                            vegtotal += itemTotal;
		                                            System.out.println("🧾 Current Bill: ₹" + vegtotal);
		                                            orderedItems[orderCount] = selectedItem;
		                                            plateTypes[orderCount] = "FULL";
		                                            quantities[orderCount] = qty;
		                                            itemTotals[orderCount] = itemTotal;
		                                            orderCount++;
		                                            break;
		                                        } else {
		                                            int price = vegprice[veginput - 1];
		                                            System.out.println("❌ Full plate not available for this item.");
		                                            System.out.println("✅ Half plate of " + selectedItem + " is ₹" + price);
		                                            System.out.print("How many half plates of " + selectedItem + " you want? : ");
		                                            int qty = sc.nextInt();
		                                            sc.nextLine();
		                                            int itemTotal = price * qty;
		                                            vegtotal += itemTotal;
		                                            System.out.println("🧾 Current Bill: ₹" + vegtotal);
		                                            orderedItems[orderCount] = selectedItem;
		                                            plateTypes[orderCount] = "HALF";
		                                            quantities[orderCount] = qty;
		                                            itemTotals[orderCount] = itemTotal;
		                                            orderCount++;
		                                            break;
		                                        }
		                                    } else {
		                                        System.out.println("❌ Invalid input. Please enter 'half' or 'full'.");
		                                    }
		                                }
		                            }

		                            while (true) {
		                                System.out.print("Do You Want To Take More Items? (yes/no): ");
		                                String input2 = sc.nextLine().trim().toLowerCase();

		                                if (input2.equals("yes")) {
		                                    moreItems = true;
		                                    break;
		                                } else if (input2.equals("no")) {
		                                    moreItems = false;

		                                    System.out.print("👤 Please enter your name: ");
		                                    String name = sc.nextLine().toUpperCase();

		                                    System.out.print("📞 Please enter your phone number: ");
		                                    String phone = sc.nextLine();

		                                    System.out.print("🏙️ Please enter your city: ");
		                                    String city = sc.nextLine().toUpperCase();

		                                    System.out.print("💳 Which mode do you want to pay? (Cash/Online): ");
		                                    String mode = sc.nextLine();

		                                    System.out.println("\n\n╔════════════════════════════════════════════════════════════════════════════╗");
		                                    System.out.println("║                          🏨 SUNSET PALACE HOTEL BILL                       ║");
		                                    System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");
		                                    System.out.printf("║ Customer Name : %-20s  Phone : %-15s           ║\n", name, phone);
		                                    System.out.printf("║ City          : %-20s  Payment Mode : %-10s          ║\n", city, mode.equalsIgnoreCase("cash") ? "Cash" : "Online");
		                                    System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");
		                                    System.out.printf("║ %-4s %-25s %-15s %-6s %-10s ║\n", "No.", "Item", "Type", "Qty", "Amount");
		                                    System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");

		                                    for (int i = 0; i < orderCount; i++) {
		                                        System.out.printf("║ %-4d %-25s %-15s %-6d ₹%-9d ║\n", (i + 1), orderedItems[i], plateTypes[i], quantities[i], itemTotals[i]);
		                                    }

		                                    System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");
		                                    System.out.printf("║ %-55s ₹%-9d ║\n", "TOTAL AMOUNT", vegtotal);
		                                    System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
		                                    System.out.println("🧾 GST Included | No Service Charge Applied");
		                                    System.out.println("🙏 Thank you for choosing us. Please visit again!\n");

		                                    exit = true;
		                                    break;
		                                } else {
		                                    System.out.println("❌ Invalid input. Please type 'yes' or 'no'.");
		                                }
		                            }
		                        }

		                        break;

		                    case 2:
		                        System.out.println("🚫 Non-Veg Menu");
		                        
		                        String[] nonvegmenu = {
		                        	    "Chicken Thali",
		                             "Mutton Thali",
		                        	    "Egg Thali",
		                        	    "Butter Chicken",
		                        	    "Chicken Biryani",
		                        	    "Mutton Biryani",
		                        	    "Egg Curry",
		                        	    "Chicken Curry",
		                        	    "Mutton Curry",
		                        	    "Fish Curry",
		                        	    "Chiken handi",
		                        	    "Mutton Handi",
		                        	    "Tandoori Chicken",
		                        	    "Chicken Lollipop",
		                        	    "Chicken Korma",
		                        	    "Mutton Rogan Josh",
		                        	    "Egg Bhurji",
		                                "Prawns Biryani",
		                        	    "Fish Fry",
		                        	    "Chicken Malai Tikka",
		                        	    "Chicken 65",
		                        	    "Chiken Fried Rice",
		                        	    "Roti",
		                        	    "Chapati"
		                        	};
		                        Integer nonhalf[]= {200,250,120,220,150,210,90,250,310,210,250,350,200,90,210,270,50,150,240,180,80,80,12,15};
		                        String nonfulls[]= {"-","-","-"," 430"," 290","  410"," 160","  490","  610","  420","  500","  700","  400","  180"," 410","  530"," 100","  280","  480"," 360"," 160","  160","-","-"};
		                        
		                        Integer[] nonfull = new Integer[nonfulls.length];
		                        for (int i = 0; i < nonfulls.length; i++) {
		                            if (nonfulls[i] != null && nonfulls[i].equals("-")) {
		                                nonfull[i] = null;
		                            } else if (nonfulls[i] != null) {
		                                nonfull[i] = Integer.parseInt(nonfulls[i].trim().replaceAll("[^0-9]", ""));
		                            } else {
		                                nonfull[i] = null;
		                        }
		                        }
		                        String[] nonItems = new String[50];
		                        int[] nonQty = new int[50];
		                        int[] nonPrices = new int[50];
		                        int nonIndex = 0;
		                        
		                        while(true) {
		                        System.out.println("\n================🍗 Non-Veg Menu 🍗================");
		                        System.out.println(String.format("%-5s %-25s %-15s %-15s", "No.", "Item", "Half Price (₹)", "Full Price (₹)"));
		                        System.out.println("-------------------------------------------------------------");
		                        for (int i = 0; i < nonfulls.length; i++) {
		                            String item = nonvegmenu[i];
		                            String halfPrice = "₹" + nonhalf[i];
		                            String fullPrice = (nonfull[i] == null) ? "-" : "₹" + nonfull[i];
		                            
		                            System.out.println(String.format("%-5d %-25s %-15s %-15s", 
		                                (i + 1), item, halfPrice, fullPrice));
		                        }
		                        System.out.println("=============================================================\n");
		                        
		                        
		                        
		                        System.out.print("Please Enter Your Choice from (1 to "+nonvegmenu.length +") :");
		                        String nonchoices=sc.nextLine().trim();
		                        int nonchoice=Integer.parseInt(nonchoices); 
		                        String selectdish=nonvegmenu[nonchoice-1].toLowerCase().trim();
		                        
		                        if (nonchoice < 1 || nonchoice > nonvegmenu.length) {
		                            System.out.println("Invalid choice. Please select a number between 1 and " + nonvegmenu.length);
		                            continue;
		                        }
		                        
		                       
		                      
		                        int currentbill=0;
		                        
		            
		                        if(selectdish.equalsIgnoreCase("Chicken Thali") || selectdish.equalsIgnoreCase("Mutton Thali") || selectdish.equalsIgnoreCase("Egg Thali") || selectdish.equalsIgnoreCase("roti") || selectdish.equalsIgnoreCase("chapati")) {
		                        	System.out.println("You can select " + nonvegmenu[nonchoice - 1]);
		                        	System.out.print("How many " + nonvegmenu[nonchoice - 1] + " you want: ");
		                        	
		                        	Integer many = Integer.parseInt(sc.nextLine());
		                        	System.out.println("You can select " + many + " " + selectdish);
		                        	System.out.println();

		                        	currentbill = nonhalf[nonchoice - 1] * many;
		                        	nontotal += currentbill;
		                        	
		                        	System.out.println("You current bill is :"+currentbill);
		                        	nonItems[nonIndex] = nonvegmenu[nonchoice - 1];
		                        	nonQty[nonIndex] = many;
		                        	nonPrices[nonIndex] = currentbill;
		                        	nonIndex++;
		                        	

		                        	System.out.print("Do you want to buy more items? (yes/no): ");
		                        	String more = sc.nextLine().toLowerCase().trim();

		                        	if (more.equals("yes")) {
		                        		continue;
		                        	} else if (more.equals("no")) {
		                        		System.out.println("Your final bill is ₹" + nontotal);
		                        		
		                        		
		                        		 System.out.print("👤 Please enter your name: ");
		                        	        String name = sc.nextLine().toUpperCase();

		                        	        System.out.print("📞 Please enter your phone number: ");
		                        	        String phone = sc.nextLine();

		                        	        System.out.print("🏙️ Please enter your city: ");
		                        	        String city = sc.nextLine().toUpperCase();

		                        	        System.out.print("💳 Which mode do you want to pay? (Cash/Online): ");
		                        	        String mode = sc.nextLine();

		                        	        System.out.println("\n===================== 🍗 Ordered Items Summary =====================");
		                        	        System.out.printf("%-5s %-30s %-10s %-10s\n", "No.", "Item", "Qty", "Price");
		                        	        System.out.println("---------------------------------------------------------------------");

		                        	        for (int i = 0; i < nonIndex; i++) {
		                        	            System.out.printf("%-5d %-30s %-10d ₹%-10d\n", 
		                        	                              (i + 1), nonItems[i], nonQty[i], nonPrices[i]);
		                        	        }

		                        	        System.out.println("---------------------------------------------------------------------");

		                        	        
		                        	        System.out.println("\n========================= 🧾 Final Bill =========================");
		                        	        System.out.println("Name         : " + name);
		                        	        System.out.println("Phone No.    : " + phone);
		                        	        System.out.println("City         : " + city);
		                        	        System.out.println("Payment Mode : " + (mode.equalsIgnoreCase("cash") ? "Cash" : "Online"));
		                        	        System.out.println("---------------------------------------------------------------");
		                        	        System.out.println("Total Amount : ₹" + nontotal);
		                        	        System.out.println("================================================================");
		                        	        System.out.println("🙏 Thank you for Visiting. Please Visit Again!");
		                        	        exit = true;
		                        	        break;

		                        		
		                        	}
		                        

		                        	
		                        	
		                        	
		                        	
		                        

		                        }else {
		                        
		                        System.out.println("You can select"+"  "+nonvegmenu[nonchoice-1]);
		                        System.out.print("You want half plate or full plate :");
		                        String nonplate=sc.nextLine().trim().toLowerCase();
		                     
		                        if (nonplate.equalsIgnoreCase("half")) {
		                            System.out.println("Half plate of " + nonvegmenu[nonchoice - 1] + " is ₹ " + nonhalf[nonchoice - 1]);
		                            System.out.println();
		                            
		                            System.out.print("How many half plates you want: ");
		                            int no = sc.nextInt();
		                            sc.nextLine(); 

		                            System.out.println();
		                            System.out.println("You selected " + no + " half plates");

		                            currentbill = no * nonhalf[nonchoice - 1];
		                            nontotal += currentbill;

		                            System.out.println("Your current bill is ₹" + currentbill);
		                            nonItems[nonIndex] = nonvegmenu[nonchoice - 1] + " (Half Plate)";
		                            nonQty[nonIndex] = no;
		                            nonPrices[nonIndex] = currentbill;
		                            nonIndex++;

	                                     
	                                     System.out.println();

		                            System.out.print("Do you want to buy more items? (yes/no): ");
		                            String more = sc.nextLine().toLowerCase().trim();

		                            if (more.equals("yes")) {
		                                continue;
		                            } else {
		                                System.out.println("Your final bill is ₹" + nontotal);
		                                
		                                System.out.println("\n Please enter details to proceed bill ");
		                                
		                                System.out.print("👤 Please enter your name: ");
	                        	        String name = sc.nextLine().toUpperCase();

	                        	        System.out.print("📞 Please enter your phone number: ");
	                        	        String phone = sc.nextLine();

	                        	        System.out.print("🏙️ Please enter your city: ");
	                        	        String city = sc.nextLine().toUpperCase();

	                        	        System.out.print("💳 Which mode do you want to pay? (Cash/Online): ");
	                        	        String mode = sc.nextLine();

	                        	        System.out.println("\n===================== 🍗 Ordered Items Summary =====================");
	                        	        System.out.printf("%-5s %-30s %-10s %-10s\n", "No.", "Item", "Qty", "Price");
	                        	        System.out.println("---------------------------------------------------------------------");

	                        	        for (int i = 0; i < nonIndex; i++) {
	                        	            System.out.printf("%-5d %-30s %-10d ₹%-10d\n", 
	                        	                              (i + 1), nonItems[i], nonQty[i], nonPrices[i]);
	                        	        }

	                        	        System.out.println("\n===================== 🍗 Ordered Items Summary =====================");
	                        	        System.out.printf("%-5s %-30s %-10s %-10s\n", "No.", "Item", "Qty", "Price");
	                        	        System.out.println("---------------------------------------------------------------------");

	                        	        for (int i = 0; i < nonIndex; i++) {
	                        	            System.out.printf("%-5d %-30s %-10d ₹%-10d\n", 
	                        	                              (i + 1), nonItems[i], nonQty[i], nonPrices[i]);
	                        	        }

	                        	        System.out.println("---------------------------------------------------------------------");

	                        	        // ✅ Final Bill
	                        	        System.out.println("\n========================= 🧾 Final Bill =========================");
	                        	        System.out.println("Name         : " + name);
	                        	        System.out.println("Phone No.    : " + phone);
	                        	        System.out.println("City         : " + city);
	                        	        System.out.println("Payment Mode : " + (mode.equalsIgnoreCase("cash") ? "Cash" : "Online"));
	                        	        System.out.println("---------------------------------------------------------------");
	                        	        System.out.println("Total Amount : ₹" + nontotal);
	                        	        System.out.println("================================================================");
	                        	        System.out.println("🙏 Thank you for Visiting. Please Visit Again!");
	                        	        exit = true;
	                        	        break;
	                        	        
		                            
		                                
		                            }
		                        

		                          }else {
		                        	System.out.println("Full plate of"+" "+nonvegmenu[(nonchoice-1)] +" "+"is  ₹ "+nonfull[nonchoice-1]);
		                        	 System.out.println();
			                            System.out.print("How many full plates you want :");
			                            int no = sc.nextInt();
			                            sc.nextLine();
			                            System.out.println();
			                            System.out.println("You can select "+""+no+" "+"full plates");
			                            currentbill= no*(nonfull[nonchoice-1]);
			                            nontotal +=currentbill;
			                           
			                            System.out.println("Your current bill is"+" "+currentbill);
			                            nonItems[nonIndex] = nonvegmenu[nonchoice - 1] + " (Full Plate)";
			                            nonQty[nonIndex] = no;
			                            nonPrices[nonIndex] = currentbill;
			                            nonIndex++;
			                            System.out.println();
			                            String more = "";

			                            while (true) {
			                                System.out.print("Do you want to buy more items? (yes/no): ");
			                                more = sc.next().toLowerCase().trim();
			                                sc.nextLine();
			                                if (more.equals("yes") || more.equals("no")) {
			                                    break; 
			                                } else {
			                                    System.out.println("Invalid choice, please enter again (yes/no)");
			                                }
			                            }

			                           
			                            
			                            

			                            if (more.equals("yes")) {
			                                continue;
			                            }  else {
			                                System.out.println("Your final bill is ₹" + nontotal);
			                                
			                                System.out.print("👤 Please enter your name: ");
		                        	        String name = sc.nextLine().toUpperCase();

		                        	        System.out.print("📞 Please enter your phone number: ");
		                        	        String phone = sc.nextLine();

		                        	        System.out.print("🏙️ Please enter your city: ");
		                        	        String city = sc.nextLine().toUpperCase();

		                        	        System.out.print("💳 Which mode do you want to pay? (Cash/Online): ");
		                        	        String mode = sc.nextLine();

		                        	        System.out.println("\n===================== 🍗 Ordered Items Summary =====================");
		                        	        System.out.printf("%-5s %-30s %-10s %-10s\n", "No.", "Item", "Qty", "Price");
		                        	        System.out.println("---------------------------------------------------------------------");

		                        	        for (int i = 0; i < nonIndex; i++) {
		                        	            System.out.printf("%-5d %-30s %-10d ₹%-10d\n", 
		                        	                              (i + 1), nonItems[i], nonQty[i], nonPrices[i]);
		                        	        }

		                        	        System.out.println("---------------------------------------------------------------------");

		                        	        // ✅ Final Bill
		                        	        System.out.println("\n========================= 🧾 Final Bill =========================");
		                        	        System.out.println("Name         : " + name);
		                        	        System.out.println("Phone No.    : " + phone);
		                        	        System.out.println("City         : " + city);
		                        	        System.out.println("Payment Mode : " + (mode.equalsIgnoreCase("cash") ? "Cash" : "Online"));
		                        	        System.out.println("---------------------------------------------------------------");
		                        	        System.out.println("Total Amount : ₹" + nontotal);
		                        	        System.out.println("================================================================");
		                        	        System.out.println("🙏 Thank you for Visiting. Please Visit Again!");
		                        	        exit = true;
		                        	        break;
		                        	        
		                        	        

			                             
			                            }
			                            
			                            
			                           
		                        	
		                        }
		                        }
		                        
		                        
		                        

		                        break;
		                        }

		                    
		                 
		                    break;
		                    
		                    
		                    
		                    case 3:
		                        System.out.println("🙏 Thank you for visiting. Come again!");
		                        exit=true;
		                        break;
		                       
		                        

		                    default:
		                        System.out.println("❌ Invalid option. Please choose 1, 2, or 3.");
		                        exit=true;
		                        break;
		                }
		                
		               
		                
		                
		            }
		                break;
		                
		        case 3:
		        	
		        	
		        	 String[] types = {
		        	            "Deluxe Room", "Deluxe Room",
		        	            "AC Room", "AC Room",
		        	            "Non-AC Room", "Non-AC Room",
		        	            "Luxury Room", "Luxury Room",
		        	            "Luxury Room", "Luxury Room"
		        	        };
		        	 String hotel[][]=new String[4][8];
		        	 int roomSharing[][]=new int[4][8];
		        	 
		        	boolean isbooked[][]= new boolean[4][8];
		        	
		        	for (int floor = 0; floor < 4; floor++) {
		        	    for (int room = 0; room < 8; room++) {
		        	        hotel[floor][room] = types[room];
		        	    }
		        	}
		        	for (int floor = 0; floor < 4; floor++) {
		        	    System.out.print("Floor " + (floor + 1) + ": | ");
		        	    for (int room = 0; room <= 7; room++) {
		        	        System.out.print(String.format("%-13s", hotel[floor][room]) + " | ");
		        	    }
		        	    System.out.println(); 
		        	}

		
		        	

	isbooked[0][1] = true;  // Floor 1, Room 2 - lux
	isbooked[0][3] = true;  // Floor 1, Room 4 - AC
	isbooked[0][6]=true;
	isbooked[1][0] = true;  // Floor 2, Room 1 - lux
	isbooked[1][5] = true;  // Floor 2, Room 6 - Non-AC
	isbooked[2][7] = true; // Floor 3, Room 8 - Suite
	isbooked[3][3]=true;

		             
		             
		             
		             roomSharing[0][0] = 2;  // Deluxe Room
		             roomSharing[0][1] = 3;  // Deluxe Room
		             roomSharing[0][2] = 2;  // AC Room
		             roomSharing[0][3] = 4;  // AC Room
		             roomSharing[0][4] = 3;  // Non-AC Room
		             roomSharing[0][5] = 2;  // Non-AC Room
		             roomSharing[0][6] = 4;  // lux Room
		             roomSharing[0][7] = 2;  // lux Room

		             // Floor 2
		             roomSharing[1][0] = 3;
		             roomSharing[1][1] = 4;
		             roomSharing[1][2] = 4;
		             roomSharing[1][3] = 2;
		             roomSharing[1][4] = 3;
		             roomSharing[1][5] = 2;
		             roomSharing[1][6] = 4;
		             roomSharing[1][7] = 2;

		             // Floor 3
		             roomSharing[2][0] = 4;
		             roomSharing[2][1] = 2;
		             roomSharing[2][2] = 2;
		             roomSharing[2][3] = 2;
		             roomSharing[2][4] = 3;
		             roomSharing[2][5] = 2;
		             roomSharing[2][6] = 4;
		             roomSharing[2][7] = 2;
		             
		             //floor4
		             roomSharing[2][0] = 4;
		             roomSharing[2][1] = 3;
		             roomSharing[2][2] = 4;
		             roomSharing[2][3] = 3;
		             roomSharing[2][4] = 4;
		             roomSharing[2][5] = 3;
		             roomSharing[2][6] = 4;
		             roomSharing[2][7] = 3;
		             
		             
		        	  
		        	
		        	 System.out.println();
		        	
		        	 boolean backmainmenu = false;
		        	
		        	

		        	 while (!backmainmenu) {
		        		 
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
		        	     
		        	     System.out.println();

		        	     String type[] = {"Deluxe Room", "AC Room  ", "Non-AC Room ", "Suite Room ", "Rooms Facilities "};
		        	     System.out.println();
		        	     
		        	     System.out.print("➡️  Please enter your choice which type of room you want ? : ");
		        	     int room = sc.nextInt();

		        	     if (room >= 1 && room <= 4) {
		        	         System.out.println("You can select " + type[room - 1]);
		        	     }

		        	     switch (room) {
		        	     
		        	     case 7:
		        	            System.out.println("🚪 Exiting from Main Menu...");
		        	            backmainmenu = true;
		        	            break;
		        	    	 
		        	         case 1:
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

		        	                 System.out.print("Please enter your choice :");
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
		        	                         System.out.println("\n🟢 Available Deluxe Rooms (Per Floor):\n");
		        	                         boolean showAnotherShear = true;
		        	                         while (showAnotherShear) {
		        	                             System.out.print("How many shearing room you want ? :");
		        	                             int shear = Integer.parseInt(sc.next());
		        	                             for (int floor = 0; floor < 4; floor++) {
		        	                                 boolean found = false;
		        	                                 System.out.println("Floor " + (floor + 1) + ":");
		        	                                 for (int rooms = 0; rooms < 8; rooms++) {
		        	                                     if (hotel[floor][rooms].equals("Deluxe Room") && !isbooked[floor][rooms] && roomSharing[floor][rooms] == shear) {
		        	                                         System.out.println("  ➤ Room " + (floor + 1) + "0" + (rooms + 1)
		        	                                                 + " " + roomSharing[floor][rooms] + " sharing is available ");
		        	                                         found = true;
		        	                                     }
		        	                                 }
		        	                                 if (!found) {
		        	                                     System.out.println("  ❌ No Deluxe Room Available with " + shear + " sharing");
		        	                                 }
		        	                                 System.out.println();
		        	                             }
		        	                             System.out.print("\nDo you want to see another shearing availability? (yes/no) :");
		        	                             String avai = sc.next();
		        	                             if (avai.equalsIgnoreCase("no")) {
		        	                                 showAnotherShear = false;
		        	                             }
		        	                         }
		        	                         break;
		        	                     case 3:
		        	                    	  System.out.println("\n🔹 Extra Charges (if applicable):");
		        	                             System.out.println("   - Late Check-out 3: ₹300 per hour");
		        	                             System.out.println("\n💡 Note:");
		        	                             System.out.println("   ✔ All rooms include A/C, Wi-Fi, and TV");
		        	                             System.out.println("   ✔ Discounts apply automatically");
		        	                             System.out.println("   ✔ GST extra as per government rules");
		        	                             
		        	                         boolean showPricing = true;
		        	                         while (showPricing) {
		        	                           

		        	                             System.out.println("\n🏨 Deluxe Room Pricing Menu");
		        	                             System.out.println("-------------------------------------");
		        	                             System.out.println("🔹1. Deluxe Room Rates:");
		        	                             System.out.println("🔹2. See Discounts ");
		        	                             
		        	                             System.out.println("🔹3. Back ");
		        	                             System.out.print("\nPlease enter your choice :");

		        	                             int enter = sc.nextInt();
		        	                             switch (enter) {
		        	                                 case 1:
		        	                                     System.out.println("   - Two persons (double sharing): ₹2700 per night");
		        	                                     System.out.println("   - Three person (triple sharing): ₹3500 per night");
		        	                                     System.out.println("   - Four person (four sharing): ₹4500 per night");
		        	                                     System.out.println("   - Extra person : ₹500 per night");
		        	                                     break;
		        	                                 case 2:
		        	                                     System.out.println("\n🔹 Discounts on Long Stay:");
		        	                                     System.out.println("   - Final bill above RS.7500: 10% OFF");
		        	                                     System.out.println("   - Final bill above RS.9000: 15% OFF");
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
		        	                     
		        	                     case 5:
		        	                         backToRoomMenu = true;
		        	                         break;
		        	                     default:
		        	                         System.out.println("❌ Invalid choice. Please try again.");
		        	                         break;
		        	                 }
		        	             }
		        	             break;
		        	         
		        	         case 2:
		        	        	 
		        	        	  backToRoomMenu = false;
		        	             while (!backToRoomMenu) {
		        	                 System.out.println("╔══════════════════════════════════════════╗");
		        	                 System.out.println("║             AC Room                      ║");
		        	                 System.out.println("╠══════════════════════════════════════════╣");
		        	                 System.out.println("║ 1. View Facilities                       ║");
		        	                 System.out.println("║ 2. Available Rooms                       ║");
		        	                 System.out.println("║ 3. Pricing Information                   ║");
		        	                 System.out.println("║ 4. Optional Services                     ║");
		        	                 System.out.println("║ 5. Back to  Menu                         ║");
		        	                 System.out.println("╚══════════════════════════════════════════╝");

		        	                 System.out.print("Please enter your choice :");
		        	                 int delu = sc.nextInt();
		        	                 switch (delu) {
		        	                     case 1:
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
		        	                         System.out.println("\n🟢 Available AC ROOMS  (Per Floor):\n");
		        	                         boolean showAnotherShear = true;
		        	                         while (showAnotherShear) {
		        	                             System.out.print("How many shearing room you want ? :");
		        	                             int shear = Integer.parseInt(sc.next());
		        	                             for (int floor = 0; floor < 4; floor++) {
		        	                                 boolean found = false;
		        	                                 System.out.println("Floor " + (floor + 1) + ":");
		        	                                 for (int rooms = 0; rooms < 8; rooms++) {
		        	                                     if (hotel[floor][rooms].equals("AC Room") && !isbooked[floor][rooms] && roomSharing[floor][rooms] == shear) {
		        	                                         System.out.println("  ➤ Room " + (floor + 1) + "0" + (rooms + 1)
		        	                                                 + " " + roomSharing[floor][rooms] + " sharing is available ");
		        	                                         found = true;
		        	                                     }
		        	                                 }
		        	                                 if (!found) {
		        	                                     System.out.println("  ❌ No AC Room Available with " + shear + " sharing");
		        	                                 }
		        	                                 System.out.println();
		        	                             }
		        	                             System.out.println("\nDo you want to see another shearing availability? (yes/no)");
		        	                             String avai = sc.next();
		        	                             if (avai.equalsIgnoreCase("no")) {
		        	                                 showAnotherShear = false;
		        	                             }
		        	                         }
		        	                         break;
		        	                     case 3:
		        	                    	  System.out.println("\n🔹 Extra Charges (if applicable):");
		        	                             System.out.println("   - Late Check-out 3: ₹300 per hour");
		        	                             System.out.println("\n💡 Note:");
		        	                             System.out.println("   ✔ All rooms include A/C, Wi-Fi, and TV");
		        	                             System.out.println("   ✔ Discounts apply automatically");
		        	                             System.out.println("   ✔ GST extra as per government rules");
		        	                             
		        	                         boolean showPricing = true;
		        	                         while (showPricing) {
		        	                           

		        	                             System.out.println("\n🏨 AC Room Pricing Menu");
		        	                             System.out.println("-------------------------------------");
		        	                             System.out.println("🔹1. AC Room Rates:");
		        	                             System.out.println("🔹2. See Discounts ");
		        	                        
		        	                             System.out.println("🔹3. Back ");
		        	                             System.out.print("\nPlease enter your choice :");

		        	                             int enter = sc.nextInt();
		        	                             switch (enter) {
		        	                                 case 1:
		        	                                     System.out.println("   - Two persons (double sharing): ₹2200 per night");
		        	                                     System.out.println("   - Three person (triple sharing): ₹3200 per night");
		        	                                     System.out.println("   - Four person (four sharing): ₹4200 per night");
		        	                                     System.out.println("   - Extra person : ₹500 per night");
		        	                                     break;
		        	                                 case 2:
		        	                                     System.out.println("\n🔹 Discounts on Long Stay:");
		        	                                     System.out.println("   - Final bill above RS.7500: 10% OFF");
		        	                                     System.out.println("   - Final bill above RS.9000: 15% OFF");
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
		        	             break;
		        	        	 
		        	         case 3:
		        	        	 
		        	        	 backToRoomMenu = false;
		        	             while (!backToRoomMenu) {
		        	                 System.out.println("╔══════════════════════════════════════════╗");
		        	                 System.out.println("║            Non AC Room                   ║");
		        	                 System.out.println("╠══════════════════════════════════════════╣");
		        	                 System.out.println("║ 1. View Facilities                       ║");
		        	                 System.out.println("║ 2. Available Rooms                       ║");
		        	                 System.out.println("║ 3. Pricing Information                   ║");
		        	                 System.out.println("║ 4. Optional Services                     ║");
		        	                 System.out.println("║ 5. Back to Menu                          ║");
		        	                 System.out.println("╚══════════════════════════════════════════╝");

		        	                 System.out.print("Please enter your choice :");
		        	                 int delu = sc.nextInt();
		        	                 switch (delu) {
		        	                     case 1:
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
		        	                         System.out.println("\n🟢 Available Non-AC ROOMS  (Per Floor):\n");
		        	                         boolean showAnotherShear = true;
		        	                         while (showAnotherShear) {
		        	                             System.out.print("How many shearing room you want ? :");
		        	                             int shear = Integer.parseInt(sc.next());
		        	                             for (int floor = 0; floor < 4; floor++) {
		        	                                 boolean found = false;
		        	                                 System.out.println("Floor " + (floor + 1) + ":");
		        	                                 for (int rooms = 0; rooms < 8; rooms++) {
		        	                                     if (hotel[floor][rooms].equals("Non-AC Room") && !isbooked[floor][rooms] && roomSharing[floor][rooms] == shear) {
		        	                                         System.out.println("  ➤ Room " + (floor + 1) + "0" + (rooms + 1)
		        	                                                 + " " + roomSharing[floor][rooms] + " sharing is available ");
		        	                                         found = true;
		        	                                     }
		        	                                 }
		        	                                 if (!found) {
		        	                                     System.out.println("  ❌ No Non-AC Room Available with " + shear + " sharing");
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
		        	                           

		        	                             System.out.println("\n🏨 Non-AC Room Pricing Menu");
		        	                             System.out.println("-------------------------------------");
		        	                             System.out.println("🔹1.Non- AC Room Rates:");
		        	                             System.out.println("🔹2. See Discounts ");
		        	                        
		        	                             System.out.println("🔹3. Back ");
		        	                             System.out.print("\nPlease enter your choice :");

		        	                             int enter = sc.nextInt();
		        	                             switch (enter) {
		        	                                 case 1:
		        	                                     System.out.println("   - Two persons (double sharing): ₹1400 per night");
		        	                                     System.out.println("   - Three person (triple sharing): ₹2000 per night");
		        	                                     System.out.println("   - Four person (four sharing): ₹2700 per night");
		        	                                     System.out.println("   - Extra person : ₹500 per night");
		        	                                     break;
		        	                                 case 2:
		        	                                     System.out.println("\n🔹 Discounts on Long Stay:");
		        	                                     System.out.println("   - Final bill above RS.7500: 10% OFF");
		        	                                     System.out.println("   - Final bill above RS.9000: 15% OFF");
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
		        	             break;
		        	        	 
		        	         
		        	         case 4:
		        	        	 System.out.println("suite rooms");
		        	        	 backToRoomMenu = false;
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
		        	                                     if (hotel[floor][rooms].equals("Luxury") && !isbooked[floor][rooms] && roomSharing[floor][rooms] == shear) {
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
		        	             break;
		        	        	 
		        	        	 
		        	        	 
		        	        	 
		        	        	 
		        	         case 5:
		        	        	 backToRoomMenu=false;
		        	        	
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
		        	             break;
						
		        	         case 6:
		        	        	
		        	        	 ArrayList<Integer> bookedRoomNumbers = new ArrayList<>();  

		        	        	 backToRoomMenu = false;
		        	        	 
		        	        	 while (!backToRoomMenu) {
		        	        	     System.out.println("╔════════════════════════════════════════════╗");
		        	        	     System.out.println("║           🛏️ Room Booking                  ║");
		        	        	     System.out.println("╠════════════════════════════════════════════╣");
		        	        	     System.out.println("║ 1. Deluxe Room                             ║");
		        	        	     System.out.println("║ 2. AC Room                                 ║");
		        	        	     System.out.println("║ 3. Non-AC Room                             ║");
		        	        	     System.out.println("║ 4. Luxury Room                             ║");
		        	       	     
		        	        	     System.out.println("║ 5. Back to  Menu                           ║");
		        	        	     System.out.println("╚════════════════════════════════════════════╝");

		        	        	     System.out.print("➡️ Please enter your choice (1-6): ");
		        	        	     int book = sc.nextInt();

		        	        	     String[] bookroom = {"Deluxe Room", "AC Room", "Non-AC Room", "Luxury Room"};

		        	        	     if (book >= 1 && book <= 4) {
		        	        	         System.out.println("You selected: " + bookroom[book - 1]);
		        	        	     } else if (book == 5) {
		        	        	         System.out.println("🔙 Returning to Main Menu...");
		        	        	         backToRoomMenu = true;
		        	        	         continue;
		        	        	     } else {
		        	        	         System.out.println("❌ Invalid option. Please select from 1 to 5.");
		        	        	         continue;
		        	        	     }
		        	        	     

		        	        	     switch (book) {
		        	        	         case 1:
		        	        	        	int  totalRoomsBooked = 0;
		        	        	        	 
		        	        	        	 
		        	        	        	 int[] delu = {2700, 3500, 4500};

		        	        	        	 totalRoomsBooked = 0;
		        	        	        	 System.out.print("🛎️ How many Deluxe Rooms do you want to book? ");
		        	        	        	 int howmuch = sc.nextInt();

		        	        	        	 int totalDeluxe = 0;
		        	        	        	
		        	        	        	 int[] sharedeluxe = new int[howmuch];
		        	        	        	 int[] floordeluxe = new int[howmuch];
		        	        	        	 int[] bookedDeluxeRoom = new int[howmuch];

		        	        	        	 for (int i = 0; i < howmuch; i++) {
		        	        	        	     int shares = 0;
		        	        	        	     while (true) {
		        	        	        	         System.out.print("\n➡️ Enter sharing type for Room " + (i + 1) + " (2/3/4): ");
		        	        	        	         shares = sc.nextInt();
		        	        	        	         if (shares == 2 || shares == 3 || shares == 4) break;
		        	        	        	         System.out.println("⚠️ Invalid sharing type! Please enter 2, 3, or 4.");
		        	        	        	     }

		        	        	        	     int shareIndex = shares - 2;
		        	        	        	     sharedeluxe[i] = shares;

		        	        	        	     System.out.println("✅ You selected " + shares + "-sharing for Room " + (i + 1));
		        	        	        	     System.out.println("💰 Price for " + shares + "-sharing Deluxe Room: ₹" + delu[shareIndex]);

		        	        	        	     boolean roomAvailable = false;
		        	        	        	     for (int floor = 0; floor < 4; floor++) {
		        	        	        	         System.out.print("🛏️ Floor " + (floor + 1) + ": ");
		        	        	        	         boolean found = false;
		        	        	        	         for (int roomNum = 0; roomNum < 8; roomNum++) {
		        	        	        	             if (hotel[floor][roomNum].equalsIgnoreCase("Deluxe Room") &&
		        	        	        	                 roomSharing[floor][roomNum] == shares &&
		        	        	        	                 !isbooked[floor][roomNum]) {

		        	        	        	                 int roomNumber = (floor + 1) * 100 + (roomNum + 1);
		        	        	        	                 System.out.print("[Room No. " + roomNumber + "] ");
		        	        	        	                 found = true;
		        	        	        	                 roomAvailable = true;
		        	        	        	             }
		        	        	        	         }
		        	        	        	         if (!found) System.out.print("No available rooms.");
		        	        	        	         System.out.println();
		        	        	        	     }

		        	        	        	     if (!roomAvailable) {
		        	        	        	         System.out.println("⚠️ Sorry, no Deluxe Rooms available for " + shares + "-sharing.");
		        	        	        	         i--;
		        	        	        	         continue;
		        	        	        	     }

		        	        	        	     System.out.print("Please enter which floor you want (from available floor): ");
		        	        	        	     int selectedFloor = sc.nextInt();

		        	        	        	     System.out.print("\nDo you want to proceed to book this room? (yes/no): ");
		        	        	        	     String conf = sc.next().toLowerCase().trim();

		        	        	        	     if (conf.equals("yes")) {
		        	        	        	         totalRoomsBooked++;
		        	        	        	         int price = delu[shareIndex];

		        	        	        	         int bookedRoomNumber = 0;
		        	        	        	         outerLoop:
		        	        	        	         for (int floor = 0; floor < 4; floor++) {
		        	        	        	             for (int roomNum = 0; roomNum < 8; roomNum++) {
		        	        	        	                 if (hotel[floor][roomNum].equalsIgnoreCase("Deluxe Room") &&
		        	        	        	                     roomSharing[floor][roomNum] == shares &&
		        	        	        	                     !isbooked[floor][roomNum]) {

		        	        	        	                     bookedRoomNumber = (floor + 1) * 100 + (roomNum + 1);
		        	        	        	                     isbooked[floor][roomNum] = true;
		        	        	        	                     floordeluxe[i] = floor + 1;
		        	        	        	                     break outerLoop;
		        	        	        	                 }
		        	        	        	             }
		        	        	        	         }

		        	        	        	         bookedDeluxeRoom[i] = bookedRoomNumber;

		        	        	        	         System.out.print("Do you want to add 1 extra member to this room? (yes/no): ");
		        	        	        	         String member = sc.next().toLowerCase().trim();

		        	        	        	         if (member.equals("yes")) {
		        	        	        	             System.out.println("Only 1 extra member is allowed per room.");
		        	        	        	             System.out.println("An extra charge of Rs. 500 will apply.");
		        	        	        	             System.out.print("Confirm to add extra member and pay Rs. 500? (yes/no): ");
		        	        	        	             String confirmAdd = sc.next().toLowerCase().trim();

		        	        	        	             if (confirmAdd.equals("yes")) {
		        	        	        	                 price += 500;
		        	        	        	                 System.out.println("✅ Extra member added. Rs. 500 has been added to your bill.");
		        	        	        	             } else {
		        	        	        	                 System.out.println("❌ Extra member not added.");
		        	        	        	             }
		        	        	        	         } else {
		        	        	        	             System.out.println("No extra member added.");
		        	        	        	         }

		        	        	        	         System.out.print("For how many days you want room (Start 1/2): ");
		        	        	        	         double day = sc.nextDouble();

		        	        	        	         System.out.println("✅ Price for Room " + (i + 1) + ": ₹" + price * day);
		        	        	        	         totalDeluxe += price * day;
		        	        	        	         System.out.println("Room " + (i + 1) + " Booked Successfully");
		        	        	        	     } else {
		        	        	        	         System.out.println("❌ Room " + (i + 1) + " not booked.");
		        	        	        	         i--;
		        	        	        	     }
		        	        	        	 }

		        	        	        	 sc.nextLine();
		        	        	        	 System.out.printf(" %-15s : ₹%-34.2f \n", "Total Bill", (double) totalDeluxe);
		        	        	        	

		        	        	        	 if (totalDeluxe >= 7500 && totalDeluxe <= 9000) {
		        	        	        	     System.out.println("🎉 Congratulations! You will get 10% discount.");
		        	        	        	     totalDeluxe -= (10 * totalDeluxe) / 100;
		        	        	        	     System.out.printf(" %-15s : ₹%-34.2f \n", "Discounted Bill", (double) totalDeluxe);

		        	        	        	 } else if (totalDeluxe > 9000) {
		        	        	        	     System.out.println("🎉 Congratulations! You will get 15% discount.");
		        	        	        	     totalDeluxe -= (15 * totalDeluxe) / 100;
		        	        	        	     System.out.printf(" %-15s : ₹%-34.2f \n", "Discounted Bill", (double) totalDeluxe);

		        	        	        	 } else {
		        	        	        	     System.out.println("ℹ️ No discount applicable.");
		        	        	        	 }

		        	        	        	 System.out.print("\n👤 Enter Your Full Name        : ");
		        	        	        	 String customerName = sc.nextLine().toUpperCase();

		        	        	        	 System.out.print("🆔 Enter Your Aadhaar Number   : ");
		        	        	        	 String aadhaarNo = sc.nextLine();

		        	        	        	 System.out.print("📞 Enter Your Mobile Number    : ");
		        	        	        	 long mobileNo = sc.nextLong();

		        	        	        	 System.out.println("\n\n╔════════════════════════════════════════════════════════════╗");
		        	        	        	 System.out.println("║                     🧾 SUNSET PALACE HOTEL BILL             ║");
		        	        	        	 System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	        	 System.out.printf("║ %-15s : %-35s ║\n", "Customer Name", customerName);
		        	        	        	 System.out.printf("║ %-15s : %-35s ║\n", "Aadhaar Number", aadhaarNo);
		        	        	        	 System.out.printf("║ %-15s : %-35d ║\n", "Mobile Number", mobileNo);
		        	        	        	 System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	        	 System.out.printf("║ %-19s : %-35d ║\n", "Total Rooms Booked", totalRoomsBooked);
		        	        	        	 System.out.printf("║ %-15s : %-35s ║\n", "Room Type", "Deluxe Room");

		        	        	        	 for (int i = 0; i < howmuch; i++) {
		        	        	        	     System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	        	     System.out.printf("║ %-15s : %-35d ║\n", "Room No", bookedDeluxeRoom[i]);
		        	        	        	     System.out.printf("║ %-15s : %-35d ║\n", "Floor", floordeluxe[i]);
		        	        	        	     System.out.printf("║ %-15s : %-35s ║\n", "Sharing", sharedeluxe[i] + "-Sharing");
		        	        	        	 }

		        	        	        	 System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	        	 System.out.printf("║ %-15s : ₹%-34.2f ║\n", "Total Bill", (double) totalDeluxe);
		        	        	        	 System.out.println("╚════════════════════════════════════════════════════════════╝");

		        	        	        	 System.out.println("\n✅ Thank you for choosing SUNSET PALACE HOTEL!");
		        	        	        	 System.out.println("Visit again !!!");
		        	        	        	 
		        	        	        	 break;
		        	        	        	 
		        	        	         case 2:
		        	        	        	int shares=0;
		        	        	        	 int  userFloor;
		        	        	        	  totalRoomsBooked = 0;
		        	                
		        	                	 int[] avaiac = {2, 3, 4};
	        	        	             int[] ac = {1600, 2200, 3100};

	        	        	             System.out.print("🛎️ How many AC Rooms do you want to book? ");
	        	        	             int howmanys = sc.nextInt();

	        	        	             int totalAC = 0;
	        	        	             int[] shareArr = new int[howmanys];
	        	        	             int[] floorArr = new int[howmanys];
	        	        	             int[] bookedRoomNums = new int[howmanys];

	        	        	             for (int i = 0; i < howmanys; i++) {
	        	        	                  shares = 0;
	        	        	                 while (true) {
	        	        	                     System.out.print("\n➡️ Enter sharing type for Room " + (i + 1) + " (2/3/4): ");
	        	        	                     shares = sc.nextInt();
	        	        	                     if (shares == 2 || shares == 3 || shares == 4) break;
	        	        	                     System.out.println("⚠️ Invalid sharing type! Please enter 2, 3, or 4.");
	        	        	                 }
	        	        	                 int shareIndex = shares - 2;
	        	        	                 shareArr[i] = shares;

	        	        	                 System.out.println("✅ You selected " + shares + "-sharing for Room " + (i + 1));
	        	        	                 System.out.println("💰 Price for " + shares + "-sharing AC Room: ₹" + ac[shareIndex]);

	        	        	                 
	        	        	                 boolean roomAvailable = false;
	        	        	                 for (int floor = 0; floor < 4; floor++) {
	        	        	                     System.out.print("🛏️ Floor " + (floor + 1) + ": ");
	        	        	                     boolean found = false;

	        	        	                     for (int roomNum = 0; roomNum < 8; roomNum++) {
	        	        	                         if (hotel[floor][roomNum].equalsIgnoreCase("AC Room") &&
	        	        	                             roomSharing[floor][roomNum] == shares &&
	        	        	                             !isbooked[floor][roomNum]) {

	        	        	                             int roomNumber = (floor + 1) * 100 + (roomNum + 1);
	        	        	                             System.out.print("[Room No. " + roomNumber + "] ");
	        	        	                             found = true;
	        	        	                             roomAvailable = true;
	        	        	                         }
	        	        	                     }
	        	        	                     if (!found) {
	        	        	                         System.out.print("No available rooms.");
	        	        	                     }
	        	        	                     System.out.println();
	        	        	                 }

	        	        	                 if (!roomAvailable) {
	        	        	                     System.out.println("⚠️ Sorry, no AC Rooms available for " + shares + "-sharing.");
	        	        	                     i--;
	        	        	                     continue;
	        	        	                 }
	        	        	                 
	        	        	                 System.out.print("Please enter which floor you want (from available floor): ");
	        	        	        	     int selectedFloor = sc.nextInt();


	        	        	                 System.out.print("\nDo you want to proceed to book this room? (yes/no): ");
	        	        	                 String conf = sc.next().toLowerCase().trim();

	        	        	                 if (conf.equals("yes")) {
	        	        	                	 totalRoomsBooked++;
	        	        	                     int price = ac[shareIndex];

	        	        	                     // Book room
	        	        	                     int bookedRoomNumber = 0;
	        	        	                     outerLoop:
	        	        	                     for (int floor = 0; floor < 4; floor++) {
	        	        	                         for (int roomNum = 0; roomNum < 8; roomNum++) {
	        	        	                             if (hotel[floor][roomNum].equalsIgnoreCase("AC Room") &&
	        	        	                                 roomSharing[floor][roomNum] == shares &&
	        	        	                                 !isbooked[floor][roomNum]) {

	        	        	                                 bookedRoomNumber = (floor + 1) * 100 + (roomNum + 1);
	        	        	                                 isbooked[floor][roomNum] = true;
	        	        	                                 floorArr[i] = floor + 1; // Save floor
	        	        	                                 break outerLoop;
	        	        	                             }
	        	        	                         }
	        	        	                     }
	        	        	                     bookedRoomNums[i] = bookedRoomNumber;

	        	        	                    
	        	        	                     System.out.print("Do you want to add 1 extra member to this room? (yes/no): ");
	        	        	                     String member = sc.next().toLowerCase().trim();

	        	        	                     if (member.equals("yes")) {
	        	        	                         System.out.println("Only 1 extra member is allowed per room.");
	        	        	                         System.out.println("An extra charge of Rs. 500 will apply.");
	        	        	                         System.out.print("Confirm to add extra member and pay Rs. 500? (yes/no): ");
	        	        	                         String confirmAdd = sc.next().toLowerCase().trim();

	        	        	                         if (confirmAdd.equals("yes")) {
	        	        	                             price += 500;
	        	        	                             System.out.println("✅ Extra member added. Rs. 500 has been added to your bill.");
	        	        	                         } else {
	        	        	                             System.out.println("❌ Extra member not added.");
	        	        	                         }
	        	        	                     } else {
	        	        	                         System.out.println("No extra member added.");
	        	        	                     }

	        	        	                     System.out.print("For how many days you want room (Start 1/2): ");
	        	        	                     double day = sc.nextDouble();

	        	        	                     System.out.println("✅ Price for Room " + (i + 1) + ": ₹" + price * day);
	        	        	                     totalAC += price * day;
	        	        	                     System.out.println("Room "+(i+1)+"Book Succesfully");
	        	        	                 } else {
	        	        	                     System.out.println("❌ Room " + (i + 1) + " not booked.");
	        	        	                     i--;
	        	        	                 }
	        	        	             }
	        	        	                 sc.nextLine();
	        	        	                 
	        	        	                 System.out.printf(" %-15s : ₹%-34.2f \n", "Total Bill", (double) totalAC);

	        	        	                 if (totalAC >= 7500 && totalAC <= 9000) {
	        	        	                     System.out.println("🎉 Congratulations! You will get 10% discount.");
	        	        	                     totalAC -= (10 * totalAC) / 100;
	        	        	                     System.out.printf(" %-15s : ₹%-34.2f \n", "Discounted Bill", (double) totalAC);

	        	        	                 } else if (totalAC > 9000) {
	        	        	                     System.out.println("🎉 Congratulations! You will get 15% discount.");
	        	        	                     totalAC -= (15 * totalAC) / 100;
	        	        	                     System.out.printf(" %-15s : ₹%-34.2f \n", "Discounted Bill", (double) totalAC);

	        	        	                 } else {
	        	        	                     System.out.println("ℹ️ No discount applicable.");
	        	        	                 }
	        	        	                 
	        	        	                 System.out.printf(" %-15s : ₹%-34.2f \n", "Total Bill", (double) totalAC);
	        	        	                 System.out.println("Please enter given details to proceed bill");

	        	        	                 System.out.print("\n👤 Enter Your Full Name        : ");
	        	        	                 String customerNames = sc.nextLine().toUpperCase();

	        	        	                 System.out.print("🆔 Enter Your Aadhaar Number   : ");
	        	        	                 String aadhaarno = sc.nextLine();

	        	        	                 System.out.print("📞 Enter Your Mobile Number    : ");
	        	        	                 long mobileno = sc.nextLong();

	        	        	                
	        	        	                       
	        	        	                         
	        	        	                     
	        	   
	        	        	             

	        	        	                 System.out.println("\n\n╔════════════════════════════════════════════════════════════╗");
	        	        	                 System.out.println("║                     🧾 SUNSET PALACE HOTEL BILL             ║");
	        	        	                 System.out.println("╠════════════════════════════════════════════════════════════╣");

	        	        	                 System.out.printf("║ %-15s : %-35s ║\n", "Customer Name", customerNames);
	        	        	                 System.out.printf("║ %-15s : %-35s ║\n", "Aadhaar Number", aadhaarno);
	        	        	                 System.out.printf("║ %-15s : %-35d ║\n", "Mobile Number", mobileno);

	        	        	                 System.out.println("╠════════════════════════════════════════════════════════════╣");
	        	        	                 System.out.printf("║ %-19s : %-35d ║\n", "Total Rooms Booked", totalRoomsBooked);
	        	        	                 System.out.printf("║ %-15s : %-35s ║\n", "Room Type", "AC Room");

	        	        	                 for (int i = 0; i < howmanys; i++) {
	        	        	                     System.out.println("╠════════════════════════════════════════════════════════════╣");
	        	        	                     System.out.printf("║ %-15s : %-35d ║\n", "Room No", bookedRoomNums[i]);
	        	        	                     System.out.printf("║ %-15s : %-35d ║\n", "Floor", floorArr[i]);
	        	        	                     System.out.printf("║ %-15s : %-35s ║\n", "Sharing", shareArr[i] + "-Sharing");
	        	        	                 }

	        	        	                 System.out.println("╠════════════════════════════════════════════════════════════╣");
	        	        	                 System.out.printf("║ %-15s : ₹%-34.2f ║\n", "Total Bill", (double) totalAC);
	        	        	                 System.out.println("╚════════════════════════════════════════════════════════════╝");

	        	        	                 System.out.println("\n✅ Thank you for choosing SUNSET PALACE HOTEL!");
	        	        	                 System.out.println("Visit again !!!");        	        	             
	        	        	     
	        	        	 
	        	      
	        	        	         break;
	        	        	         
		        	        	         case 3:
		        	        	         
		        	        	        		shares=0;
			        	        	        	   userFloor=0;
			        	        	        	  totalRoomsBooked = 0;
			        	                
			        	                	 int[] avainonac = {2, 3, 4};
		        	        	             int[] nonac = {1600, 2200, 3100};

		        	        	             System.out.print("🛎️ How many Non-AC Rooms do you want to book? ");
		        	        	              howmuch = sc.nextInt();

		        	        	             int totalnonAC = 0;
		        	        	             int[] sharenon = new int[howmuch];
		        	        	             int[] floornon = new int[howmuch];
		        	        	             int[] bookedroomNums = new int[howmuch];

		        	        	             for (int i = 0; i < howmuch; i++) {
		        	        	                  shares = 0;
		        	        	                 while (true) {
		        	        	                     System.out.print("\n➡️ Enter sharing type for Room " + (i + 1) + " (2/3/4): ");
		        	        	                     shares = sc.nextInt();
		        	        	                     if (shares == 2 || shares == 3 || shares == 4) break;
		        	        	                     System.out.println("⚠️ Invalid sharing type! Please enter 2, 3, or 4.");
		        	        	                 }
		        	        	                 int shareIndex = shares - 2;
		        	        	                 sharenon[i] = shares;

		        	        	                 System.out.println("✅ You selected " + shares + "-sharing for Room " + (i + 1));
		        	        	                 System.out.println("💰 Price for " + shares + "-sharing Non-AC Room: ₹" + nonac[shareIndex]);

		        	        	                
		        	        	                 boolean roomAvailable = false;
		        	        	                 for (int floor = 0; floor < 4; floor++) {
		        	        	                     System.out.print("🛏️ Floor " + (floor + 1) + ": ");
		        	        	                     boolean found = false;

		        	        	                     for (int roomNum = 0; roomNum < 8; roomNum++) {
		        	        	                         if (hotel[floor][roomNum].equalsIgnoreCase("Non-"
		        	        	                         		+ "AC Room") &&
		        	        	                             roomSharing[floor][roomNum] == shares &&
		        	        	                             !isbooked[floor][roomNum]) {

		        	        	                             int roomNumber = (floor + 1) * 100 + (roomNum + 1);
		        	        	                             System.out.print("[Room No. " + roomNumber + "] ");
		        	        	                             found = true;
		        	        	                             roomAvailable = true;
		        	        	                         }
		        	        	                     }
		        	        	                     if (!found) {
		        	        	                         System.out.print("No available rooms.");
		        	        	                     }
		        	        	                     System.out.println();
		        	        	                 }

		        	        	                 if (!roomAvailable) {
		        	        	                     System.out.println("⚠️ Sorry, no Non-AC Rooms available for " + shares + "-sharing.");
		        	        	                     i--;
		        	        	                     continue;
		        	        	                 }
		        	        	                 
		        	        	                 System.out.print("Please enter which floor you want (from available floor): ");
		        	        	        	     int selectedFloor = sc.nextInt();

		        	        	                 System.out.print("\nDo you want to proceed to book this room? (yes/no): ");
		        	        	                 String conf = sc.next().toLowerCase().trim();

		        	        	                 if (conf.equals("yes")) {
		        	        	                	 totalRoomsBooked++;
		        	        	                     int price = nonac[shareIndex];

		        	        	                     
		        	        	                     int bookedRoomNumber = 0;
		        	        	                     outerLoop:
		        	        	                     for (int floor = 0; floor < 4; floor++) {
		        	        	                         for (int roomNum = 0; roomNum < 8; roomNum++) {
		        	        	                             if (hotel[floor][roomNum].equalsIgnoreCase("Non-AC Room") &&
		        	        	                                 roomSharing[floor][roomNum] == shares &&
		        	        	                                 !isbooked[floor][roomNum]) {

		        	        	                                 bookedRoomNumber = (floor + 1) * 100 + (roomNum + 1);
		        	        	                                 isbooked[floor][roomNum] = true;
		        	        	                                 floornon[i] = floor + 1; 
		        	        	                                 break outerLoop;
		        	        	                             }
		        	        	                         }
		        	        	                     }
		        	        	                     bookedroomNums[i] = bookedRoomNumber;

		        	        	                    
		        	        	                     System.out.print("Do you want to add 1 extra member to this room? (yes/no): ");
		        	        	                     String member = sc.next().toLowerCase().trim();

		        	        	                     if (member.equals("yes")) {
		        	        	                         System.out.println("Only 1 extra member is allowed per room.");
		        	        	                         System.out.println("An extra charge of Rs. 500 will apply.");
		        	        	                         System.out.print("Confirm to add extra member and pay Rs. 500? (yes/no): ");
		        	        	                         String confirmAdd = sc.next().toLowerCase().trim();

		        	        	                         if (confirmAdd.equals("yes")) {
		        	        	                             price += 500;
		        	        	                             System.out.println("✅ Extra member added. Rs. 500 has been added to your bill.");
		        	        	                         } else {
		        	        	                             System.out.println("❌ Extra member not added.");
		        	        	                         }
		        	        	                     } else {
		        	        	                         System.out.println("No extra member added.");
		        	        	                     }

		        	        	                     System.out.print("For how many days you want room (Start 1/2): ");
		        	        	                     double day = sc.nextDouble();

		        	        	                     System.out.println("✅ Price for Room " + (i + 1) + ": ₹" + price * day);
		        	        	                     totalnonAC += price * day;
		        	        	                     System.out.println("Room "+(i+1)+"Book Succesfully");
		        	        	                 } else {
		        	        	                     System.out.println("❌ Room " + (i + 1) + " not booked.");
		        	        	                     i--;
		        	        	                 }
		        	        	             }
		        	        	             System.out.printf(" %-15s : ₹%-34.2f \n", "Total Bill", (double) totalnonAC);
		        	        	             System.out.println("Please Enter given details to proceed bill ");
		        	        	                 sc.nextLine();

		        	        	                 System.out.print("\n👤 Enter Your Full Name        : ");
		        	        	                 String customer = sc.nextLine().toUpperCase();

		        	        	                 System.out.print("🆔 Enter Your Aadhaar Number   : ");
		        	        	                 String aadhaarnos = sc.nextLine();

		        	        	                 System.out.print("📞 Enter Your Mobile Number    : ");
		        	        	                 long mobilenos = sc.nextLong();

		        	        	                
		        	        	                       
		        	        	                         
		        	        	                     
		        	   
		        	        	             

		        	        	                 System.out.println("\n\n╔════════════════════════════════════════════════════════════╗");
		        	        	                 System.out.println("║                     🧾 SUNSET PALACE HOTEL BILL             ║");
		        	        	                 System.out.println("╠════════════════════════════════════════════════════════════╣");

		        	        	                 System.out.printf("║ %-15s : %-35s ║\n", "Customer Name", customer);
		        	        	                 System.out.printf("║ %-15s : %-35s ║\n", "Aadhaar Number", aadhaarnos);
		        	        	                 System.out.printf("║ %-15s : %-35d ║\n", "Mobile Number", mobilenos);

		        	        	                 System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	                 System.out.printf("║ %-19s : %-35d ║\n", "Total Rooms Booked", totalRoomsBooked);
		        	        	                 System.out.printf("║ %-15s : %-35s ║\n", "Room Type", "Non-AC Room");

		        	        	                 for (int i = 0; i < howmuch; i++) {
		        	        	                     System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	                     System.out.printf("║ %-15s : %-35d ║\n", "Room No", bookedroomNums[i]);
		        	        	                     System.out.printf("║ %-15s : %-35d ║\n", "Floor", floornon[i]);
		        	        	                     System.out.printf("║ %-15s : %-35s ║\n", "Sharing", sharenon[i] + "-Sharing");
		        	        	                 }

		        	        	                 System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	                 System.out.printf("║ %-15s : ₹%-34.2f ║\n", "Total Bill", (double) totalnonAC);
		        	        	                 System.out.println("╚════════════════════════════════════════════════════════════╝");

		        	        	                 System.out.println("\n✅ Thank you for choosing SUNSET PALACE HOTEL!");
		        	        	                 System.out.println("Visit again !!!");        	        	             
		        	        	     
		        	        	 
		        	      
		        	        	         break;
		        	        	        	 
		        	        	         case 4:
		        	        	         
		        	        	        	  
		        	        	        	 totalRoomsBooked=0;
		        	        	        	 System.out.print("🛎️ How many Luxury Rooms do you want to book? ");
		        	        	        	 howmuch = sc.nextInt();

		        	        	        	 int totallux = 0;
		        	        	        	 int[] availux = {2, 3, 4};
		        	        	        	 int[] nonlux = {1600, 2200, 3100};
		        	        	        	 int[] sharelux = new int[howmuch];
		        	        	        	 int[] floorlux = new int[howmuch]; // fixed: use howmuch instead of floors
		        	        	        	 int[] bookedRoom = new int[howmuch];

		        	        	        	 for (int i = 0; i < howmuch; i++) {
		        	        	        	     shares = 0;
		        	        	        	     while (true) {
		        	        	        	         System.out.print("\n➡️ Enter sharing type for Room " + (i + 1) + " (2/3/4): ");
		        	        	        	         shares = sc.nextInt();
		        	        	        	         if (shares == 2 || shares == 3 || shares == 4) break;
		        	        	        	         System.out.println("⚠️ Invalid sharing type! Please enter 2, 3, or 4.");
		        	        	        	     }
		        	        	        	     int shareIndex = shares - 2;
		        	        	        	     sharelux[i] = shares;

		        	        	        	     System.out.println("✅ You selected " + shares + "-sharing for Room " + (i + 1));
		        	        	        	     System.out.println("💰 Price for " + shares + "-sharing Luxury Room: ₹" + nonlux[shareIndex]);

		        	        	        	     boolean roomAvailable = false;
		        	        	        	     for (int floor = 0; floor < 4; floor++) {
		        	        	        	         System.out.print("🛏️ Floor " + (floor + 1) + ": ");
		        	        	        	         boolean found = false;

		        	        	        	         for (int roomNum = 0; roomNum < 8; roomNum++) {
		        	        	        	             if (hotel[floor][roomNum].equalsIgnoreCase("Luxury Room") &&
		        	        	        	                 roomSharing[floor][roomNum] == shares &&
		        	        	        	                 !isbooked[floor][roomNum]) {

		        	        	        	                 int roomNumber = (floor + 1) * 100 + (roomNum + 1);
		        	        	        	                 System.out.print("[Room No. " + roomNumber + "] ");
		        	        	        	                 found = true;
		        	        	        	                 roomAvailable = true;
		        	        	        	             }
		        	        	        	         }
		        	        	        	         if (!found) {
		        	        	        	             System.out.print("No available rooms.");
		        	        	        	         }
		        	        	        	         System.out.println();
		        	        	        	     }

		        	        	        	     if (!roomAvailable) {
		        	        	        	         System.out.println("⚠️ Sorry, no Luxury Rooms available for " + shares + "-sharing.");
		        	        	        	         i--;
		        	        	        	         continue;
		        	        	        	     }

		        	        	        	     System.out.print("Please enter which floor you want (from avai floor): ");
		        	        	        	     int  floors = sc.nextInt();

		        	        	        	     System.out.print("\nDo you want to proceed to book this room? (yes/no): ");
		        	        	        	     String conf = sc.next().toLowerCase().trim();

		        	        	        	     if (conf.equals("yes")) {
		        	        	        	         totalRoomsBooked++;
		        	        	        	         int price = nonlux[shareIndex];

		        	        	        	         int bookedRoomNumber = 0;
		        	        	        	         outerLoop:
		        	        	        	         for (int floor = 0; floor < 4; floor++) {
		        	        	        	             for (int roomNum = 0; roomNum < 7; roomNum++) {
		        	        	        	                 if (hotel[floor][roomNum].equalsIgnoreCase("Luxury Room") &&
		        	        	        	                     roomSharing[floor][roomNum] == shares &&
		        	        	        	                     !isbooked[floor][roomNum]) {

		        	        	        	                     bookedRoomNumber = (floor + 1) * 100 + (roomNum + 1);
		        	        	        	                     isbooked[floor][roomNum] = true;
		        	        	        	                     floorlux[i] = floor + 1;
		        	        	        	                     break outerLoop;
		        	        	        	                 }
		        	        	        	             }
		        	        	        	         }
		        	        	        	         bookedRoom[i] = bookedRoomNumber;

		        	        	        	         System.out.print("Do you want to add 1 extra member to this room? (yes/no): ");
		        	        	        	         String member = sc.next().toLowerCase().trim();

		        	        	        	         if (member.equals("yes")) {
		        	        	        	             System.out.println("Only 1 extra member is allowed per room.");
		        	        	        	             System.out.println("An extra charge of Rs. 500 will apply.");
		        	        	        	             System.out.print("Confirm to add extra member and pay Rs. 500? (yes/no): ");
		        	        	        	             String confirmAdd = sc.next().toLowerCase().trim();

		        	        	        	             if (confirmAdd.equals("yes")) {
		        	        	        	                 price += 500;
		        	        	        	                 System.out.println("✅ Extra member added. Rs. 500 has been added to your bill.");
		        	        	        	             } else {
		        	        	        	                 System.out.println("❌ Extra member not added.");
		        	        	        	             }
		        	        	        	         } else {
		        	        	        	             System.out.println("No extra member added.");
		        	        	        	         }

		        	        	        	         System.out.print("For how many days you want room (Start 1/2): ");
		        	        	        	         double day = sc.nextDouble();

		        	        	        	         System.out.println("✅ Price for Room " + (i + 1) + ": ₹" + price * day);
		        	        	        	         totallux += price * day;
		        	        	        	         System.out.println("Room " + (i + 1) + " Booked Successfully");
		        	        	        	     } else {
		        	        	        	         System.out.println("❌ Room " + (i + 1) + " not booked.");
		        	        	        	         i--;
		        	        	        	     }
		        	        	        	 
		        	        	        	 sc.nextLine();
		                                   System.out.printf(" %-15s : ₹%-34.2f \n", "Total Bill", (double) totallux);
		                                   

		                                   if (totallux >= 7500 && totallux <= 9000) {
		                                       System.out.println("🎉 Congratulations! You will get 10% discount.");
		                                       totallux -= (10 * totallux) / 100;
		                                   } else if (totallux > 9000) {
		                                       System.out.println("🎉 Congratulations! You will get 15% discount.");
		                                       totallux -= (15 * totallux) / 100;
		                                   } else {
		                                       System.out.println("ℹ️ No discount applicable.");
		                                   }


	}
		        	        	        	 
		        	        	        		
		        	       

		        	        	        	 System.out.print("\n👤 Enter Your Full Name        : ");
		        	        	        	 String customernames = sc.nextLine().toUpperCase();

		        	        	        	 System.out.print("🆔 Enter Your Aadhaar Number   : ");
		        	        	        	 String adhaarnos = sc.nextLine();

		        	        	        	 System.out.print("📞 Enter Your Mobile Number    : ");
		        	        	        	 long mobileNos = sc.nextLong();

		        	        	        	 System.out.println("\n\n╔════════════════════════════════════════════════════════════╗");
		        	        	        	 System.out.println("║                     🧾 SUNSET PALACE HOTEL BILL             ║");
		        	        	        	 System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	        	 System.out.printf("║ %-15s : %-35s ║\n", "Customer Name", customernames);
		        	        	        	 System.out.printf("║ %-15s : %-35s ║\n", "Aadhaar Number", adhaarnos);
		        	        	        	 System.out.printf("║ %-15s : %-35d ║\n", "Mobile Number", mobileNos);
		        	        	        	 System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	        	 System.out.printf("║ %-19s : %-35d ║\n", "Total Rooms Booked", totalRoomsBooked);
		        	        	        	 System.out.printf("║ %-15s : %-35s ║\n", "Room Type", "Luxury Room");

		        	        	        	 for (int i = 0; i < howmuch; i++) {
		        	        	        	     System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	        	     System.out.printf("║ %-15s : %-35d ║\n", "Room No", bookedRoom[i]);
		        	        	        	     System.out.printf("║ %-15s : %-35d ║\n", "Floor", floorlux[i]);
		        	        	        	     System.out.printf("║ %-15s : %-35s ║\n", "Sharing", sharelux[i] + "-Sharing");
		        	        	        	 }

		        	        	        	 System.out.println("╠════════════════════════════════════════════════════════════╣");
		        	        	        	 System.out.printf("║ %-15s : ₹%-34.2f ║\n", "Total Bill", (double) totallux);
		        	        	        	 System.out.println("╚════════════════════════════════════════════════════════════╝");

		        	        	        	 System.out.println("\n✅ Thank you for choosing SUNSET PALACE HOTEL!");
		        	        	        	 System.out.println("Visit again !!!");
		        	        	 
		        	        	        	 break;
		        	        	        	 
		        	        	        
		        	        	             
		        	        	        	 
		        	         case 7:
		        	        	 backToRoomMenu=false;
		        	        	 
		        	             break;
		        	            	
		        	             
		        	     }
		        	        	 }
		        	        	 break;
		        	     }
		        	 }
		        	 break;
		        }
		        
		        	
		        
		        }
		        
		        	

		      
		    }
		
		      

		public static void main(String[] args) {
			 new Hotel().meth1();

		}
	}







