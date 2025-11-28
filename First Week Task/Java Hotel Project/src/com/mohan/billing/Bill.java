package com.mohan.billing;

	public abstract class Bill {
	    protected int snackTotal = 0;
	    protected int mealsBill = 0;
	    protected float grandTotal;

	    public int getSnackTotal() {
	        return snackTotal;
	    }

	    public void setSnackTotal(int snackTotal) {
	        this.snackTotal = snackTotal;
	    }

	    public int getMealsBill() {
	        return mealsBill;
	    }

	    public void setMealsBill(int mealsBill) {
	        this.mealsBill = mealsBill;
	    }

	    public float getGrandTotal() {
	        return grandTotal;
	    }

	    public void setGrandTotal() {
	        this.grandTotal = snackTotal + mealsBill;  
	    }
	    
	    protected int vegtotal = 0;
	    protected int nontotal = 0;
	    

	    public int getVegtotal() {
			return vegtotal;
		}

		public void setVegtotal(int vegtotal) {
			this.vegtotal = vegtotal;
		}

		public int getNontotal() {
			return nontotal;
		}

		public void setNontotal(int nontotal) {
			this.nontotal = nontotal;
		}
		
		String[] orderedItems = new String[100];
	    String[] plateTypes = new String[100];
	    int[] quantities = new int[100];
	    int[] itemTotals = new int[100];
	    int orderCount = 0;
	    
	    

		public String[] getOrderedItems() {
			return orderedItems;
		}

		public void setOrderedItems(String[] orderedItems) {
			this.orderedItems = orderedItems;
		}

		public String[] getPlateTypes() {
			return plateTypes;
		}

		public void setPlateTypes(String[] plateTypes) {
			this.plateTypes = plateTypes;
		}

		public int[] getQuantities() {
			return quantities;
		}

		public void setQuantities(int[] quantities) {
			this.quantities = quantities;
		}

		public int[] getItemTotals() {
			return itemTotals;
		}

		public void setItemTotals(int[] itemTotals) {
			this.itemTotals = itemTotals;
		}

		public int getOrderCount() {
			return orderCount;
		}

		public void setOrderCount(int orderCount) {
			this.orderCount = orderCount;
		}

		public void setGrandTotal(float grandTotal) {
			this.grandTotal = grandTotal;
		}

		public abstract void printFinalBill();
		
		public abstract void printmeals();
	    
	    
	}


