package homework5.prob4;

public class Item {
	private String itemName;
	private double amount;

	Item(String name, double amt) {
		this.itemName = name;
		this.amount = amt;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
