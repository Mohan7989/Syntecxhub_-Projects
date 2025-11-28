package com.mohan.food;

	import java.util.Scanner;

import com.mohan.billing.Billing;
import com.mohan.billing.Prices;

	public class Meals extends Billing {
	    Scanner sc = new Scanner(System.in);

	    public void menu() {
	        while (true) { // Loop so user can order veg & non-veg in one session
	            int vegtotal = super.getSnackTotal();
	            System.out.println();
	            System.out.println("   \n========= 🍱 Meals Menu =========  ");
	            System.out.println("       1. Veg    ");
	            System.out.println("       2. Non-Veg     ");
	            System.out.printf("       3.🔙 Back to Main Menu\n    ");
	            System.out.printf("   4.❌ Exit    ");
	            System.out.println();
	            System.out.print("\nPlease enter your choice: ");

	            int input;
	            try {
	                input = sc.nextInt();
	                sc.nextLine();
	            } catch (Exception e) {
	                System.out.println("❌ Invalid input. Please enter a number (1-4).");
	                sc.nextLine(); // clear invalid input
	                continue;
	            }

	            switch (input) {
	                case 1:
	                    this.veg(); // after veg(), return to menu
	                    break;
	                case 2:
	                    this.nonveg(); // after nonveg(), return to menu
	                    break;
	                case 3:
	                    return; // Back to main menu
	                case 4:
	                    System.out.println("\n👋 Thank you for visiting Sunset Palace Hotel!");
	                    System.out.println("🏨 Have a great day!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("❌ Invalid choice. Please enter 1-4.");
	                    break;
	            }
	        }
	    }

	    public void veg() {
	        Billing bobj = new Billing();
	        Prices priceObj = new Prices();

	        String[] orderedItems = bobj.getOrderedItems();
	        String[] plateTypes = bobj.getPlateTypes();
	        int[] quantities = bobj.getQuantities();
	        int[] itemTotals = bobj.getItemTotals();
	        int orderCount = bobj.getOrderCount();

	        Integer[] vegfu = new Integer[priceObj.getVegfull().length];
	        for (int i = 0; i < priceObj.getVegfull().length; i++) {
	            vegfu[i] = priceObj.getVegfull()[i].equals("-") ? null : Integer.parseInt(priceObj.getVegfull()[i]);
	        }

	        boolean moreItems = true;
	        while (moreItems) {
	            System.out.println("\n=============== 🥗 Veg Menu ===============");
	            System.out.printf("%-5s %-25s %-10s %-10s\n", "ID", "Item", "Half (₹)", "Full (₹)");
	            System.out.println("==========================================================");
	            for (int i = 0; i < priceObj.getVeg().length; i++) {
	                System.out.printf("%-5d %-25s %-10d %-10s\n", (i + 1), priceObj.getVeg()[i],
	                        priceObj.getVegprice()[i], priceObj.getVegfull()[i]);
	            }
	            System.out.println("==========================================");
	            System.out.print("Please Enter Your Choice (1 to " + priceObj.getVeg().length + "): ");

	            int veginput;
	            try {
	                veginput = sc.nextInt();
	                sc.nextLine();
	            } catch (Exception e) {
	                System.out.println("❌ Invalid input. Please enter a number.");
	                sc.nextLine();
	                continue;
	            }

	            if (veginput < 1 || veginput > priceObj.getVeg().length) {
	                System.out.println("❌ Invalid choice.");
	                continue;
	            }

	            String selectedItem = priceObj.getVeg()[veginput - 1];
	            System.out.println("You selected " + selectedItem);

	            if (selectedItem.equalsIgnoreCase("Roti") || selectedItem.equalsIgnoreCase("Chapati")
	                    || selectedItem.equalsIgnoreCase("Veg Thali")) {
	                System.out.print("How many " + selectedItem + " would you like? : ");
	                int qty = sc.nextInt();
	                sc.nextLine();
	                int unitPrice = priceObj.getVegprice()[veginput - 1];
	                int itemTotal = unitPrice * qty;
	                setSnackTotal(getSnackTotal() + itemTotal);
	                System.out.println("✅ You ordered " + qty + " " + selectedItem + "(s) for ₹" + itemTotal);
	                System.out.println("🧾 Current Bill: ₹" + getSnackTotal());

	                orderedItems[orderCount] = selectedItem;
	                setOrderedItems(orderedItems);
	                plateTypes[orderCount] = "PER PIECE";
	                setPlateTypes(plateTypes);
	                quantities[orderCount] = qty;
	                setQuantities(quantities);
	                itemTotals[orderCount] = itemTotal;
	                setItemTotals(itemTotals);
	                orderCount++;
	                setOrderCount(orderCount);

	            } else {
	                while (true) {
	                    System.out.print("Do you want a half plate or full plate? : ");
	                    String fh = sc.nextLine().trim().toLowerCase();
	                    if (fh.equals("half")) {
	                        int price = priceObj.getVegprice()[veginput - 1];
	                        System.out.print("How many half plates of " + selectedItem + "? : ");
	                        int qty = sc.nextInt();
	                        sc.nextLine();
	                        int itemTotal = price * qty;
	                        setSnackTotal(getSnackTotal() + itemTotal);
	                        System.out.println("✅ You ordered " + qty + " half plates of " + selectedItem + " for ₹" + itemTotal);
	                        System.out.println("🧾 Current Bill: ₹" + getSnackTotal());

	                        orderedItems[orderCount] = selectedItem;
	                        plateTypes[orderCount] = "HALF";
	                        quantities[orderCount] = qty;
	                        itemTotals[orderCount] = itemTotal;
	                        setOrderedItems(orderedItems);
	                        setPlateTypes(plateTypes);
	                        setQuantities(quantities);
	                        setItemTotals(itemTotals);
	                        orderCount++;
	                        setOrderCount(orderCount);
	                        break;

	                    } else if (fh.equals("full")) {
	                        if (vegfu[veginput - 1] != null) {
	                            int fullPrice = vegfu[veginput - 1];
	                            System.out.print("How many full plates of " + selectedItem + "? : ");
	                            int qty = sc.nextInt();
	                            sc.nextLine();
	                            int itemTotal = fullPrice * qty;
	                            setSnackTotal(getSnackTotal() + itemTotal);
	                            System.out.println("✅ You ordered " + qty + " full plates of " + selectedItem + " for ₹" + itemTotal);
	                            System.out.println("🧾 Current Bill: ₹" + getSnackTotal());

	                            orderedItems[orderCount] = selectedItem;
	                            plateTypes[orderCount] = "FULL";
	                            quantities[orderCount] = qty;
	                            itemTotals[orderCount] = itemTotal;
	                            setOrderedItems(orderedItems);
	                            setPlateTypes(plateTypes);
	                            setQuantities(quantities);
	                            setItemTotals(itemTotals);
	                            orderCount++;
	                            setOrderCount(orderCount);
	                            break;
	                        } else {
	                            System.out.println("❌ Full plate not available for this item.");
	                        }
	                    } else {
	                        System.out.println("❌ Invalid input. Please enter 'half' or 'full'.");
	                    }
	                }
	            }

	            while (true) {
	                System.out.print("\nDo You Want To Order More Veg Items? (yes/no): ");
	                String input2 = sc.nextLine().trim().toLowerCase();
	                if (input2.equals("yes")) {
	                    moreItems = true;
	                    break;
	                } else if (input2.equals("no")) {
	                    moreItems = false;
	                    setGrandTotal();
	                    printmeals();
	                    break;
	                } else {
	                    System.out.println("❌ Invalid input. Please type 'yes' or 'no'.");
	                }
	            }
	        }
	    }

	    public void nonveg() {
	        Billing bobj = new Billing();
	        Prices priceObj = new Prices();

	        String[] orderedItems = bobj.getOrderedItems();
	        String[] plateTypes = bobj.getPlateTypes();
	        int[] quantities = bobj.getQuantities();
	        int[] itemTotals = bobj.getItemTotals();
	        int orderCount = bobj.getOrderCount();

	        Integer[] nonfull = new Integer[priceObj.getNonfulls().length];
	        for (int i = 0; i < priceObj.getNonfulls().length; i++) {
	            nonfull[i] = (priceObj.getNonfulls()[i] != null && !priceObj.getNonfulls()[i].equals("-"))
	                    ? Integer.parseInt(priceObj.getNonfulls()[i].trim().replaceAll("[^0-9]", ""))
	                    : null;
	        }

	        while (true) {
	            System.out.println("\n================🍗 Non-Veg Menu 🍗================");
	            System.out.printf("%-5s %-25s %-15s %-15s\n", "No.", "Item", "Half Price (₹)", "Full Price (₹)");
	            System.out.println("-------------------------------------------------------------");
	            for (int i = 0; i < priceObj.getNonvegmenu().length; i++) {
	                String item = priceObj.getNonvegmenu()[i];
	                String halfPrice = "₹" + priceObj.getNonhalf()[i];
	                String fullPrice = (nonfull[i] == null) ? "-" : "₹" + nonfull[i];
	                System.out.printf("%-5d %-25s %-15s %-15s\n", (i + 1), item, halfPrice, fullPrice);
	            }
	            System.out.println("=============================================================\n");

	            System.out.print("Please Enter Your Choice (1 to " + priceObj.getNonvegmenu().length + "): ");
	            int nonchoice;
	            try {
	                nonchoice = Integer.parseInt(sc.nextLine().trim());
	            } catch (Exception e) {
	                System.out.println("❌ Invalid input. Please enter a number.");
	                continue;
	            }

	            if (nonchoice < 1 || nonchoice > priceObj.getNonvegmenu().length) {
	                System.out.println("❌ Invalid choice.");
	                continue;
	            }

	            String selectedItem = priceObj.getNonvegmenu()[nonchoice - 1];

	            while (true) {
	                System.out.print("Do you want half plate or full plate? : ");
	                String plateChoice = sc.nextLine().trim().toLowerCase();
	                int itemTotal = 0;

	                if (plateChoice.equals("half")) {
	                    System.out.print("How many half plates of " + selectedItem + "?: ");
	                    int qty = Integer.parseInt(sc.nextLine());
	                    itemTotal = priceObj.getNonhalf()[nonchoice - 1] * qty;
	                    setSnackTotal(getSnackTotal() + itemTotal);
	                    System.out.println("✅ You ordered " + qty + " half plates of " + selectedItem + " for ₹" + itemTotal);

	                    orderedItems[orderCount] = selectedItem;
	                    plateTypes[orderCount] = "HALF";
	                    quantities[orderCount] = qty;
	                    itemTotals[orderCount] = itemTotal;
	                    setOrderedItems(orderedItems);
	                    setPlateTypes(plateTypes);
	                    setQuantities(quantities);
	                    setItemTotals(itemTotals);
	                    orderCount++;
	                    setOrderCount(orderCount);
	                    break;

	                } else if (plateChoice.equals("full")) {
	                    if (nonfull[nonchoice - 1] != null) {
	                        System.out.print("How many full plates of " + selectedItem + "?: ");
	                        int qty = Integer.parseInt(sc.nextLine());
	                        itemTotal = nonfull[nonchoice - 1] * qty;
	                        setSnackTotal(getSnackTotal() + itemTotal);
	                        System.out.println("✅ You ordered " + qty + " full plates of " + selectedItem + " for ₹" + itemTotal);

	                        orderedItems[orderCount] = selectedItem;
	                        plateTypes[orderCount] = "FULL";
	                        quantities[orderCount] = qty;
	                        itemTotals[orderCount] = itemTotal;
	                        setOrderedItems(orderedItems);
	                        setPlateTypes(plateTypes);
	                        setQuantities(quantities);
	                        setItemTotals(itemTotals);
	                        orderCount++;
	                        setOrderCount(orderCount);
	                        break;
	                    } else {
	                        System.out.println("❌ Full plate not available for this item.");
	                    }
	                } else {
	                    System.out.println("❌ Invalid input. Please enter 'half' or 'full'.");
	                }
	            }

	            while (true) {
	                System.out.print("\nDo you want to order more Non-Veg items? (yes/no): ");
	                String more = sc.nextLine().trim().toLowerCase();
	                if (more.equals("yes")) {
	                    break;
	                } else if (more.equals("no")) {
	                    setGrandTotal();
	                    printmeals();
	                    return; // return to menu loop
	                } else {
	                    System.out.println("❌ Invalid input. Please type 'yes' or 'no'.");
	                }
	            }
	        }
	    }
	}


