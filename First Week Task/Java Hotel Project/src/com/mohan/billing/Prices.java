package com.mohan.billing;
	public class Prices {
		private final int[] snackPrices = {50, 50, 40, 20, 50};
		private final String[] snackItems = {
			"Idli Sambar", "Wada Sambar", "Masala Dosa", "Samosa", "French Fries"
		};

		public int getSnackPrice(int index) {
			if (index >= 0 && index < snackPrices.length)
				return snackPrices[index];
			else
				throw new IllegalArgumentException("Invalid index");
		}

		public String getSnackItem(int index) {
			if (index >= 0 && index < snackItems.length)
				return snackItems[index];
			else
				throw new IllegalArgumentException("Invalid index");
		}

		public int getSnackItemCount() {
			return snackItems.length;
		}



	private final String[] veg = {
	        "Veg Thali", "Veg Biryani", "Dal Tadka", "Mix Vegetable Curry", "Paneer Butter Masala",
	        "Matar Paneer", "Palak Paneer", "Chole Masala", "Rajma Curry", "Kadai Paneer",
	        "Shahi Paneer", "Veg Pulao", "Jeera Rice", "Veg Fried Rice", "Vegetable Kofta",
	        "Kaju Curry", "Baingan Bharta", "Cabbage Sabzi", "Lauki Kofta", "Roti", "Chapati"
	    };

	private final Integer[] vegprice = {
	        170, 100, 90, 120, 180, 170, 160, 140, 130, 160,
	        160, 120, 60, 70, 100, 190, 80, 80, 80, 15, 12
	    };

	private final String[] vegfull = {
	        "-", "190", "170", "230", "350", "340", "320", "270", "250", "310",
	        "310", "240", "120", "140", "200", "380", "150", "150", "150", "-", "-"
	    };

	public String[] getVeg() {
		return veg;
	}

	public Integer[] getVegprice() {
		return vegprice;
	}

	public String[] getVegfull() {
		return vegfull;
	}




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

	public String[] getNonvegmenu() {
		return nonvegmenu;
	}

	public void setNonvegmenu(String[] nonvegmenu) {
		this.nonvegmenu = nonvegmenu;
	}

	public Integer[] getNonhalf() {
		return nonhalf;
	}

	public void setNonhalf(Integer[] nonhalf) {
		this.nonhalf = nonhalf;
	}

	public String[] getNonfulls() {
		return nonfulls;
	}

	public void setNonfulls(String[] nonfulls) {
		this.nonfulls = nonfulls;
	}


		
	}











